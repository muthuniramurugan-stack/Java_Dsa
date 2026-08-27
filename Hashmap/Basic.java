// Hashmap Basics
package Hashmap;
import java.util.HashMap;
public class Basic {
    public static void main(String[] args) {
        HashMap<String,Integer> student = new HashMap<>();
        student.put("Muthu",18);
        student.put("Muthu",21);// duplicates are not allowed in hashmap it takes recently added values
        student.put("Murugan",20);
        System.out.println(student);
        System.out.println(student.get("Muthu")); // takes the value using key
        System.out.println(student.isEmpty());// checks wheather the hashmap is empty or not if it is empty it returns true
        student.clear();// clears all the key and values in linked list
        student.remove("Murugan"); // removes the value in hashmap using key
        System.out.println(student.size()); // shows how many pairs are presented in the HashMap
        System.out.println(student.values()); // displays all the values in the HashMAp not the keys
        System.out.println(student.keySet()); // displays all the Keys in the HashMAp not the Values

    }
}
