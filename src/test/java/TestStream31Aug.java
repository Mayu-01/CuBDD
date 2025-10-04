import java.util.*;
import java.util.stream.*;

import static org.apache.commons.io.function.IOConsumer.forEach;
import static org.bouncycastle.asn1.x500.style.RFC4519Style.c;

public class TestStream31Aug {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 8,9,10));
//  To print even and odd numbers separately
        Map<Boolean, List<Integer>> map = lst.stream().collect(Collectors.partitioningBy(ele -> ele % 2 == 0));
        System.out.println(map);
        System.out.println("Even number: " + map.get(true));
        System.out.println("Odd number: " + map.get(false));
//To print frequency of characters in string
        String str = "sel@en&ium";
        char[] charArr = str.toCharArray();
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        for (Character ch : charArr) {
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
        }
        System.out.println(map1);

//        To remove special chars from string
        String str2="may@uree&";
        System.out.println(str2.replaceAll("[^a-zA-Z0-9_]",""));

//To remove special characters from sentence
        String str3="mayuree is% ver1y intelligent!";
        String[] strArr3 = str3.split(" ");
        for(String s1:strArr3){
            System.out.println(s1.replaceAll("[^a-zA-Z0-9]",""));
        }
//        To remove duplicate chars from string
        String str4="madam";
         Set<Character> set1=new LinkedHashSet<>();
        char[] withoutDuplicate=str4.toCharArray();
        for(Character ch:withoutDuplicate){
            set1.add(ch);
        }
        System.out.println(set1);




// Sort list in reverse order
        lst.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        Map<Boolean,List<Integer>> map3=lst.stream().collect(Collectors.partitioningBy(ele->ele%5==0));
        System.out.println("Multiple of 5: " +map3.get(true));


//        Reverse string without string builder

        String strRev="selenium";
        char[] chRev=strRev.toCharArray();
        System.out.println(chRev.length);
        for(int i = chRev.length-1; i>=0; i--){
            System.out.println(chRev[i]);
        }//muineles

//        Reverse with string builder
        StringBuilder sb=new StringBuilder(strRev);
        System.out.println("\n"+sb.reverse().toString()); //muineles

        // reverse string maintaning space

        String str1 = "Ge eks";
        char[] arr=str.toCharArray();
        char[] revArr=new char[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                revArr[i]=' ';
            }
        }
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                revArr[j]=arr[i];
                j--;
            }else{
                j--;
            }
        }
        System.out.println(Arrays.toString(revArr));
        System.out.println(String.valueOf(revArr));

    }
}
