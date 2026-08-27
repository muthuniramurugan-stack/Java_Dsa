package Hashmap;

import java.util.HashSet;

public class HashsetBasic {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Grapes");
        set.add("Banana"); // used to add values
        System.out.println(set); // prints all the values in the set
        System.out.println(set.contains("Apple"));// checks wheather the values rae presented in the set or not
    }
}
