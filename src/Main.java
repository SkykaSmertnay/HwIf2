import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание №1
        System.out.println("\n Задание №1");
        boolean clientOS;
        Scanner scan = new Scanner(System.in);
        System.out.print("Какая у вас операционная система: 1. iOS\t2.Android \n Ваш ответ: ");
        byte oS;
        oS = scan.nextByte();
        if (oS == 1)
        {
            clientOS = false;
        }
        else
        {
            clientOS = true;
        }
        if (clientOS)
        {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else
        {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        // Задание №2
        System.out.println("\n Задание №2");
        short clientDeviceYear;
        System.out.print("Какая у вас операционная система: 1. iOS\t2.Android \n Ваш ответ: ");
        byte oS2;
        oS2 = scan.nextByte();
        System.out.println("Введите год выпуска вашего телефона:");
        clientDeviceYear = scan.nextShort();
        if ((oS2 == 1 && clientDeviceYear < 2015) )
        {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");

        }
        else if (oS2 == 1)
        {
            System.out.println("Установите версию приложения для iOS по ссылке.");

        }
        if (oS2 == 2 && clientDeviceYear < 2015)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");

        }
        else if (oS2 == 2)
        {
            System.out.println("Установите версию приложения для Android по ссылке.");

        }
        // Задание №3
        System.out.println("\n Задание №3");
        int year;
        System.out.println("Введите год :");
        year = scan.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) && (year >= 1584 ))
        {
            System.out.println(year + " год является високосным");
        }
        else
        {
            System.out.println(year + " год не является високосным");
        }
        // Задание №4
        System.out.println("\n Задание №4");
        int deliveryDistance;
        int deliveryDays;
        System.out.print("Введите расстояние до клиента: ");
        deliveryDistance = scan.nextInt();
        if (deliveryDistance <= 20)
        {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays );
        }
        else if ( deliveryDistance <= 60)
        {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays );

        }
        else if (deliveryDistance <= 100)
        {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays );

        }
        else
        {
            System.out.println("Доставки нет");
        }
        // Задание №5.
        System.out.println("\n Задание №5");
        int monthNumber;
        System.out.println("Введите номер меяца: ");
        monthNumber = scan.nextInt();

        switch (monthNumber)
        {
            case (1), (2), (12):
                System.out.println("Этот месяц принадлежыт к сезону зима.");
                break;
            case (3), (4), (5):
                System.out.println("Этот месяц принадлежыт к сезону весна.");
                break;
            case (6), (7), (8):
                System.out.println("Этот месяц принадлежыт к сезону лето.");
                break;
            case (9), (10), (11):
                System.out.println("Этот месяц принадлежыт к сезону осень.");
                break;

            default:
                System.out.println("Error");
        }
        // Задание №5.1
        System.out.println("\n Задание №5.1");
        switch (monthNumber)
        {
            case (1):
                System.out.println("Январь этот месяц принадлежыт к сезону зима.");
                break;
            case (2):
                System.out.println("Февраль этот месяц принадлежыт к сезону зима.");
                break;
                case (12):
            System.out.println("Декабрь этот месяц принадлежыт к сезону зима.");
            break;
            case (3):
                System.out.println("Март этот месяц принадлежыт к сезону весна.");
                break;
            case (4):
                System.out.println("Апрель этот месяц принадлежыт к сезону весна.");
                break;
                case (5):
            System.out.println("Май этот месяц принадлежыт к сезону весна.");
            break;
            case (6):
                System.out.println("Июнь этот месяц принадлежыт к сезону лето.");
                break;
            case (7):
                System.out.println("Июль этот месяц принадлежыт к сезону лето.");
                break;case (8):
            System.out.println("Август этот месяц принадлежыт к сезону лето.");
            break;
            case (9):
                System.out.println("Сентябрь этот месяц принадлежыт к сезону осень.");
                break;
            case (10):
                System.out.println("Октябрь этот месяц принадлежыт к сезону осень.");
                break;
            case (11):
                System.out.println("Ноябрь  этот месяц принадлежыт к сезону осень.");
                break;

            default:
                System.out.println("Error");
        }




    }
}