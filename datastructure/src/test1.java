import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
    public static void main(String[] args){

        Integer[] integers1 = {2,4,7,9,10,17};
        Integer[] integers2 = {3,5,7,10};
        // 7,10
        List<Integer> list = new ArrayList<Integer>();

        Arrays.stream(integers1).forEach(i1 -> {
            for(int i=0; i< integers2.length; i++){

                if(i1 == integers2[i] ){
                    System.out.println(i1);
                }
            }
        });
    }
}
