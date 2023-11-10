package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class MergingArray {
    public static void main(String[] args) {
        String str1[] = { "A", "E", "I" };
        String str2[] = { "O", "U" };
        String str3[] = {"y","z"};

        List list=new ArrayList(Arrays.asList(str1));
        list.add(Arrays.asList(str3));
        list.addAll(Arrays.asList(str2));

        Object[] str4=list.toArray();
        System.out.println(Arrays.toString(str4));

        Integer[] firstArray = new Integer[]{13,12,11,6,9,3}; //source array
        Integer[] secondArray = new Integer[]{78,34,56,67,2,11,7};

        Object[] mergedarray= mergeArray(firstArray,secondArray);
        System.out.println("Merged Array"+Arrays.toString(mergedarray));


    }

    private static Object[] mergeArray(Integer[] firstArray, Integer[] secondArray) {
        return Stream.of(firstArray,secondArray).flatMap(Stream::of).toArray();
    }
}
