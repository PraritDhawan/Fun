package javabasics;

import java.util.*;
public class inputnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int x=(int)(b/a);
        System.out.println(b/a);
        sc.close();
    }catch(InputMismatchException e){
        System.out.println("Input is wrong"+e);
    }
    catch(ArithmeticException e){
        System.out.println("Mathematical problem");
    }
    finally{System.out.println("The program is execeuted");}
    }
    
}
