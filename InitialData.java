public abstract sealed class InitialData permits CoaterData, AdditionalData {
    //Sealed to restrict which class can extend it

    //private attribute to demonstrate encapsulation
    // variables
    private final int batchId;
    private final String dateTime;
    private final CoaterDataType dataType;


   /*  // Constructor using this() to call the parameterised constructor
    public InitialData() {
        this(0000, "2024-10-01T12:00:00"); // Default values for batchId and dateTime
    } */

    // Constructor to initializing batchId and dateTime
    public InitialData(int batchId, String dateTime, CoaterDataType dataType) {
        this.batchId = batchId;
        this.dateTime = dateTime;
        this.dataType = dataType;
    
        
    } 

    // Getters for batchId and dateTime
    public int getBatchId() {
        return batchId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public CoaterDataType getDataType(){
        return dataType;
    }

    
    // Abstract method to be implemented by subclasses
    public abstract void printData();

   /*  //Setters for batchId and dateTime
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
    } */
}
