import java.util.List;


public class CoaterApp {
    
    public static void main(String[] args) {
        try {
            // Creating data objects for thickness and homogeneity
            List<InitialData> dataList = List.of(
                new CoaterData(1234, "2024-10-01T13:00:00", 79.9),
                new CoaterData(5467, "2024-10-02T13:00:00", 80.0),
                new CoaterData(4789, "2024-10-03T13:00:00", 79.1),
                new CoaterData(6789, "2024-10-04T13:00:00", 78.9),
                
                new AdditionalData(1234, "2024-10-01T13:00:00", 99.0),
                new AdditionalData(5467, "2024-10-02T13:00:00", 98.7),
                new AdditionalData(4789, "2024-10-03T13:00:00", 99.4),
                new AdditionalData(6789, "2024-10-04T13:00:00", 99.6)
            );

            // Print data
            System.out.println("Printing Data Inputs:");
            dataList.forEach(InitialData::printData);
           

            // Analyse the coating thickness and homogeneity data using varags with ProcessData
            ProcessData processor = new ProcessData();
            processor.DataAnalysis(dataList.toArray(new InitialData[0]));

            // Calculate averages for CoaterData and AdditionalData
            double avgCoatingThickness = dataList.stream()
                    .filter(data -> data instanceof CoaterData)
                    .mapToDouble(data -> ((CoaterData) data).getCoatingThickess())
                    .average()
                    .orElse(0.0);

            double avgHomogeneity = dataList.stream()
                    .filter(data -> data instanceof AdditionalData)
                    .mapToDouble(data -> ((AdditionalData) data).getHomogeneityData())
                    .average()
                    .orElse(0.0);

            CoaterSummary thicknessSummary = new CoaterSummary(1, "2024-10-10T15:00:00", avgCoatingThickness);
            HomogeneitySummary homogeneitySummary = new HomogeneitySummary(2, "2024-10-10T15:05:00", avgHomogeneity);

            System.out.println("\nCoating Thickness Summary: " + thicknessSummary);
            System.out.println("Homogeneity Summary: " + homogeneitySummary);

            // Demonstrate call-by-value and defensive copying
            CoaterData originalData = (CoaterData) dataList.get(0);
            System.out.println("\nOriginal Coater Data:");
            originalData.printData();

            DataCorrection(originalData);
            System.out.println("After correction:");
            originalData.printData();

            CoaterData copyData = originalData.createCopy();
            DataCorrection(copyData);
            System.out.println("After modifying correction copy:");
            originalData.printData();

        } catch (ProcessDataException | InvalidCoatingThicknessException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Demonstrating call-by-value correction
    public static void DataCorrection(CoaterData data) {
        data.setCoatingThickness(80.0);
    }
}
