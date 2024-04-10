



import java.util.*;
import java.util.Scanner;


public class SecondlastElementinSorted{

    public static void main(String[] args)
    {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers in array"+arr.length +" elements: ");


        for(int i=0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.print("The second largest elements in array is: ");

        for(int i=0; i <= 1; i+=1)
            for(int j=0; j<arr.length-1-i; j++)

                if(arr[j] > arr[j+1])
                    arr[j+1] = arr[j+1]  + arr[j] -(arr[j] = arr[j+1]);

        //for(int i=0; i< arr.length; i++)
            System.out.print(arr[arr.length-2] + " ");

    }

}
