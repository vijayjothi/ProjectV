package array;

/*
Input: arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation: Initial array must be {2, 3, 6, 12, 15, 18}.
We get the given array after rotating the initial array twice.

Input: arr[] = {7, 9, 11, 12, 5}
Output: 4

Input: arr[] = {7, 9, 11, 12, 15};
Output: 0

 */
public class RotationCount {
    public static void main(String[] args) {
        int[] arr={15, 18, 2, 3, 6, 12};
        int len=arr.length;
        System.out.println("The number of rotation are "+minIndex(arr,len));
    }

    private static int minIndex(int[] arr, int len) {
        int min=arr[0];
        int minIndex=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
}
