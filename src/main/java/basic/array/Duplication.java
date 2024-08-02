package basic.array;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author: Heejeong Choi
 * @description:
 */
public class Duplication {

    public static int removeDuplicationFactor(int[] nums) {
        Integer[] wrapperArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // 배열을 Set으로 변환
        Set<Integer> set = new HashSet<>(Arrays.asList(wrapperArray));

        return set.size();
    }
}
