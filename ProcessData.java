public class ProcessData {
    
    public void loadBatch(int batchId, String dateTime, double coatingThickness) {
        System.out.println("Loading batch number: " + batchId );
    }

    public void loadBatch(CoaterData[] data) {
        System.out.println("Loading batch data entries");

        for (CoaterData input : data) {
            input.printData();
        }
    }

    public void analyseData(CoaterData... dataInputs) {
        System.out.println("Analysing batch data inputs");

        for (var input : dataInputs) {
            input.printData();
        }
    }
}
