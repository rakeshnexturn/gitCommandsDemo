package com.demo;

public class Arithematic {
    public int add(int a, int b) { return a+b; }

    public int sub(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int division(int a, int b) { return a/b; }
    public int add(int a, int b) { return a+b; }
    public static void main(String[] args) {
        Arithematic arithematic = new Arithematic();
        System.out.println("Adding two number - "+arithematic.add(2, 3));
        System.out.println("Substract two number - "+arithematic.sub(8, 10));
        System.out.println("Multiply two number - "+arithematic.multiply(67,67));
        System.out.println("Divide two number - "+arithematic.division(37,33));
        System.out.println("add two number - "+arithematic.division(37,33));
    }
}

