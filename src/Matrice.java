import java.util.ArrayList;

public class Matrice {

    public static int[][] mulArrays(int [][]array1, int [][]array2) {

        if (array1 == null || array2 == null) {
            return  null;
        }

        if ((array1[0].length != array2.length)) {
            return null;
        }

        int equalesRowsCollumns = array1[0].length;

        int [][]newMas = new int[array1.length][array2[0].length];

        for (int i = 0; i < array1.length; ++i) {
            for (int j = 0; j < array2[0].length; ++j) {
                for (int k = 0; k < equalesRowsCollumns; ++k) {

                    newMas[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        return newMas;
    }

    public static ArrayList<Double> searchIntersectionMany(double []array1, double []array2) {
        ArrayList<Double> newMnogestwo = new ArrayList<Double>();

        if (array1 == null || array2 == null)
            return newMnogestwo;

        for (int i = 0; i < array1.length; ++i) {
            for (int j = 0; j < array2.length; ++j) {

                if (array1[i] == array2[j] && !searhElemInList(newMnogestwo, array1[i])) {

                    newMnogestwo.add(array1[i]);
                }
            }
        }

        return newMnogestwo;
    }

    public static void printTwoDimensionsArray (int [][]array) {

        if (array == null) {
            System.out.println();
            return;
        }

        for (int i = 0; i < array.length; ++i) {

            for (int j = 0; j < array[i].length; ++j) {

                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void printArrayList (ArrayList<Double> list) {

        if (list == null) {
            System.out.println();
            return;
        }

        int sizeOfArrayList = list.size();

        for (int i = 0; i < sizeOfArrayList; ++i) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }

    private static boolean searhElemInList (ArrayList<Double> originalList, double key)
    {
        if (originalList.size() == 0) {
            return false;
        }

        boolean resalt = false;

        for (double elem: originalList) {

            if (elem == key) {
                resalt = true;
                break;
            }
        }

        return resalt;
    }
}
