package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);*/


        /*byte x=20,y=30;
        //byte cannto be typecasted into ont directly
        System.out.println(x*y);*/

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=a;
        System.out.print("the no is: ");
        StringBuilder str=new StringBuilder();
        String s= String.valueOf(n);

        String arr[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(char i:s.toCharArray())
        {
            int digit=Character.getNumericValue(i);
            str.append(arr[digit]).append(" ");
        }
        System.out.println(str);





        }
    }
