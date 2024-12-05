import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test1 {
    public static void main(String[] args){

        int[] integers1 = {2,4,7,9,10,17};
        int[] integers2 = {3,5,7,10};
        // 7,10
        List<Integer> list = new ArrayList<Integer>();

       /* Arrays.stream(integers1).forEach(i1 -> {
            for(int i=0; i< integers2.length; i++){

                if(i1 == integers2[i] ){
                    System.out.println(i1);
                }
            }
        });*/
        IntStream.concat(Arrays.stream(integers1), Arrays.stream(integers2)).forEach(System.out::println);
        System.out.println("----------------------------------------------------------");




        List<Integer> a = Arrays.stream(integers1).filter(Arrays.asList(integers2)::contains).boxed().collect(Collectors.toList());
        System.out.println(a);
    }
}
