public class MaximumWealth {
    
    private static int maximumWealth(int[][] accounts) {
        return 0; // TODO implement this
    }
    
    public static void main(String[] args) {
        System.out.println("Pass test 1: " + String.valueOf(maximumWealth(new int[][] {{1, 2, 3}, {3, 2, 1}}) == 6));
        System.out.println("Pass test 2: " + String.valueOf(maximumWealth(new int[][] {{1, 5}, {7, 3}, {3, 5}}) == 10));
        System.out.println("Pass test 2: "
                           + String.valueOf(maximumWealth(new int[][] {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}) == 17));
    }
    
}
