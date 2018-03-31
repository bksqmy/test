import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        List<String> strings = new ArrayList<String>();
        strings.add("123");
        for (String str:
             strings) {
            System.out.println(str);
        }
    }
}
