import java.util.*;

public class Main {
  private static final   List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final  List<Integer> nums2 = new ArrayList<>(List.of(6, 206, 1, 2, 2, 4, 4, 5, 5, 20, 8));
    public static void main(String[] args) {

        System.out.println(task1(nums));

        System.out.println(task2(nums2));
        String text = "One Six Two Three Four One Three Five Five Six One One";
        task2b();
        System.out.println(task3(text));
      //  System.out.println(task4(text));
task4(text);
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
        String[] words = text.split(" ");
        Set<String> textSet = new HashSet<>();
        for (String word : words) {
            textSet.add(word);
        }
        return textSet.toString();
    }

    public static void task2b() {
        Collections.sort(nums2);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums2) {
            if ((num % 2) == 0 && !(num == prevNum)) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    private static void task4(String text) {
        String[] words = text.split(" ");
        Set<String> textSet = new HashSet<>();
        for (String word : words) {
            textSet.add(word);
        }
        System.out.println(words.length - textSet.size());

    }

//    private static String task4(String text) {
//        List<String> words = List.of(text.split(" "));
//        Map<Integer, String> differentWords =new HashMap<>();
//        for (int i = 0; i < words.size(); i++) {
//            differentWords.put(i, words.get(i));
//        }
//        for (int i = 0; i < differentWords.size(); i++) {
//            int k =0;
//            if (differentWords.containsValue(words.get(i))) {
//                System.out.println(++k);
//            }
//        }
////        List<Integer> differentWords = new ArrayList<>();
////        Set<String> differentWordsSet = new HashSet<>();
////        for (int i = 0; i < words.size(); i++) {
////            differentWordsSet.add(words.get(i));
////        }
////        for (int i = 0; i < i; i++) {
////            differentWordsSet..contains(words.get(i));
////            System.out.println(i);
//
//        }
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
