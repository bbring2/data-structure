package problems.programmers;

import java.util.Arrays;

/**
 * @author: Heejeong Choi
 * @description:
 */
public class TwoNumberPlus {

    /**
     * 정수 배열 numbers가 주어집니다.
     * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
     * 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 함수를 완성해주세요.
     * */

    public int[] getAllSumNumber(int[] numbers) {
        int[] answer = {};

        for(int i=0; i<numbers.length-1; i++) {
            int subSum = numbers[i] + numbers[i+1];
            answer[i] = subSum;
        }

        Arrays.stream(answer).distinct();

        return answer;
    }
}