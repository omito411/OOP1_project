public class SecondaryData {
    
    //Method to modify coating thickness of the primary data source ProcessData
    public static void modifyData(CoaterData data) {
        data.setCoatingThickness(80.0); 
    }

    // Method that shows defensive copying to avoid modifying the primary object.
    public static CoaterData GMPmodifiedData(CoaterData data) {
        // New copy of the data object to prevent modifyin the primary data
        CoaterData copy = new CoaterData(data.getBatchId(), data.getDateTime(), data.getCoatingThickess());
        copy.setCoatingThickness(80.0); // Modify the copy
        return copy; // Return the modified copy
    }
}
