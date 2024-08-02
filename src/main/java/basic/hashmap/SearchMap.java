package basic.hashmap;

import common.DataGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: Heejeong Choi
 * @description:
 */
public class SearchMap {

    private final DataGenerator dataGenerator;

    public SearchMap(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
    }

    public List<Integer> createMap() {
        return dataGenerator.generateRandomList(100);
    }

}
