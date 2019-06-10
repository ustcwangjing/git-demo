package com.ustc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println(add(5,3));
    }


    public static int add(int a,int b){
        return a + b;
    }

    public static int sub(int a,int b){
        return a - b;
    }

    public static int multiply(int a,int b){
        return a * b;
    }

    public static int div(int a,int b){
        return a / b;
    }
}
