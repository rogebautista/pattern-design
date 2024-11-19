package org.example.template;
public class TemplatePattern {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();
        System.out.println("..............................");
        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.process();
        System.out.println("..............................");
        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process();
    }
}
