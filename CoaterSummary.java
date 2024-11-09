public record CoaterSummary(int batchId, String dateTime, double averageCoatingThickness) {
    @Override
    public String toString() {
        return "Coater Summary{" + "batch Id=" + batchId + ", dateTime='" + dateTime + '\'' + ", average coating thickness =" + averageCoatingThickness + '}';
    }
}
