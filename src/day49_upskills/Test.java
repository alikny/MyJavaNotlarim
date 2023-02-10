package day49_upskills;

public class Test {
    public static void main(String[] args) {

        StringFunctions bigger = (a, b) -> {
            if (a.length() >= b.length())
                return a;
            return b;
        };

        System.out.println(bigger.function("2", "ali"));

    }
}
