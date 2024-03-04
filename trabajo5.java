package co.com.ps.trabajosenclases;
import java.util.List;
import java.util.Arrays;


public class trabajo5 {
    public static void main(String[] args) {
        List<String> palabra = Arrays.asList("stream", "java", "programacion", "funcional", "ejemplo");
        palabra.stream().filter(pala -> pala.length() > 5).forEach(System.out::println);


    }
}
