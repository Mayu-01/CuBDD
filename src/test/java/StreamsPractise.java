import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsPractise {
    public static void main(String[] args){
//        List<String> lst= new ArrayList<>(Arrays.asList("hi","hello","Bye","welcome"));
//        Map<String,Integer> map=lst.stream().collect(Collectors.toMap(Function.identity(), e->e.length()));
//        System.out.println(map);
//        List<Integer> lst1= new ArrayList<>(Arrays.asList(2,3,4,5));
//        lst1.stream().map(e->e*2).forEach(e->System.out.println(e));

//        List<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
//        System.out.println(lst);
//        lst.stream().collect(Collectors.partitioningBy(ele->ele%2==0)).forEach(System.out::print);

//                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//                // Partition numbers into even and odd
//                Map<Boolean, List<Integer>> partitioned = numbers.stream()
//                        .collect(Collectors.partitioningBy(num -> num % 2 == 0));
//
//                System.out.println("Even Numbers: " + partitioned.get(true));
//                System.out.println("Odd Numbers: " + partitioned.get(false));

//        List<Integer> lst= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
//        System.out.println(lst);
//        //   lst.removeIf(ele->ele%2==0);
//        //   System.out.println(lst);
//        Map< Boolean,List<Integer>> map=lst.stream().collect(Collectors.partitioningBy(ele->ele%2==0));
//
//        System.out.println(map.get(true));
        List<Integer> lst= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Map<Boolean,List<Integer>> map=lst.stream().collect(Collectors.partitioningBy(ele->ele%2==0));



    }

}
