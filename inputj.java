import java.util.*;
import java.util.Scanner;


// public class inputj {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter a string: ");


//         String userInput = scanner.nextLine(); // Read user input as a string


//         System.out.println("You entered: " + userInput +" "+ userInput.length());

//         char[] str = userInput.toCharArray();

//         for(int i=0; i < str.length/2; i++)
//             str[str.length-1-i] = (char) (str[i] + str[str.length-1-i] - (str[i] = str[str.length-i-1]));  // cast to this all in char.


//         for(int i=0; i < str.length; i++)
//             System.out.print(str[i]);

        
//         scanner.close(); // Close the scanner to prevent resource leak
//     }
// }




// public class inputj
// {
//     public static void main(String[] args)
//     {
//         System.out.print("Enter a String: ");

//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         char[] arr = new char[str.length()];

//         int count =0;
//         for(int i=0; i < arr.length; i++)

//             if(arr[i] == arr[arr.length-i-1])
//                 count ++;
//             else break;

//         if(count >= arr.length)
//             System.out.println("It is palidrome.");
//         else System.out.println("It is not a palidrome.");

//         sc.close();
//     }

// }



public class inputj
{
    public static void main(String[] args)
    {
        System.out.print("Enter a string: ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        char[] arr = str.toCharArray();

        // for(int i=0; i<arr.length; i++)
        // {
        //     if(arr[i]>='A' && arr[i]<='Z')
        //         continue;
            
        //     else if(arr[i]>='a' && arr[i]<='z')
        //             continue;
        //     else break;
            
        // }
        
        int count =0;
    

        for(int i=0; i< arr.length; i++)
         
                if(arr[i] >='A' && arr[i]<= 'Z')
                    for(char x ='A'; x<='Z' ; x++)
                        if(x == arr[i])
                            count++;
                        else continue;
                else
                if(arr[i] >= 'a' && arr[i] <= 'z')
                        for(char x = 'a' ; x <= 'z'; x++)
                            if(x == arr[i])
                                count++;
                            else continue;
                else continue;


            

        if(count>= 26)
            System.out.print("this is panagram.");
        else System.out.println("Not a panagram.");
    }
}


