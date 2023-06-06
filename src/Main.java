public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;

        if (calculateLeapYearOrNot(year) == true) {
            System.out.println(year + "-й год является високосным");
        } else {
            System.out.println(year + "-й год не является високосным");
        }
        System.out.println();
    }

    public static boolean calculateLeapYearOrNot(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }


    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;

        System.out.println(controllingUserOSVersion(clientOS, clientDeviceYear));
        System.out.println();
    }

    public static String controllingUserOSVersion(int clientOS, int clientDeviceYear) {
        String message = "";
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    message = "Установите версию приложения для iOS по ссылке";
                } else {
                    message = "Установите облегченную версию приложения для iOS по ссылке";
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    message = "Установите версию приложения для Android по ссылке";
                } else {
                    message = "Установите облегченную версию приложения для Android по ссылке";
                }
        }
        return message;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = 0;

        System.out.println(calculationOfDelivery(deliveryDistance, deliveryDays));
        System.out.println();

    }

    public static String calculationOfDelivery(int deliveryDistance, int deliveryDays) {
        String message = "";
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else if (deliveryDistance > 100) {
            deliveryDays = 0;
        }

        switch (deliveryDays) {
            case 1:
                message = "Потребуется дней: " + deliveryDays;
                break;
            case 2:
                message = "Потребуется дней: " + deliveryDays;
                break;
            case 3:
                message = "Потребуется дней: " + deliveryDays;
                break;
            default:
                message = "Доставки нет";
                break;
        }
        return message;
    }

}