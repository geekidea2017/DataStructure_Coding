import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String... args){
        String input="justprintuniqueelements";

        Set<Character> set = input.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
         List<Character> charList = new ArrayList<>(set);
         Collections.sort(charList);

         for(Character chars : charList){
             System.out.println(chars);

         }

        System.out.println(set);
        System.out.println(charList);

        String uniqueChars = input.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(uniqueChars);
    }
}
