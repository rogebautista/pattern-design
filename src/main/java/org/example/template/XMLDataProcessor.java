package org.example.template;

class XMLDataProcessor extends DataProcessor {
    @Override
    protected void loadData() {
        System.out.println("Loading XML data...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing XML data...");
    }
}
