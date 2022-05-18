import java.util.ArrayList;
import java.util.List;

public class ClassificationTree {

    // gini index calculation for groups and classes in array
    public static double giniIndex(int[] groups, int[] classes) {
        int total = 0;
        for (int i = 0; i < groups.length; i++) {
            total += groups[i];
        }
        double gini = 1.0;
        for (int i = 0; i < groups.length; i++) {
            double prob = (double) groups[i] / total;
            gini -= prob * prob;
        }
        return gini;
    }

    // split data set based on feature and value
    public static DataSet splitDataSet(DataSet dataSet, int feature, double value) {
        DataSet newDataSet = new DataSet();
        for (int i = 0; i < dataSet.getNumRows(); i++) {
            if (dataSet.getData(i, feature) >= value) {
                newDataSet.addData(dataSet.getDataRow(i));
            }
        }
        return newDataSet;
    }

    // create dataset class
    public static class DataSet {
        private List<double[]> data;
        private int numRows;
        private int numCols;

        public DataSet() {
            data = new ArrayList<double[]>();
            numRows = 0;
            numCols = 0;
        }

        public void addData(double[] row) {
            data.add(row);
            numRows++;
            numCols = row.length;
        }

        public double[] getDataRow(int index) {
            return data.get(index);
        }

        public int getNumRows() {
            return numRows;
        }

        public int getNumCols() {
            return numCols;
        }

        public double getData(int row, int col) {
            return data.get(row)[col];
        }
    }


}
