package problems.programmers;

import java.util.TreeSet;

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
        // TreeSet은 중복을 자동으로 제거하고 정렬을 유지
        TreeSet<Integer> sumSet = new TreeSet<>();

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int subSum = numbers[i] + numbers[j];
                sumSet.add(subSum);
            }
        }

        // TreeSet을 배열로 변환
        int[] answer = new int[sumSet.size()];
        int index = 0;
        for(Integer sum : sumSet) {
            answer[index++] = sum;
        }

        return answer;
    }
}
