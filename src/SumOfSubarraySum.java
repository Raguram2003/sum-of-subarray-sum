import java.util.Scanner;

class Solution{
    int totalofsubarraysum(int[] arra){
        int b= arra.length;
        int c= arra.length;
        int sum=0;
        if(b%2==0){
            for(int i=0;i<(b/2);i++){
                sum = sum+(arra[i]*c)+(arra[b-i-1]*c);
                c=c+(b-(2*(i+1)));
            }
        }
        else{
            int i=0;
            for(i=0;i<(b/2);i++){
                sum = sum+(arra[i]*c)+(arra[b-i-1]*c);
                c=c+(b-(2*(i+1)));
            }
            if(i==(b/2)){
                sum=sum+(arra[i]*c);
            }
        }
        return sum;
    }
}

public class SumOfSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int size = sc.nextInt();
        System.out.print("Enter the elements if the array: ");
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            arr[i] = sc.nextInt();
            i++;
        }
        Solution answer = new Solution();
        System.out.println("the sum of the subarraysum is: "+ answer.totalofsubarraysum(arr));
    }
}

/*
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.

PS: A subarray sum denotes the sum of all the elements of that subarray.

------------------------------------
case : 1

Input
A = [1, 2, 3]

Output
20
----------------------------------------
---------------------------------------
case : 2

Input
A = [2, 1, 3]

Output
19
--------------------------------------
 */