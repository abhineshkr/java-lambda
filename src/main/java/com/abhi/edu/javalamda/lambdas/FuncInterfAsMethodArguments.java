package com.abhi.edu.javalamda.lambdas;

import java.util.function.Predicate;



public class FuncInterfAsMethodArguments {

    public static void main(String[] args) {
    int x = 4;
    System.out.println("Is " + x + " even ?" + check(x , n -> n % 2 ==0)); //true
    System.out.println("Is " + x + " even ?" + check(5 , n -> n % 2 ==0)); //false

        String name ="Abhinesh";
        System.out.println("Is " + name + " matches ?" + check(name , n -> n.equals("Abhinesh"))); //false
        System.out.println("Is " + name + " matches ?" + check("Abhi" , n -> n.equals("Abhinesh"))); //true
    }

    public static <T> boolean check(T t, Predicate<T> lambdaArgs){
        return lambdaArgs.test(t);
    }
}
