package com.csc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Zipper {
       
    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> newlist = new ArrayList<>();
            for (int i = 0; i < list1.size() || i < list2.size(); i++) {
                if (i < list1.size()) {
                newlist.add(list1.get(i));
                }
                if (i < list2.size()) {
                newlist.add(list2.get(i));
                }
            }
            return newlist;
        }

        public static <x, y> HashMap<x, y> hashmapify(List<x> keys, List<y> values) {
            if (keys.size() != values.size()) {
                throw new IllegalArgumentException("The size of keys and values must be the same.");
            }
    
            HashMap<x, y> map = new HashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
            return map;
        }
    public static void main(String[] args) {
        List<Integer> n1 = List.of(1, 3, 5);
        List<Integer> n2 = List.of(2, 4, 6, 8);
        List<Integer> mergenumbers = zip(n1, n2);
        System.out.println(mergenumbers);
              
        List<String> primary = List.of("Red", "Yellow", "Blue");
        List<String> secondary = List.of("Orange", "Green", "Purple");
        List<String> colors = zip(primary, secondary);
        System.out.println(colors);

        List<String> colorsList = List.of("White", "Black", "Brown", "Pink");
        List<Integer> nums = List.of(1, 3, 5, 7);
        HashMap<String, Integer> map = hashmapify(colorsList, nums);
        System.out.println("{White=" + map.get("White") + ", Black=" + map.get("Black") +
        ", Orange=" + map.get("Brown") + ", Pink=" + map.get("Pink") + "}");
    }        
}
