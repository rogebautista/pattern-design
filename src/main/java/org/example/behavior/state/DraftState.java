package org.example.behavior.state;

class DraftState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering document in Draft mode.");
    }

    @Override
    public void publish(Document document) {
        document.setState(new ModerationState());
        System.out.println("Document sent to moderation.");
    }
}
