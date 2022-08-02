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
        }
    }