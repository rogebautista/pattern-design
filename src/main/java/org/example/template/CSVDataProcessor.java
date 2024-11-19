package org.example.template;

class CSVDataProcessor extends DataProcessor {
    @Override
    protected void loadData() {
        System.out.println("Loading CSV data...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data...");
    }
}
