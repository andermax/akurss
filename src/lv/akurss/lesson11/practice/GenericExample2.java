package lv.akurss.lesson11.practice;
import java.util.ArrayList;
import java.util.List;
public class GenericExample2 {


    public static void main(String[] args) {

        List<Number>l1 = new ArrayList<>();
        List<Number>l2 = new ArrayList<>();
        List<Number>l3 = new ArrayList<>();

        printNumber(l1);
        printNumber(l2);
        printNumber(l3);



    }


    private static void printNumber(List<? extends Number> list){ //ograni4enija tipov dlja number
        for (Number number: list){
            System.out.println(number);
        }

    }
    private static void printNumber(Number n){
        System.out.println(n);
    }

}
