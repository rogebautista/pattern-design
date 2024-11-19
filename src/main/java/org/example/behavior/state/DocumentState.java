package org.example.behavior.state;

interface DocumentState {
    void render();
    void publish(Document document);
}
