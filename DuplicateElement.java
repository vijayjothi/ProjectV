package array;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr= {111, 333, 555, 777, 333, 444, 555};

        System.out.println("======Duplicates Using Brute Force======");
        findDuplicatesUsingBruteForce(arr);

        System.out.println("======Duplicates Using Sorting======");
        findDuplicatesUsingSorting(arr);

        System.out.println("======Duplicates Using HashSet======");
        findDuplicatesUsingHashSet(arr);

        System.out.println("======Duplicates Using HashMap======");
        findDuplicatesUsingHashMap(arr);

        System.out.println("======Duplicates Using Java 8 Streams======");
        findDuplicatesUsingJava8(arr);

    }

    private static void findDuplicatesUsingJava8(int[] arr) {
        Set<Integer> uniqueElements=new HashSet<>();
        Set<Integer> duplicates=Arrays.stream(arr)
                .filter(i->!uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());
        System.out.println("Duplicate elements are :"+duplicates);

    }

    private static void findDuplicatesUsingHashMap(int[] arr) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int element: arr){
            if (hashMap.get(element)==null){
                hashMap.put(element,1);
            }else {
                hashMap.put(element,hashMap.get(element)+1);
            }
        }
        Set<Map.Entry<Integer,Integer>> set=hashMap.entrySet();
        for (Map.Entry<Integer,Integer> entry:set){
            if (entry.getValue()>1){
                System.out.println("Duplicate element "+entry.getKey()+
                        " -found "+entry.getValue()+" times");
            }
        }
    }

    private static void findDuplicatesUsingHashSet(int[] arr) {
        HashSet<Integer> hashSet=new HashSet<>();
        for (int element:arr){
            if (!hashSet.add(element)){
                System.out.println("Duplicates are :"+ element);
            }
        }
    }

    private static void findDuplicatesUsingSorting(int[] arr) {
        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]==arr[i+1]){
                System.out.println("Duplicate is :"+arr[i]);
            }
        }
    }

    private static void findDuplicatesUsingBruteForce(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate elements are :"+arr[i]);
                }
            }
        }
    }
}
