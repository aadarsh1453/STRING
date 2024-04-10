
 import java.util.*;


// public class Day3{
//    public static void main(String[] args) {

//       System.out.println("Aadarshkumar");
//       int [] arr = new int[5];

//       Scanner sc = new Scanner(System.in);

//       for(int i=0; i < arr.length; i++)
//           arr[i] = sc.nextInt();



//       for(int i=0; i< arr.length; i++)
//           System.out.println("arr["+ i +"]=" + arr[i] );


//    }
// }



// public class Day3{

//    public static void main(String[] args)
//    {
//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);

//        for(int i=0; i < arr.length; i++)
//            arr[i] = sc.nextInt();


//        for(int i=0; i< arr.length-1; i++)

//            if(arr[i] > arr[i+1])
//                 arr[i+1]= arr[i] + arr[i+1] -(arr[i] = arr[i+1]);

//        System.out.println("The largest elements in array is: "+ arr[arr.length-1]);

//    }

// }




// public class Day3
//{
//    public static void main(String[] args)
//    {
//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);

//        for(int i=0; i < arr.length; i++)
//            arr[i] = sc.nextInt();


//        for(int i=0; i< arr.length-1; i++)

//            if(arr[i] < arr[i+1])
//                arr[i+1]= arr[i] + arr[i+1] -(arr[i] = arr[i+1]);

//        System.out.println("The lowest elements in array is: "+ arr[arr.length-1]);

//    }

// }




// public class Day3
//{
//    public static void main(String[] args)
//    {
//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter numbers in array"+arr.length +" elements: ");


//        for(int i=0; i < arr.length; i++)
//            arr[i] = sc.nextInt();

//        System.out.print("The Elements on Even position is: ");

//        for(int i=1; i <= arr.length-1; i+=2)

//            System.out.print(arr[i]+ " ");


//    }

// }




// public class Day3
// {

//    public static void main(String[] args)
//    {
//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a elements in array: ");

//        for(int i=0; i < arr.length; i++)
//            arr[i] = sc.nextInt();

//        System.out.println(" ");

//        for(int i= arr.length-1; i>=0 ; i--)
//            System.out.print( arr[i] + " " );

//    }

// }




// public class Main{

//    public static void main(String[] args)
//    {
//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter numbers in array"+arr.length +" elements: ");


//        for(int i=0; i < arr.length; i++)
//            arr[i] = sc.nextInt();

//        System.out.print("The Elements on Odd position is: ");

//        for(int i=0; i <= arr.length-1; i+=2)

//            System.out.print(arr[i]+ " ");


//    }

// }






public class Day3
{  

   public static void main(inputj[] args)
   {
       int[] arr = new int[10];
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter numbers in array"+arr.length +" elements: ");


       for(int i=0; i < arr.length; i++)
           arr[i] = sc.nextInt();

           
           int[] arr1= new int[arr.length];
           int  count =0;
           
           for(int i=0; i<arr.length; i++)
           
                for(int j=i+1; j< arr.length-1; j++)
                    if(arr[i] == arr[j])
                    {
                        for(int k=0; k<arr1.length; k++)
                            arr1[count] = arr[i];
                         count++;
                    }
            
            System.out.print("The Elements are duplicated is: "+ count);
   }

}





// public class Main{

//    public static void main(String[] args)
//    {
//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter numbers in array"+arr.length +" elements: ");


//        for(int i=0; i < arr.length; i++)
//            arr[i] = sc.nextInt();

//        System.out.print("The Elements on array in ascending order is: ");

//        for(int i=0; i < arr.length-1; i+=1)
//            for(int j=0; j<arr.length-1-i; j++)

//                if(arr[j] > arr[j+1])
//                    arr[j+1] = arr[j+1]  + arr[j] -(arr[j] = arr[j+1]);

//        for(int i=0; i< arr.length; i++)
//            System.out.print(arr[i] + " ");

//    }

// }





// public class Main{

//     public static void main(String[] args)
//     {
//         int[] arr = new int[10];
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter numbers in array"+arr.length +" elements: ");


//         for(int i=0; i < arr.length; i++)
//             arr[i] = sc.nextInt();

//         System.out.print("The second largest elements in array is: ");

//         for(int i=0; i <= 1; i+=1)
//             for(int j=0; j<arr.length-1-i; j++)

//                 if(arr[j] > arr[j+1])
//                     arr[j+1] = arr[j+1]  + arr[j] -(arr[j] = arr[j+1]);

//         //for(int i=0; i< arr.length; i++)
//             System.out.print(arr[arr.length-2] + " ");

//     }

// }




// public class Day3
// {
//     public static void main(String[] args)
//     {
//         int num;
//         Scanner sc = new Scanner(System.in);

//         num = sc.nextInt();


//         int[] arr = new int[num];

//         for(int i= 0; i < arr.length-1; i++)
//         {
//             for(int j=i+1; j < arr.length-2; j++)



//         }
//     }
// }
