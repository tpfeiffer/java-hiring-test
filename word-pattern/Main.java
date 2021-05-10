public class Main {

    private static boolean wordPattern(String pattern, String s) {
        return false; // TODO implement this
    }

    public static void main(String[] args) {
        System.out.println("Pass test 1: " + String.valueOf(wordPattern("abba", "dog cat cat dog") == true));
        System.out.println("Pass test 2: " + String.valueOf(wordPattern("abba", "dog cat cat fish") == false));
        System.out.println("Pass test 3: " + String.valueOf(wordPattern("aaaa", "dog cat cat dog") == false));
        System.out.println("Pass test 4: " + String.valueOf(wordPattern("abba", "dog dog dog dog") == false));
    }

}
