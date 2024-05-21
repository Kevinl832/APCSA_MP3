import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] str = {"catch", "bobcat", "catchacat", "cat", "at"};
        String[] str2 = {"an", "band", "band", "abandon"};
        String[] str3 = {"to", "too", "stool", "tools"};
        WordChecker test = new WordChecker(str);
        WordChecker test1 = new WordChecker(str2);
        WordChecker test2 = new WordChecker(str3);
        System.out.println(test.isWordChain());
        System.out.println(test1.isWordChain());
        System.out.println(test2.isWordChain());
        ArrayList<String> x = test.createList("cat");
        for(String i: x) {
            System.out.println(i);
        }
        ArrayList<String> y = test.createList("catch");
        for(String i: y) {
            System.out.println(i);
        }
        ArrayList<String> z = test.createList("dog");
        for(String i: z) {
            System.out.println(i);
        }
        System.out.println("Hello world!");
    }
}
