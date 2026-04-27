package test;

public class Test {
    public static String s = "static";
    public String i = "instance";

    public static void staticMethod(String s) {
        System.out.println(s);
    }

    public void instanceMethod(String s) {
        System.out.println(s);
    }
}
