//package lessonVar;
//
//import java.util.Scanner;
//
//public class Lesson4 {
//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        String firstVarA, secondVarB;
//        System.out.print("Please enter variable a: ");
//        firstVarA = scanner.nextLine();
//        Integer convertedVarA = Integer.parseInt(firstVarA);
//
//        System.out.print("Please enter variable b: ");
//        secondVarB = scanner.nextLine();
//        Integer convertedVarB = Integer.parseInt(secondVarB);
//
//        Integer sumOfVar = convertedVarA + convertedVarB;
//        Integer subtractionOfVar = convertedVarA - convertedVarB;
//
//        System.out.println(ANSI_RED + "Sum result: " + sumOfVar + ANSI_RESET);
//        System.out.println(ANSI_GREEN+ "Subtraction: " + subtractionOfVar + ANSI_RESET);
//
//
//    }
//}
