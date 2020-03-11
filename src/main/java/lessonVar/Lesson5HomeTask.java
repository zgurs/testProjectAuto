package lessonVar;

import java.util.Scanner;

public class Lesson5HomeTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstVar, secondVar;

        System.out.print("Ведите первое число:  ");
        firstVar = scanner.nextLine();
        Integer convertedVarA = Integer.parseInt(firstVar);

        System.out.print("Введите второе число:  ");
        secondVar = scanner.nextLine();
        Integer convertedVarB = Integer.parseInt(secondVar);

        Integer varsForSum = plus(convertedVarA, convertedVarB);
        Integer varsForSub = minus(convertedVarA,convertedVarB);
        display(varsForSum,varsForSub, convertedVarA, convertedVarB);



    }
//    //решил вынести парсер строки чтобы не копировать
//    public  static  Integer parser(String parsedString){
//        Integer converted = Integer.parseInt(parsedString);
//        return converted;
//    }

    public static int plus(int firstVarSum, int secondVarSum){
        Integer sumVar = firstVarSum + secondVarSum;
        return sumVar;
    }

    public  static int minus(int firstVarSub, int secondVarSub){
        Integer subVar = firstVarSub - secondVarSub;
        return subVar;
    }

    public  static  void  display(int sumVar, int subVar, int convertedVar1, int convertedVar2 ){
        System.out.println("Вы сложили числа " + convertedVar1 + " и "+convertedVar2 + " и получили: " + sumVar);
        System.out.println("Вы вычли из числа " + convertedVar1 + " число "+convertedVar2 + " и получили: " + subVar);
    }
}
