package tcstraining.day1;

import java.util.Scanner;

public class MyFirstClass {
    int d;//throughout the class
    public static void main(String[] args) {
        String[] s1 = {"a","k"};
        System.out.println("Hello World!");
        MyFirstClass m1 = new MyFirstClass();
        m1.add(6);
        m1.subtract();
        ABCD.main(s1);
        System.out.println(ABCD.d);
    }
    //Method 2
    void add(int a){
        int n1;// Limited to add function
        System.out.println("\nInside for loop!");
        for(int i=1;i<=5;i++)//Limited to for loop
            System.out.print(i+ " ");
        System.out.println("\nAddition!");
    }
    //Method 3
    void subtract(){
        System.out.println("Subtraction!");}

    public static void staticInputSample()
    {
        int n1=10,n2=20;
        System.out.println("The sum of "+n1+" and "+n2+":"+(n1+n2));
        System.out.println("The difference between "+n1+" and "+n2+":"+(n1-n2));
        System.out.println("The product of "+n1+" and "+n2+":"+(n1*n2));
        System.out.println("The quotient when "+n1+" is divided by "+n2+":"+(n1/n2));
        System.out.println("The reminder when "+n1+" is divided by "+n2+":"+(n1%n2));
    }
    public static void dynamicInputSample()
    {
        int n1=10,n2=20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n1:");
        n1 = scanner.nextInt();
        System.out.println("Enter the value of n2:");
        n2 = scanner.nextInt();
        System.out.println("The sum of "+n1+" and "+n2+":"+(n1+n2));
        System.out.println("The difference between "+n1+" and "+n2+":"+(n1-n2));
        System.out.println("The product of "+n1+" and "+n2+":"+(n1*n2));
        System.out.println("The quotient when "+n1+" is divided by "+n2+":"+(n1/n2));
        System.out.println("The reminder when "+n1+" is divided by "+n2+":"+(n1%n2));
    }

}

class ABCD
{
    static int d =10;//property - Member1
    void print()//method - Member2
    {
        System.out.println("Value of d:"+d);
    }

    public static void main(String[] args) {//method - Member3
        System.out.println("Value of d:"+d);
        ABCD ab = new ABCD();
        ab.print();
    }
}