package lessonVar;

public class test {
    public static Integer totalMinutesSpent = 0;
    public static void main(String[] args) {

        wakeUp(10);
        toothWashing(5);
        takeEat(20);
        doCleaning(120);
        watchSeries(360);
        takeEat(20);
        goSleep(480);

        System.out.format("Я потратил минут " + totalMinutesSpent);

    }
    public static void wakeUp(int time){
        System.out.println("Проснулся");
        totalMinutesSpent(time);
    }
    public static void toothWashing(int time){
        System.out.println("Чищу зубы");
        totalMinutesSpent(time);
    }
    public static void takeEat(int time){
        System.out.println("Кушаю");
        totalMinutesSpent(time);
    }
    public static void doCleaning(int time){
        System.out.println("Убираю квартиру");
        totalMinutesSpent(time);
    }
    public static void watchSeries(int time){
        System.out.println("Смотрю сериалы");
        totalMinutesSpent(time);
    }
    public static void goSleep(int time){
        System.out.println("Лег спать");
        totalMinutesSpent(time);
    }

    public static void totalMinutesSpent(int time){
        totalMinutesSpent += time;
    }

    public static double toHour(int hour) {
        int toHour = 60;
        double  hour  = totalMinutesSpent / ;
        return hour + ;

    }

}
