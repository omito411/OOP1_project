public interface CreateReport {
    
    // Interface method to generate a report, implemented by concrete classes
    //void createReport();

    //Static method to log creation
    static void logReportCreation(String reportType) {
        System.out.println("Logging: Creating coater report " + reportType);
    }

    //Default method that produces a generic report 
    default void generateGenericReport() {
        logReportCreation("generic");
        formatReport(); // Private method called within default method
        System.out.println("Generic report created");
    }

    //Private method to be used inside the default method
    private void formatReport() {
        System.out.println("Formatting report...");
    } 

    void createReport();
}
