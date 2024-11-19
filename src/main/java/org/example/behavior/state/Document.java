package org.example.behavior.state;

class Document {
    private DocumentState state;

    public Document() {
        this.state = new DraftState();  // Initial state
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void render() {
        state.render();
    }

    public void publish() {
        state.publish(this);
    }
}
