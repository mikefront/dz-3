public class Main {
    public static void main(String[] args) {


        // Задание1
        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println(" у вас IOS ");
        } else if (clientOs == 1) {
            System.out.println(" у вас Андроид ");
        } else {
            System.out.println(" ОС не найдена ");

            // Задание2
            int clientDeviceYear = 2022;
            if (clientDeviceYear == 0 && clientDeviceYear > 2015) {
                System.out.println("Установите обычную версию iOS ");
            } else if (clientDeviceYear == 0 && clientDeviceYear > 2018) {
                System.out.println("Установите Lite версию IOS ");
            } else if (clientDeviceYear == 1 && clientDeviceYear > 2015) {
                System.out.println("Установите обычную версию Андроид ");
            } else if (clientDeviceYear == 1 && clientDeviceYear > 2018) {
                System.out.println("Установите Lite версию Андроид ");
            } else {
                System.out.println("Ваще устройство не поддержиается ");

                // Задание3
                int year = 2023;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.printf("Год %s високосный ", year);
                } else {
                    System.out.printf("Год %s не високосный ", year);
                }
            }
        }
    }
}