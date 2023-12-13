import java.util.*;
public class function {//function class
    public static void PrintMyName(String name){//function to print name
        System.out.println("My name is "+name);
        return;
    }
    public static void sum(int a, int b){//function to add two numbers
        int total = a+b;
        System.out.println("sum of "+a+" and "+b+" is "+total);
        return;
    }
    public static void factorial(int n){//function to find factorial
        if (n<0) {
            System.out.println("INVALID INPUT");
            return; 
        }
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        return;
    }
    public static void main(String[] args){//main function
        Scanner sc = new Scanner (System.in);//create scanner object
        System.out.println("Enter your name: ");
        String name = sc.nextLine();//get input
        PrintMyName(name);//call function
        
        //sum of two numbers
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();//get input
        int b = sc.nextInt();//get input
        sum(a,b);//call function
    
        //factorial of a number
        System.out.println("Enter a number to find factorial: ");
        int n = sc.nextInt();//get input
        factorial(n);//call function
    }
}
