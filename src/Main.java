public class Main {
    public static void main(String[] args) {
        // Задание1
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println(" у вас IOS ");
        } else if (clientOs == 1) {
            System.out.println(" у вас Андроид ");
        } else {
            System.out.println(" ОС не найдена ");
            System.out.println(" коммит и пуш");

           // Задание2
        int clientOs = 0;
        int year = 2015;
        if ( clientOs == 0 && year > 2019 ) {
            System.out.println(" Установите обычную версию Андроид ");
        } else if ( clientOs == 0 && year < 2019 ){
        System.out.println(" Установите Lite версию Андроид ");
        } else if ( clientOs == 1 && clientOs < 2019){
        System.out.println(" Установите обычную версию IOS ");
        } else if ( clientOs == 1 && clientOs < 2019){
        System.out.println("Установите Lite версию IOS");
        } else {
            System.out.println(" Ваще устройство не поддержиается ");
        }