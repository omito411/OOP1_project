public final class AdditionalData extends InitialData {
    private double homogeneityData;
    
    public AdditionalData(int batchId, String dateTime, double homogeneityData) {
        super(batchId, dateTime, CoaterDataType.HOMOGENEITY); // Call superclass constructor
        this.homogeneityData = homogeneityData;
    }

    public double getHomogeneityData() {
        return homogeneityData;
    }

    public void setHomogeneityData(double homogeneity) {
        if (homogeneity < 0 || homogeneity > 100) {
            throw new InvalidCoatingThicknessException("Homogeneity data must be between 0 and 100. ");
        }
        this.homogeneityData = homogeneity;
    }

    @Override
    public void printData() {
        System.out.println("AdditionalData{" + "Batch ID: " + getBatchId() + ", DateTime: " + getDateTime() + '\'' + " , Homogeneity: " + homogeneityData + ", dataType=" + getDataType() + '}');
    }
    // Defensive copying
    public AdditionalData createCopy() {
        return new AdditionalData(this.getBatchId(), this.getDateTime(), this.getHomogeneityData());
    }
}
