package org.example.behavior.state;

public class StatePattern {
    public static void main(String[] args) {
        Document document = new Document();

        document.render();  // Draft state
        document.publish(); // Transitions to Moderation state

        document.render();  // Moderation state
        document.publish(); // Transitions to Published state

        document.render();  // Published state
        document.publish(); // Already published, no state change
    }
}
