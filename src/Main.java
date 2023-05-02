public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS1 = 1 ;
        int clientOS2 = 0;
        if (clientOS2 == 0) {
            System.out.println("Система, которую использует клиент, iOS. Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1) {
        }System.out.println("Система, которую использует клиент, Android. Установите версию приложения для Android по ссылке");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
                System.out.println("Ваша версия системы iOS подходит для установки приложения");
            } else {
                if (clientDeviceYear < 2015)
                        System.out.println("Версия системы iOS устарела. Установите облегченную версию приложения для iOS по ссылке");
            }if (clientDeviceYear >= 2015) {
                System.out.println("Ваша версия системы Android подходит для установки приложения");
                } else {
                    if (clientDeviceYear < 2015)
                            System.out.println("Версия системы Android устарела. Установите облегченную версию приложения для Android по ссылке");
                }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistanceKm = 95;
        int deliveryTimeDaysPer40Km = 1;
         if (  deliveryDistanceKm <= 40) {
             System.out.println("Доставка занимает " +deliveryTimeDaysPer40Km+ " день");
         }if ( deliveryDistanceKm > 40 && deliveryDistanceKm <= 60 ) {
             System.out.println("Доставка занимает " +deliveryTimeDaysPer40Km*2+ " дня ");
        }if (  deliveryDistanceKm <= 100 && deliveryDistanceKm >60) {
            System.out.println("Доставка занимает " +deliveryTimeDaysPer40Km*3+ " дня ");
    }else {
        System.out.println("Свыше 100 км доставки нет");
    }
}
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 5:
            case 4:
                System.out.println("Весна");
                break;
            case 6:
            case 8:
            case 7:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
}
}
}

