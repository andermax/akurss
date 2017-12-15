package lv.akurss.lesson11.practice;

import lv.akurss.lesson8.lecture.maps.HashMapExample;

import java.util.HashMap;
import java.util.Map;

public class GenericClassExample {
    public static void main(String[] args) {

        Box<String, Long> b1 = new Box<>(1L, "Test");
        Box<Integer, Integer> b2 = new Box<>(2, 155);
        Map<String, String> map = new HashMap<>();


    }

    public static class Box<M, V extends Number> {

        private V id;
        private M value;

        public Box(V id, M value) {
            this.id = id;
            this.value = value;
        }


        public M getValue() { return value;}
    }
}


