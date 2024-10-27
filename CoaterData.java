public class CoaterData extends InitialData {
    private double coatingThickness;

    public CoaterData(int batchId, String dateTime, double coatingThickness ) {
        super(batchId, dateTime);
        this.coatingThickness = coatingThickness;
    }

    public double getCoatingThickess() {
        return coatingThickness;
    }

    public void setCoatingThickness(double coatingThickness) {
        this.coatingThickness = coatingThickness;
    } 

    @Override
    public void printData() {
        super.printData();
        System.out.println("Coating Thickness: " + this.coatingThickness);
    }
}
