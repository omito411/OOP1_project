public class InitialData {
    //private attribute to demonstrate encapsulation
    private int batchId;
    private String dateTime;


    // Default constructor using this() to call the parameterised constructor
    public InitialData() {
        this(0, "2024-10-01T12:00:00"); // Default values for batchId and dateTime
    }

    // Parameterised constructor for initializing batchId and dateTime
    public InitialData(int batchId, String dateTime) {
        this.batchId = batchId;
        this.dateTime = dateTime;
        
    } 

    // Getters for batchId and dateTime
    public int getBatchId() {
        return batchId;
    }

    public String getDateTime() {
        return dateTime;
    }

    //Setters for batchId and dateTime
    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    //Method to print the initial data (batchId and dateTime)
    public void printData() {
        System.out.println("Batch number: " + this.batchId);
        System.out.println("DateTime : " + this.batchId);
    }
}