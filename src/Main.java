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

            // Задание2
            int clientDeviceYear = 2017;
            if (clientDeviceYear == 0 && clientDeviceYear > 2015) {
                System.out.println("Установите обычную версию для iOS по ссылке ");
            } else if (clientDeviceYear == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию версию для IOS по ссылке ");
            } else if (clientDeviceYear == 1 && clientDeviceYear > 2015) {
                System.out.println("Установите обычную версию для Андроид по ссылке");
            } else if (clientDeviceYear == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Андроид по ссылке ");
            } else {
                System.out.println("Ваще устройство не поддержиается ");
                }
            }
        }
    }