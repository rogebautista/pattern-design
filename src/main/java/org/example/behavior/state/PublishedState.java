package org.example.behavior.state;

class PublishedState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering published document.");
    }

    @Override
    public void publish(Document document) {
        System.out.println("Document is already published.");
    }
}
