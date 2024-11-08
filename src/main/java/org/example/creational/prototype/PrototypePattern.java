package org.example.creational.prototype;

public class PrototypePattern {
    public static void main(String[] args) {

        PrototypeManager manager = new PrototypeManager();

        ResumeDocument resumePrototype = new ResumeDocument();
        ReportDocument reportPrototype = new ReportDocument();
        manager.addPrototype("resume", resumePrototype);
        manager.addPrototype("report", reportPrototype);

        
        ResumeDocument newResume = (ResumeDocument) manager.getPrototype("resume");
        if (newResume != null) {
            newResume.setContent("Resume");
            System.out.println(newResume);
        }

        ReportDocument newReport = (ReportDocument) manager.getPrototype("report");
        if (newReport != null) {
            newReport.setContent("Report");
            System.out.println(newReport);
        }


    }
}

