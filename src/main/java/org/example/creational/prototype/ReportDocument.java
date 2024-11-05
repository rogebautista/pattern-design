package org.example.creational.prototype;

public class ReportDocument implements DocumentPrototype {
    private String content;
    private String format;
    private String font;

    public ReportDocument() {
        this.content = "Report Template";
        this.format = "Letter";
        this.font = "Times New Roman";
    }

    @Override
    public DocumentPrototype clone() {
        ReportDocument newDoc = new ReportDocument();
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
        return "Document Type: Report, Content: " + content + ", Format: " + format + ", Font: " + font;
    }
}
