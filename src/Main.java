public class Main {
    public static void main(String[] args) {

        // Задание1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("У вас IOS ");
        } else if (clientOs == 1) {
            System.out.println("У вас Андроид ");
        } else {
            System.out.println(" ОС не найдена ");
        }

        // Задание2
        int clientDeviceYear = 2022;
        if (clientOs == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию для iOS по ссылке ");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию версию для IOS по ссылке ");
        } else if (clientOs == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию для Андроид по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Андроид по ссылке ");
        }

        // Задание3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "Год високосный ");
        } else {
            System.out.println(year + "год не високосный ");
        }

        // Задание4
        int deliveryDistance = 95;
        int kilometreLimit = 20;
        int deliveryDays = 1;
        int kilometers = 40;
        if (deliveryDistance <= kilometreLimit) {
        } else {
            deliveryDays = ((deliveryDistance - kilometreLimit) / kilometers) + deliveryDays;
        }
        System.out.println(" Доставка дней - " + deliveryDays);

        // Задание5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень ");
                break;
            default:
                System.out.println("Такого месяца нет ");

        }

    }


    }