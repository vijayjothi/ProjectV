package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

Input: a[] = {-5, 3, 6, 12, 15}, b[] = {-12, -10, -6, -3, 4, 10}
Output: The median is 3.
Explanation: The merged array is: ar3[] = {-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15}.
So the median of the merged array is 3

Input: a[] = {2, 3, 5, 8}, b[] = {10, 12, 14, 16, 18, 20}
Output: The median is 11.
Explanation : The merged array is: ar3[] = {2, 3, 5, 8, 10, 12, 14, 16, 18, 20}
If the number of the elements are even. So there are two middle elements.
Take the average between the two: (10 + 12) / 2 = 11.
 */
public class Median {
    public static void main(String[] args) {
        int[] arr1={-2, 3, 5, 8};
        int[] arr2={10, 12, 14, 16, 18, 20};
        int[] result=new int[arr1.length+arr2.length];

        System.arraycopy(arr1,0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);
        Arrays.sort(result);

        Arrays.stream(result).forEach(n->System.out.print(n+","));
        int median;
        if (result.length%2==0){
            median=result.length/2;
            System.out.println("\n median :"+(result[median]+result[median-1])/2);
        }else {
            median= result.length/2;
            System.out.println("\nThe median is"+result[median]);
        }
    }
}
