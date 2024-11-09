public record HomogeneitySummary(int batchId, String dateTime, double averageHomogeneity) {
    @Override
    public String toString() {
        return "Coater Summary{" + "batch Id=" + batchId + ", dateTime='" + dateTime + '\'' + ", average coating thickness =" + averageHomogeneity + '}';
    }
}
