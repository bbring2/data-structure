package common;

import java.beans.BeanProperty;
import java.util.*;

/**
 * @author: Heejeong Choi
 * @description:
 */
public class DataGenerator {
    public List<Integer> generateRandomList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for(int i=0; i<size; i++) {
            list.add(random.nextInt(10001));
        }

        return list;
    }

    public Map<String, Integer> generateRandomMap(int size) {
        Map<String, Integer> map = new HashMap<>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            String randomName = generateRandomName(random).toLowerCase();

            int randomValue = 150 + random.nextInt(51);

            map.put(randomName, randomValue);
        }

        return map;
    }

    private String generateRandomName(Random random) {
        int nameLength = 5 + random.nextInt(6);
        StringBuilder name = new StringBuilder(nameLength);

        for (int i = 0; i < nameLength; i++) {
            // 알파벳 대문자 A(65)부터 Z(90) 사이의 랜덤 문자 생성
            char randomChar = (char) ('A' + random.nextInt(26));
            name.append(randomChar);
        }

        return name.toString();
    }

}
