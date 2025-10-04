package ca.bank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class sampleProgms {
    public static void main(String[] args) {
        String str="selenium";
//        StringBuilder sb=new StringBuilder(str);
//        System.out.println(sb.reverse());
//        //streams
        char[] arr=str.toCharArray();
//        char[] revArr=new char[arr.length];
//        int j=0;
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.println(arr[i]);
//            System.out.println("hi3");
//            revArr[j]=arr[i];
//            System.out.println(revArr[j]);
//            j++;
//        }
//        System.out.println(Arrays.toString(revArr));
        List<Character> lst=new ArrayList<>();
        for(Character c:arr){
            lst.add(c);
        }

        System.out.println(lst);
        Integer[] carr={6,7,1,2,3};
        Arrays.sort(carr);
        System.out.println(Arrays.toString(carr));
//        System.out.println(Arrays.sort(carr));
        Arrays.sort(carr,Collections.reverseOrder());
        System.out.println(Arrays.toString(carr));
        String[] strArr={"sai","mayu"};
        System.out.println(Arrays.toString(strArr));

        String str2="sel123nium";
        String str3=str2.replaceAll("[0-9]","");
        System.out.println(str3);
        List<Integer> lstInt=new ArrayList<>(Arrays.asList(1,2,3,6,4));
        Collections.reverse(lstInt);
        System.out.println("printing lst in reverse insertion order: "+lstInt);
        Collections.sort(lstInt);
        System.out.println("printing lst in ascending order: "+lstInt);
        Collections.sort(lstInt,Collections.reverseOrder());
        System.out.println(lstInt);



//        lst.stream().sorted(Collections.reverseOrder()).toList().forEach(System.out::println);

        List<String> lst1=new ArrayList<>(Arrays.asList("hi","hello","mayuri"));
        Map<String,Integer> map1=lst1.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map1);
//        lst.sort(Comparator.reverseOrder());
//        System.out.println(lst);
//        List<Integer> lst1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        lst1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//        Collections.reverse(lst);
//        System.out.println(lst);













    }
}
