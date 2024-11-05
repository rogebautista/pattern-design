package org.example.creational.prototype;

public class ResumeDocument implements DocumentPrototype{
    private String content;
    private String format;
    private String font;

    public ResumeDocument() {
        this.content = "Resume Template";
        this.format = "A4";
        this.font = "Arial";
    }

    @Override
    public DocumentPrototype clone() {
        ResumeDocument newDoc = new ResumeDocument();
        newDoc.content = this.content;
        newDoc.format = this.format;
        newDoc.font = this.font;
        return newDoc;
    }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }

    public String getFont() { return font; }
    public void setFont(String font) { this.font = font; }

    @Override
    public String toString() {
        return "Document Type: Resume, Content: " + content + ", Format: " + format + ", Font: " + font;
    }
}
