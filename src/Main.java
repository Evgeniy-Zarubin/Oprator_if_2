public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Пора обновить телефон");

        }

        //Задача 2
        int clientOS2 = 1;
        int clientDeviceYear = 2018;
        if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Пора обновить телефон");
        }
        //Задача 3
        int year = 2021;

        if (year % 400 == 0 && year > 1584) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0 && year > 1584) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year > 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным или ещё не введён");
        }

        //Задача 4
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + deliveryDay + " дней: + срок доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется " + deliveryDay + " дней: + срок доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется " + deliveryDay + " дней: + срок доставки");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        //Задача 5
        int monthNumber = 11;
        switch (monthNumber) {
            case 12,1,2:
                System.out.println("Месяц принадлежит сезону - Зима");
                break;
            case 3,4,5:
                System.out.println("Месяц принадлежит сезону - Весна");
                break;
            case 6,7,8:
                System.out.println("Месяц принадлежит сезону - Лето");
                break;
            case 9,10,11:
                System.out.println("Месяц принадлежит сезону - Осень");
                break;
            default:
                System.out.println("Месяц введён не корректно. Проверьте правильность ввода месяца");
        }

    }
}