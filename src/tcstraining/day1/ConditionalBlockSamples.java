package tcstraining.day1;

import java.util.Scanner;

public class ConditionalBlockSamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day 1 Session!");
        ConditionalBlockSamples day1 = new ConditionalBlockSamples();

        /*System.out.println("If block check!");
        day1.ifCheck();*/

       /*System.out.println("If Else block check!");
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int val = day1.ifElseCheck(n);
        if(val==1)
            System.out.println("The given number "+n+" is an even number!");
        else
            System.out.println("The given number "+n+" is not an even number!");*/

      //  System.out.println("Else if ladder block check!");
       // day1.elseIfLadderCheck();


       /* System.out.println("Nested if block check!");
        System.out.println("Enter a number:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("The given number is:"+n);
        day1.nestedIfCheck(n);*/

        System.out.println("Switch check!");
        System.out.println("Options!");
        System.out.println("1. ifCheck");
        System.out.println("2. ifElseCheck");
        System.out.println("3. elseIfLadderCheck");
        System.out.println("4. nestedIfCheck");
        System.out.println("Enter a option:");
        int option = new Scanner(System.in).nextInt();
        day1.switchCheck(option);

    }

    void ifCheck()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Your age is:"+age);
        if(age>=18){
            System.out.println("You are eligible to vote!");}
        //System.out.println("You are not eligible to vote!");
    }

    int ifElseCheck(int n)
    {
        System.out.println("The given number is:"+n);
        if(n%2==0)
            return 1;
        else
            return 0;
    }

    void elseIfLadderCheck()
    {
        System.out.println("Enter a number:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("The given number is:"+n);
        if(n%5==0)
            System.out.println("The given number is divisible by 5!");
        else if(n%7==0)
            System.out.println("The given number is divisible by 7!");
        else
            System.out.println("The number is not a multiple of 5 or 7!");
    }

    void nestedIfCheck(int n)
    {
        if(n%2!=0)
        {
            System.out.println("The given number is an odd number!");
            if(n%11==0)
                System.out.println("And the number is also divisible by 11!");
            else
                System.out.println("The given number is not divisible by 11!");

        }
        else
            System.out.println("The given number is not an odd number!");
    }

    void switchCheck(int n)
    {
        switch(n){
            case 1:
                ifCheck();
                break;
            case 2:
                System.out.println("Enter a number:");
                int n1 = new Scanner(System.in).nextInt();
                int val = ifElseCheck(n1);
                if(val==1)
                    System.out.println("The given number is an even number!");
                else
                    System.out.println("The given number is not an even number!");
                break;

            case 3:
                elseIfLadderCheck();
                break;

            case 4:
                System.out.println("Enter a number:");
                int n2= new Scanner(System.in).nextInt();
                nestedIfCheck(n2);
                break;

            default:
                System.out.println("Invalid option!");
        }
    }

}

