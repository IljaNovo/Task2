import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MatriceTest {

    @Test
    public void  checkForComplianceWithTheRowsAndColumnsMethodOfMulArrays()  throws Exception {
        int [][] array1 = { {2, 2},
                            {1, 4} };

        int [][] array2 = { {8, 2, 6},
                            {2, 5, 9} };

        int[][] answer = Matrice.mulArrays(array1, array2);

        int[][] patternAnswer = {{20, 14, 30},
                                 {16, 22, 42}};

        boolean validateAnswer = true;

        if (answer.length != patternAnswer.length &&
                answer[0].length != patternAnswer[0].length) {

            validateAnswer = false;
        }

        assertEquals(validateAnswer, true);
    }

    @Test
    public void testedForCorrectCalculationMethodOfMulArrays() throws Exception {

        int [][] array1 = { {2, 2},
                            {1, 4} };

        int [][] array2 = { {8, 2, 6},
                            {2, 5, 9} };

        int[][] answer = Matrice.mulArrays(array1, array2);

        int[][] patternAnswer = {{20, 14, 30},
                                 {16, 22, 42}};

        boolean validateAnswer = true;

        for (int i = 0; i < patternAnswer.length; ++i) {
            for (int j = 0; j < patternAnswer[0].length; ++j) {

                if (answer[i][j] != patternAnswer[i][j]) {
                    validateAnswer = false;
                    i = patternAnswer.length;
                    break;
                }
            }
        }

        assertEquals(validateAnswer, true);
    }

    @Test
    public  void testedForCorrectCalculationMethodOfSearchIntersectionMany()
    {
        double [] array11 = { 2, 2, 1, 4, 10 };
        double [] array22 = { 2, 5, 9, 2, 10 };

        ArrayList<Double> answer = Matrice.searchIntersectionMany(array11, array22);

        ArrayList<Double> patternAnswer = new ArrayList<Double>();

        patternAnswer.add(2.0);
        patternAnswer.add(10.0);


        boolean validateAnswer = true;

        for (int i = 0; i < patternAnswer.size(); ++i) {

            if ((answer.get(i) - patternAnswer.get(i) > 0.0001)) {
                validateAnswer = false;
                break;
            }
        }

        assertEquals(validateAnswer, true);
    }

	@Test
    public void  checkForComplianceWithTheElemsSearchIntersectionMany()  throws Exception {

        double[] array11 = {2, 2, 1, 4, 10};
        double[] array22 = {2, 5, 9, 2, 10};

        ArrayList<Double> answer = Matrice.searchIntersectionMany(array11, array22);

        ArrayList<Double> patternAnswer = new ArrayList<Double>();

        patternAnswer.add(2.0);
        patternAnswer.add(10.0);


        boolean validateAnswer = true;

        if (answer.size() != patternAnswer.size()) {

            validateAnswer = false;
        }

        assertEquals(validateAnswer, true);
    }
}