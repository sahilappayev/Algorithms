package az.sahil.ds.stack;

public class App {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String str) {
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String word = "";
        while (!stack.isEmpty())
            word += stack.pop();
        return word;
    }
}
