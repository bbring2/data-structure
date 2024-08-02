import basic.hashmap.SearchMap;
import common.DataGenerator;

/**
 * @author: Heejeong Choi
 * @description: This class is only for running codes!
 */
public class DataStructure {

    public static void main(String[] args) {
        DataGenerator dataGenerator = new DataGenerator();
        SearchMap searchMap = new SearchMap(dataGenerator);
//        System.out.println(searchMap.createMap());
        System.out.println(dataGenerator.generateRandomMap(100));
    }
}
