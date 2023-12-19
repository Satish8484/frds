package BasicCode;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size");
        int n= s.nextInt();
        int arr1[] = new int[n];
        int arr2[]=new int[n];
        int arr3[]=new int[n];
        System.out.println("enter value of 1st array");
        for (int i = 0; i < n; i++) {//arr1[0]=10  arr[1]=20   arr[2]=30
            arr1[i] =s.nextInt();
        }
        System.out.println("2nd array");
        for (int i = 0; i < n; i++) {//1 2 3
            arr2[i] =s.nextInt();
        }
        System.out.println("Addition of two array");
       for(int i=0;i<n;i++){//0 1 2 3*
           arr3[i]=arr1[i]+arr2[i];

           System.out.print(arr3[i]+" ");//11 22 33
           System.out.print("Happy Ending");
           
        }


    }

}

