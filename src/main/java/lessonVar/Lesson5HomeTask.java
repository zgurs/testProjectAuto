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
    public static int plus(int firstVarSum, int secondVarSum){
        Integer sumVar = firstVarSum + secondVarSum;
        return sumVar;
    }

    public  static int minus(int firstVarSub, int secondVarSub){
        Integer subVar = firstVarSub - secondVarSub;
        return subVar;
    }

    public  static  void  display(int sumVar, int subVar, int convertedVar1, int convertedVar2 ){
        System.out.println(String.format("Вы сложили числа '%s' и '%s' и получили: '%s'", convertedVar1, convertedVar2, sumVar));
        System.out.println(String.format("Вы вычли из числа '%s' и '%s' и получили: '%s'", convertedVar1, convertedVar2, subVar));
    }
}
