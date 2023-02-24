import java.util.HashMap;
import java.util.Scanner;

public class CountSymbols {
    public static void main(String[] args) {
        HashMap<String, Integer> sentenceMap ;
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sentenceMap = countSymbol(sentence);
        printHashmap(sentenceMap);
    }

    public static HashMap<String, Integer> countSymbol(String sentence) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            map.put(sentence.substring(i, i + 1), 0);
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(i) == sentence.charAt(j)) {
                    map.put(sentence.substring(i, i + 1), map.get(sentence.substring(i, i + 1)) + 1);
                }

            }
        }
        return map;
    }

    public static void printHashmap(HashMap<String, Integer> hMap) {
        for (String iterator : hMap.keySet()) {
            String key = iterator;
            if (key.equals(" ")) {
                key = "White spaces";
            }
            String value = hMap.get(iterator).toString();
            System.out.println(key + " : " + value);
        }
    }
}