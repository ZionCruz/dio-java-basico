package edu.zion.firstweek;
public class MyClass {

 public static void main (String [] args) {
   
    String firstName = "Zion";
    String secondName = "Cruz";
    String fullName = fullName(firstName, secondName);

    System.out.println(fullName);
 } 

public static String fullName (String firstName, String secondName) {
    return "Result: ".concat(firstName.concat(" ".concat(secondName)));
}
}