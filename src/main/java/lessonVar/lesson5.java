package lessonVar;

public class lesson5 {
    public static void main(String[] args) {

        String cat = petName("cat", "cat", '/');
        displayName(cat);
    }

    public static String petName(String name, String surName, char delimiter){

        String pet = name + delimiter + surName ;
        return pet;
    }
    public static void displayName(String pet){
        System.out.println(pet);
    }
}
