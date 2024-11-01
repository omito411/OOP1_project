public final class CoaterReportInfo {

    // Private properties
    private final String name;
    private final String createdBy;
    private final String dateTime;

    // Constructor
    public CoaterReportInfo(String name, String createdBy, String dateTime) {
        this.name = name;
        this. createdBy = createdBy;
        this.dateTime = dateTime;
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getCreatedBy(){
        return createdBy;
    }

    public String getDateTime(){
        return dateTime;
    }
    
}
