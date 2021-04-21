package com.company;



import java.util.ArrayList;
import java.util.List;

class Main {
    private static Number Number;

    public static void main(String[] args) {
        List<Number> myList1 = new ArrayList<>();
        Object obj1 = new Object();
        Integer number1 = 10;
        myList1.add(number1);
        myList1.add(Number);
        //myList1.add(obj1); ERROR (компилятор требует каст)

        List<? super Number> myList2 = new ArrayList<>();
        Object obj2 = new Object();
        Integer number2 = 5;
        //myList2.add(obj2); ERROR (компилятор предлагает сменить на List<Object>
        myList2.add(number2);
        myList2.add(Number);

        List<? extends Number> myList3 = new ArrayList<>();
        Object obj3 = new Object();
        Integer number3 = 45;
        //myList2.add(obj3); ERROR (компилятор предлагает сменить на List<Object>
        myList2.add(number3);
        myList2.add(Number);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Object> objectArrayList = new ArrayList<>();

        collectionWithCollection1(myList1);
        //collectionWithCollection1(integerArrayList); ERROR предлагает сменить <Number> на <Integer>
        //collectionWithCollection1(objectArrayList); ERROR предлагаем сменить <Number> на <Object>

        collectionWithCollection2(myList1);
        collectionWithCollection2(integerArrayList);
        //collectionWithCollection1(objectArrayList); ERROR предлагаем сменить <Number> на <Object>

        collectionWithCollection3(myList1);
        //collectionWithCollection3(integerArrayList); ERROR предлагает сменить <Number> на <Integer>
        collectionWithCollection3(objectArrayList);

        System.out.println(myList1.getClass().getSimpleName());
        System.out.println(integerArrayList.getClass().getSimpleName());
        System.out.println(objectArrayList.getClass().getSimpleName());

        Integer[] integers = new Integer[5];
        Number[] numbers = new Number[4];
        Object[] objects = new Object[7];
        //new CollectionWithArray(integers,numbers,objects); ERROR из-за objects требует каст
        //new CollectionWithArrayS(integers,numbers,objects); ERROR из-за objects требует каст
    }

    public static void collectionWithCollection1(List<Number> numbers) {
    }

    public static void collectionWithCollection2(List<? extends Number> numbers) {
    }

    public static void collectionWithCollection3(List<? super Number> numbers) {
    }
}
    //инвариантность дженериков - отсутствие наследования между производными типами.
