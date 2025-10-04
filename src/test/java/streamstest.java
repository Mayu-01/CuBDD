import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class streamstest {
    public static void main(String[] args) {
        String str="my name is mayuri";
        String[] arr=str.split(" ");
        List<String> lst1=new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(lst1);
//        for(String s:lst1){
//            System.out.println(s);
//        }

        List<String> lst=new ArrayList<>(Arrays.asList("Hi","hello","bye","Bye"));
        Collections.sort(lst);
        System.out.println(lst);
        List<String> lstnew=lst.stream().sorted(Comparator.comparing(String::length).thenComparing(String::compareTo)).
                collect(Collectors.toList());
        System.out.println(lstnew);
        Collections.reverse(lstnew);
                System.out.println(lstnew);
//        Collections.reverse(lst
//        new);
//------------------------
        List<String> strLst=new ArrayList<>(Arrays.asList("hi","bye","Hello","hello","HELLO","Bye","i"));
        List<String> sortedLst=strLst.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortedLst);
        List<String> sortedList=strLst.stream().sorted(Comparator.comparing(String::length).thenComparing(String::compareTo)).collect(Collectors.toList());
        System.out.println(sortedList);
//        -----------------------------
         List<Integer> intlist=new ArrayList<>(Arrays.asList(3,2,1,5,2,2,1,4,6));
         intlist.stream().distinct().forEach(System.out::print); //Without set removing duplicate


//        for(String s:newList){
//            System.out.println(s);
//        }

    }
}
