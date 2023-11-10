package array;
/*
Input: array[]= {5, 10, 20, 15}
        Output: 20
        Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

        Input: array[] = {10, 20, 15, 2, 23, 90, 67}
        Output: 20 or 90
        Explanation: The element 20 has neighbors 10 and 15,
        both of them are less than 20, similarly 90 has neighbors 23 and 67.

        solution not perfect
 */
public class PeakElement {
    public static void main(String[] args) {
        int[] arr={10, 20, 15, 2, 23, 90, 67};
        int n=arr.length;
        System.out.println("Index of the peak is "+peak(arr,n));
    }

    private static int peak(int[] arr, int n) {

        if(n==1){
            return 0;
        }
        if (arr[0]>=arr[1]){
            return 0;
        }
        if (arr[n-1]>=arr[n-2]){
            return n-1;
        }
        for (int i=1;i<n-1;i++){
            if (arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]){
                return i;
            }
        }
        return 0;
    }
}
