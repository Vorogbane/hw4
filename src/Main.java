public class Main {
    public static void main(String[] args) {
        //Задача1
        int clientOS = 0;
        if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача2
        int productionYear = 2022;
        if (clientOS == 0)
        {
            if (productionYear <= 2014) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (productionYear <=2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
             else
            System.out.println("Установите версию приложения для Android по ссылке");

             //Задача 3
        int year = 2022;
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else System.out.println(year + " год не является високосным");

        //Задача4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Время доставки составит до суток");
        } else
            if (deliveryDistance <= 60) {
                System.out.println("Время доставки составит до двух суток");
            } else
                if (deliveryDistance <=100) {
                    System.out.println("Время доставки составит до трех суток");
                } else
                    System.out.println("Время доставки составит более трех суток");

        //Задача5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " - зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " - весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " - летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " - осенний месяц");
                break;
            default:
                break;
        }

    }
    }

