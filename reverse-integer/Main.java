class Solution {

    public static int reverse(int x) {
        return x;
        
    }

    public static void main(String[] args) {
        System.out.println("Pass test 1: " + String.valueOf(reverse(123) == 321));
        System.out.println("Pass test 2: " + String.valueOf(reverse(-123) == -321));
        System.out.println("Pass test 2: " + String.valueOf(reverse(120) == 21));
        System.out.println("Pass test 2: " + String.valueOf(reverse(0) == 0));
    }
}