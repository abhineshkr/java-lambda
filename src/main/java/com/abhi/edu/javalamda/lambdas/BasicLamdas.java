package com.abhi.edu.javalamda.lambdas;


public class BasicLamdas {
    public static  void  main(String[] args){
        //Anonymous class
        IBasicLambdas i = new IBasicLambdas(){
            //--old java 8 Styles
            @Override
            public void m() {
                System.out.println("I:m()");
            }
        };
        i.m();

        // New Lamda Styles

        IBasicLambdas lambdasI = () -> {
            System.out.println("Lamda Version");
        };

        // Another Lambda Way
        IBasicLambdas lambdasI2 = () -> System.out.println("Another Lamda Version");

        lambdasI.m();
        lambdasI2.m();
    }

}
