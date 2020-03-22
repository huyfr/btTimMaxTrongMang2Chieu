public class Main {
    public static void main(String[] args) {
        int[][] matrix=new int[FindMax.sizeMatrix("rows")][FindMax.sizeMatrix("columns")];
        FindMax.addValuesToMatrix(matrix);
        FindMax.display(matrix, "matrix");
        FindMax.display(matrix, "maxValue");
    }
}