package org.example.behavior.state;

class ModerationState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Document under moderation, cannot render.");
    }

    @Override
    public void publish(Document document) {
        document.setState(new PublishedState());
        System.out.println("Document approved and published.");
    }
}
