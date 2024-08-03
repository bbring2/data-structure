import problems.programmers.IntervalNumber;
import problems.programmers.NotSameNumber;
import problems.programmers.TwoNumberPlus;

import java.util.Arrays;

/**
 * @author: Heejeong Choi
 * @description: This class is only for running codes!
 */
class DataStructure {

    public static void main(String[] args) {
        NotSameNumber sameNumber = new NotSameNumber();

        System.out.println((Arrays.toString(sameNumber.dislikeSameNumber(new int[] {1,2,1,4,2}))));
    }

}
