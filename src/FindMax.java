import java.util.Scanner;

public class FindMax {

    public static int sizeMatrix(String type) {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        int result = 0;
        try {
            if (type.equals("rows")) {
                do {
                    System.out.print("Enter the rows number of the matrix: ");
                    rows = sc.nextInt();

                    if (rows > 10) {
                        System.out.println("The rows of the matrix does not exceed 10");
                    }
                } while (rows > 10);
                result = rows;
            } else if (type.equals("columns")) {
                do {
                    System.out.print("Enter the columns number of the matrix: ");
                    columns = sc.nextInt();

                    if (columns > 10) {
                        System.out.println("The columns of the matrix does not exceed 10");
                    }
                } while (columns > 10);
                result = columns;
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return result;
    }

    public static void addValuesToMatrix(int[][] array) {
        Scanner sc = new Scanner(System.in);
        try {

            for (int rows = 0; rows < array.length; rows++) {
                for (int columns = 0; columns < array[rows].length; columns++) {
                    System.out.print("Enter element [" + rows + "][" + columns + "]: ");
                    array[rows][columns] = sc.nextInt();
                }
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static void display(int[][] array, String type) {
        int max, rowOfMaxValue, columnOfMaxValue;
        try {
            if (type.equals("matrix")) {
                for (int rows = 0; rows < array.length; rows++) {
                    for (int columns = 0; columns < array[rows].length; columns++) {
                        System.out.print(array[rows][columns] + "\t");
                    }
                    System.out.println();
                }
            } else if (type.equals("maxValue")) {
                max = findMaxValueInTheMatrix(array, "max");
                rowOfMaxValue = findMaxValueInTheMatrix(array, "row");
                columnOfMaxValue = findMaxValueInTheMatrix(array, "column");
                System.out.print("Maximum value in the matrix: " + max + " at [" + rowOfMaxValue + "][" + columnOfMaxValue + "]");
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static int findMaxValueInTheMatrix(int[][] array, String type) {
        int max = array[0][0];
        int rowIndex = 0;
        int columnIndex = 0;
        int result = 0;
        try {
            switch (type) {
                case "max":
                    for (int rows = 0; rows < array.length; rows++) {
                        for (int columns = 0; columns < array[rows].length; columns++) {
                            if (max < array[rows][columns]) {
                                max = array[rows][columns];
                            }
                        }
                    }
                    result = max;
                    break;
                case "row":
                    for (int rows = 0; rows < array.length; rows++) {
                        for (int columns = 0; columns < array[rows].length; columns++) {
                            if (max < array[rows][columns]) {
                                max = array[rows][columns];
                                rowIndex = rows;
                            }
                        }
                    }
                    result = rowIndex;
                    break;
                case "column":
                    for (int rows = 0; rows < array.length; rows++) {
                        for (int columns = 0; columns < array[rows].length; columns++) {
                            if (max < array[rows][columns]) {
                                max = array[rows][columns];
                                columnIndex = columns;
                            }
                        }
                    }
                    result = columnIndex;
                    break;
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return result;
    }
}