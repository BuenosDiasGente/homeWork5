public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int clientOS=0;
                if(clientOS==0){
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                if (clientOS==1){
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }

    }
    public static void task2(){
        System.out.println("Задача 2");
        int clientOS=1;
        int clientDeviceYear=2015;
        if(clientOS==0 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        else if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS==1 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

    }
    public static void task3(){
        System.out.println("Задача 3");
        int year=2024;
        if (year<=100 && year%4==0){
            System.out.println("Год " + year+ " является високосным.");
        }
        if ( year>100 && year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Год " + year+ " является високосным.");
        }
        else {
            System.out.println("Год " + year+ " не является високосным.");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if(deliveryDistance<20){
                System.out.println("Потребуется 1 день для доставки." );
        }
        else if (deliveryDistance>=20 && deliveryDistance<60){
            System.out.println( "Потребуется 2 дня для доставки.");
        }
        else if (deliveryDistance>=60 && deliveryDistance <=100){
            System.out.println( "Потребуется 3 дня для доставки.");
        }
        else{
            System.out.println(" Доставки нет.");
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        int  monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("1-й месяц (он же январь) принадлежит к сезону зима.");
            case 2:
                System.out.println("2-й месяц (он же февраль) принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("3-й месяц (он же март) принадлежит к сезону весна.");
            case 4:
                System.out.println("4-й месяц (он же апрель) принадлежит к сезону весна.");
            case 5:
                System.out.println("5-й месяц (он же май) принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("6-й месяц (он же июнь) принадлежит к сезону лето.");
            case 7:
                System.out.println("7-й месяц (он же июль) принадлежит к сезону лето.");
            case 8:
                System.out.println("8-й месяц (он же август) принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону осень.");
            case 10:
                System.out.println("10-й месяц (он же октябрь) принадлежит к сезону осень.");
            case 11:
                System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("12-й месяц (он же декабрь) принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Всего 12 месяцев.Такого месяца не существует.");

        }
    }
}