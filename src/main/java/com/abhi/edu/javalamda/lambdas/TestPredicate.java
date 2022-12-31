package com.abhi.edu.javalamda.lambdas;

import java.util.function.Predicate;

interface Evaluate<T>{
    boolean isNegavtive(T t); // Similar To Predicate
}
public class TestPredicate {
    public static  void  main(String[] args){
        /**
         *Evaluate is a functional interface i.e one abstarct method:
         * similar to java.util.function.Predicate
         */

        Evaluate<Integer> lambda = i ->  i < 0;

        //other way
        Evaluate<Integer> lambdai = (Integer i) ->{
                if (i < 0){
                    return true;
                }else {
                    return false;
                }
        };

        //other way
        Evaluate<Integer> lambdaii  = i -> {
          return i < 0 ;
        };

        System.out.println("Evaluate: " + lambda.isNegavtive(-1)); //true
        System.out.println("Evaluate: " + lambda.isNegavtive(10)); //false

        System.out.println("Evaluate: " + lambdai.isNegavtive(-1)); //true
        System.out.println("Evaluate: " + lambdai.isNegavtive(10)); //false

        System.out.println("Evaluate: " + lambdaii.isNegavtive(-1)); //true
        System.out.println("Evaluate: " + lambdaii.isNegavtive(10)); //false

        /**
         * Predicate<T> is a functional Interface i.e having only one abstract methods
         */
        Predicate<Integer> predicate = i -> i < 0;
        System.out.println("Evaluate: " + predicate.test(-1));
        System.out.println("Evaluate: " + predicate.test(1));

    }
}
