import java.util.List;

public final class CoaterReportInfo {

    // Private properties
    private final int reportNumber;
    private final String createdBy;
    private final String dateTime;
    private final List<String> reportDetails;

    // Constructor
    public CoaterReportInfo(int reportNumber, String createdBy, String dateTime, List<String> reportDetails ) {
        this.reportNumber = reportNumber;
        this. createdBy = createdBy;
        this.dateTime = dateTime;
        this.reportDetails = List.copyOf(reportDetails); // defensive copy 
    }

    // Getters

    public int getReportNumber() {
        return reportNumber;
    }

    public String getCreatedBy(){
        return createdBy;
    }

    public String getDateTime(){
        return dateTime;
    }

    public List<String> getReportDetails() {
        return reportDetails;
    }

    @Override
    public String toString() {
        return "Coater Report{" + "report number=" + reportNumber + ", created by='" + createdBy + '\'' + ", created on='" + dateTime + '\'' + ", report details=" + reportDetails + '}';
    }
    
}
