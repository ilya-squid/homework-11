import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        isLeapYear(2000);
        isLeapYear(2100);
        isLeapYear(2024);

        checkOS(0, 2000);
        checkOS(1, 2024);

        System.out.println("Потребуется дней для доставки: " + calculateTime(60));
    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculateTime(int distance){
            if (distance <= 20) {
                return 1;
            } else if (distance > 20 && distance <= 60) {
                return 2;
            } else if (distance > 60 && distance <= 100) {
                return 3;
            }
                return -1;
            }
    }