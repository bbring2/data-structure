package basic.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Heejeong Choi
 * @description:
 */
public class MaximumHeight {

    public static int getMaxHeight(int[] heights) {
        /*
        * 첫번째 방법으로 자바에서 제공하는 Arrays.sort()메서드를 사용한다.
        * 배열이 매우 큰 경우(수백만개 이상의 경우에)에는 병렬 정렬도 고려 할 수 있다.
        * parallelSort()의 경우에 여러 스레드 사용해서 정렬 작업을 병렬로 수행할 수 있다.
        * */
        Long startEpoch = System.currentTimeMillis();
        Arrays.sort(heights);
//        Arrays.parallelSort(heights);
        Long endEpoch = System.currentTimeMillis();
        System.out.println("걸린 시간 : " + (endEpoch - startEpoch));
        return heights[heights.length-1];
    }

}
