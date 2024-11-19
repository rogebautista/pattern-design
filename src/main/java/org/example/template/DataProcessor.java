package org.example.template;

abstract class DataProcessor {
    public final void process() {
        loadData();
        parseData();
        processData();
        saveData();
    }

    protected abstract void loadData();
    protected abstract void parseData();
    protected void processData() {
        System.out.println("Processing data... Jejejejeje");
        System.out.println("Transformar...");
    }
    protected void saveData() {
        System.out.println("Saving processed data...");
    }
}
