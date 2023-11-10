package array;

import java.util.Arrays;
import java.util.Collections;

/*

Input : Array 1 - 2 3 6 7 9
        Array 2 - 1 4 8 10
        k = 5
Output : 6
Explanation: The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.

Input : Array 1 - 100 112 256 349 770
        Array 2 - 72 86 113 119 265 445 892
        k = 7
Output : 256
Explanation: Final sorted array is -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.
 */
public class FindtheElement {
    public static void main(String[] args) {
        int[] arr1={2, 3, 6, 7, 9};
        int[] arr2={1, 4, 8, 10};
        int[] result=new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);
        System.out.println("Before Sorting");
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }

        Arrays.sort(result);
        System.out.println();
        System.out.println("After sorting ");
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

//        int temp;
//        for (int i=0;i<result.length;i++){
//            for (int j=1;j<(result.length-i);j++){
//                if (result[j-1]>result[j]){
//                    temp=result[j-1];
//                    result[j-1]=result[j];
//                    result[j]=temp;
//                }
//            }
//        }
//
//        System.out.println();
//        System.out.println("After sorting ");
//        for (int i=0;i<result.length;i++){
//            System.out.print(result[i]+",");
//        }

        int temp;
        for (int i=0;i<result.length-1;i++){
            for (int j=0;j<(result.length-i-1);j++){
                if (result[j]>result[j+1]){
                    temp=result[j+1];
                    result[j+1]=result[j];
                    result[j]=temp;
                }
            }
        }

        System.out.println();
        System.out.println("After sorting ");
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        int key =7;
        System.out.println("Element in the "+key+" index is "+result[key]);
    }
}
