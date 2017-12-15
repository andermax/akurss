package lv.akurss.lesson11.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericExaple {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list2 = createList2(1,3,4,"str");
      //  Integer a = list2.get(3); // umret cast exeption


        List<Integer> list3 = createList3(1,3,4,6);
//        Integer b = list2.get(3);

    //    print2("test");
    //    print2(20);
    // /   print2(20.5);

      //  Comparable a = max(15, 20);
     //   Comparable b = max(1.5, 30.5);
     //   Comparable c = max("A","Z");

        Integer w = (Integer) max(15, 20); //casting

        String e = max2("A","Z");

    }
    public static<E> List<E> createList3(E... values) { // s generikom

        List<E> l = new ArrayList();
        Collections.addAll(l, values);
        return l;
    }
    public static List createList(Object[] values) {

        List l = new ArrayList();

        for (Object v: values){
            l.add(v);
        }
        return l;
    }
    public static List createList2(Object... values) {

        List l = new ArrayList();

        for (Object v: values){
            l.add(v);
        }
        return l;
    }

    public static void print(Object s){ // s lubim generic ne nuzhen
        System.out.println(s);
    }

    public static <T> void print2( T s){ // generic <T> T tip dannih
        System.out.println(s);
    }
    public static <T  extends Number> void print3( T s){ // generic <T> s ograni4eniem
        System.out.println(s);
    }
    public static Comparable max(Comparable one, Comparable two){
        int i = one.compareTo(two);

        if (i<0) {
            return two;
        }
        return one;

    }

    public static <T extends Comparable>T max2(T one, T two){

        int i = one.compareTo(two);
        if (i<0) {
            return two;
        }
        return one;
    }

}
