import java.awt.*;

public class App {

    public static void main(String []args) {

    	System.out.println("Result of Metod mulArrays:\n");

        int [][] array1 = { {2, 2},
                            {1, 4} };


        int [][] array2 = { {8, 2, 6},
                            {2, 5, 9} };

        Matrice.printTwoDimensionsArray(Matrice.mulArrays(array1, array2));

        System.out.println();
        
        //////////////////////////////////////////////////////////////////
        
        System.out.print("Result of Metod countNumberOfSpecifiedCharacterInString:\n");
        
        System.out.print(MyString.countNumberOfSpecifiedCharacterInString("Lalala,", 'l'));
        
        System.out.println();
        
        //////////////////////////////////////////////////////////////////
        
        System.out.println("Result of Metod searchIntersectionMany\n");
        
        
        double [] array11 = { 2, 2, 1, 4, 10 };
        double [] array22 = { 2, 5, 9, 2, 10 };

        Matrice.printArrayList(Matrice.searchIntersectionMany(array11, array22));
     
        System.out.println();
        
        //////////////////////////////////////////////////////////////////
        
        System.out.println("Result of Metod searchSameElems");
        
        System.out.println(MyString.searchSameElems(null, null));
    }
}
