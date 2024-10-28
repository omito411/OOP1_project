public final class AdditionalData extends InitialData {
    
    public AdditionalData(int batchId, String dateTime) {
        super(batchId, dateTime); // Call superclass constructor
    }

    @Override
    public void printData() {
        System.out.println("Additonal data with batch ID: " + getBatchId() + " and dateTime: " + getDateTime());
    }
}
