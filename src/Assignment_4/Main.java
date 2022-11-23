package Assignment_4;

public class Main {
    private static boolean test = true;
    public static void main(String[] args) {
        boolean bTest = test = !test;
        System.out.println(bTest);
    }
}
