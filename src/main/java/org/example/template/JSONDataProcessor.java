package org.example.template;

class JSONDataProcessor extends DataProcessor {
    @Override
    protected void loadData() {
        System.out.println("Loading JSON data...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON data...");
    }
}
