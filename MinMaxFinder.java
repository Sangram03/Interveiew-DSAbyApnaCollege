/*
 ? Maximum and minimum of an array using minimum number of comparisons
 * Input: arr[]={3,5,4,1,9}
 * Output: Minimum Element is :1
 *         Maximum Element is :9
 * Input: arr[]={22,14,8,17,35,3}
 * Output: Minimum Element is :3
 *         Maximum Element is :35
    

 ? Maximum and minimum of an array
 ? To solve the problem of finding the minimum and maximum elements in an array.you can follow these step :
 ? Step 1:
 * write functions to find the minimum (setmini) and maximum(setmaxi) value in array.
 ? Step 2:
 * Initialize a variable(mini) to INT_MAX.
 * Iterate through the array.and if an element is smaller than the current mini.update mini to that element.
 * Return the final value of mini.
 ? Step 3: In the setmaxi function :
 * Initialize a variable(maxi) to INT_MIN.
 * Iterate through the array,and if an element is larger than the current maxi,update maxi to that element.
 * Return the final value of maxi.
 ? Step 4: In the main function:
 * Declare an array and its size.
 * Print the result, Call the setminimum and setmaxi function to find the minimum and maximum values.
 ! Time Complexity: O(N).
 ! Auxiliary Space: O(1).

 * One approach to find the maximum and minimum element in an array is to first sort the array in ascending order.
 * Once the array is sorted, the first element of the array will be the array will be the minimum element and the last element 
 * of the array will be the maximum element.

 ? Step-by-step approach :
 * Initialize an array.
 * Sort the array in ascending order.
 * The first element of the array will be the minimum element.
 * The last element of the array will be the maximum element.
 * Print the minimum and maximum element.

 */

 class MinMaxFinder {
    public static int setmini(int[]A,int N)
    {
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]<mini){
                mini=A[i];
            }
        }
        return mini;
    }
    public static int setmaxi(int[] A,int N)
    {
       int maxi = Integer.MIN_VALUE;
       for(int i=0;i<N;i++){
        if(A[i]>maxi){
            maxi =A[i];
        }
       }
       return maxi;
    }
    public static void main(String[] args) {
        int[]A ={4,9,6,5,2,3};
        int N =A.length;
        System.out.println("Minimum element is :" +setmini(A, N));
        System.out.println("Maximum element is :" +setmaxi(A, N));
    }
}
