public class CoaterApp {
    
    public static void main(String[] args) {
        
        CoaterData[] dataArray = new CoaterData[10];

        dataArray[0] = new CoaterData(1234, "2024-10-01T13:00:00", 78.9);
        dataArray[1] = new CoaterData(5467, "2024-10-02T13:00:00", 80.0);
        dataArray[2] = new CoaterData(4789, "2024-10-03T13:00:00", 79.1);
        dataArray[3] = new CoaterData(6789, "2024-10-04T13:00:00", 78.9);
        dataArray[4] = new CoaterData(8930, "2024-10-05T13:00:00", 77.9);
        dataArray[5] = new CoaterData(2349, "2024-10-06T13:00:00", 79.7);
        dataArray[6] = new CoaterData(7908, "2024-10-07T13:00:00", 81.2);
        dataArray[7] = new CoaterData(5678, "2024-10-08T13:00:00", 78.5);
        dataArray[8] = new CoaterData(9081, "2024-10-09T13:00:00", 80.1);
        dataArray[9] = new CoaterData(1723, "2024-10-10T13:00:00", 79.8);
    

        for (var data : dataArray ) {
            data.printData();
        }

        ProcessData processor = new ProcessData();
        processor.analyseData(dataArray[0], dataArray[9]);

        ReportType reportType = ReportType.SUMMARY;
        switch (reportType) {
            case SUMMARY:
            new ReportSummary().createReport();
            break;
            case DETAILED:
            System.out.println("Creating detailed Report of coating thickness in month of October");
            break;
            case CUSTOMISED:
            System.out.println("The report is customised");
            break;
        }

        // Demonstrating checked exceptions by throwing and catching CustomCheckedException
        try {
            throw new CustomException("This is a custom checked exception.");
        } catch (CustomException e) {
            System.out.println("Caught CustomCheckedException: " + e.getMessage()); // Print the error message
        }

        // Throwing an unchecked exception (CustomUncheckedException)
        throw new UncheckedExceptionCustom("This is a custom unchecked exception.");
    }    
}
