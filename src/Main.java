public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

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
            System.out.println(year + "Год високосный");
        } else {
            System.out.println(year + "год не високосный");
        }

    }
}