public final class CoaterData extends InitialData {
    private double coatingThickness;

    //constructor to initialise CoaterData

    public CoaterData(int batchId, String dateTime, double coatingThickness ) {
        super(batchId, dateTime, CoaterDataType.THICKNESS);
        this.coatingThickness = coatingThickness;
    }
    
    public double getCoatingThickess() {
        return coatingThickness;
    }

    public void setCoatingThickness(double coatingThickness) {
        // Unchecked exception for invalid coatingThickness
        if (coatingThickness < 75.0) {
            throw new InvalidCoatingThicknessException("Coating thickness is too low");
        }
        this.coatingThickness = coatingThickness;
    } 


    @Override
    public void printData() {
        System.out.println("CoaterData{" + "Batch ID: " + getBatchId() + ", DateTime: " + getDateTime() + '\'' + " , Coating Thickness: " + coatingThickness + ", dataType=" + getDataType() + '}');
    }

    // Defensive copy for data integrity
    public CoaterData createCopy() {
        return new CoaterData(this.getBatchId(), this.getDateTime(), this.getCoatingThickess());
    }


}
