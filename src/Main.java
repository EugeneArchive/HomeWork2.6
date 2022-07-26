import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(task1(nums));
        List<Integer> nums2 = new ArrayList<>(List.of(6, 206, 1, 2, 2, 4, 4, 5, 5, 20, 8));
        System.out.println(task2(nums2));
        String text = "One Six Two Three Four One Three Five Five Six One One";
        System.out.println(task3(text));
        System.out.println(task4(text));
//task4(text);
    }

    private static String task1(List<Integer> list) {
        List<Integer> changeList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) % 2 == 0)) {
                changeList.add(list.get(i));
            }
        }
        return changeList.toString();
    }

    private static String task2(List<Integer> list) {
        Set<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                numbers.add(list.get(i));
            }
        }
        return numbers.toString();
    }

    private static String task3(String text) {
        Set<String> textSet = new HashSet<>();
        String[] words = text.split(" ");
        for (String word : words) {
            textSet.add(word);
        }
        return textSet.toString();
    }

    private static String task4(String text) {
        List<String> words = List.of(text.split(" "));
        Map<Integer, String> differentWords =new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            differentWords.put(i, words.get(i));
        }
        for (int i = 0; i < differentWords.size(); i++) {
            int k =0;
            if (differentWords.containsValue(words.get(i))) {
                System.out.println(++k);
            }
        }
//        List<Integer> differentWords = new ArrayList<>();
//        Set<String> differentWordsSet = new HashSet<>();
//        for (int i = 0; i < words.size(); i++) {
//            differentWordsSet.add(words.get(i));
//        }
//        for (int i = 0; i < i; i++) {
//            differentWordsSet..contains(words.get(i));
//            System.out.println(i);

        }
//        System.out.println(words.toString());
//        for (int i = 0; i < words.size(); i++) {
//            int k = 0;
//            if (!differentWordsSet.add(words.get(i))) {
//                k++;
//            }
//            if (!(k == 0)) {
//                differentWords.add(k);
//            }
//   }
    //   return differentWords.toString();
    }
}