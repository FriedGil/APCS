package Unit4.FractionLab.GEE;

import java.util.List;
import java.util.Arrays;

public class Functional {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        list.stream()
            .filter(num-> num > 5)
            .filter(num -> num < 10)
            .forEach(System.out::println);
}
}

