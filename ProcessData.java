public class ProcessData {
    
    // Analysing Coater data objects using varargs
    public void DataAnalysis(InitialData ... dataObjects) throws ProcessDataException {
       for (InitialData data : dataObjects) {
            if (data instanceof CoaterData cd && cd.getCoatingThickess() <75.0){
                throw new ProcessDataException("Coating thickness low for batch: " + data.getBatchId());
            } else if (data instanceof AdditionalData hd && hd.getHomogeneityData() < 90) {
                    throw new ProcessDataException("Homogeneity low for batch: " + data.getBatchId());
            }
            data.printData();
       } 
    }
}
