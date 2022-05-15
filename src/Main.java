public class Main {
    public static void main(String[] args) {
        //task1
        int year = 2020;
        printLeapYear(year);
        //task2
        int clientOS= 1;
        int clientDeviceYear = 2014;
        suggestVersion( clientOS,clientDeviceYear);
        //task3.
        int deliveryDistance = 67;
        int deliveryDays = 0;
        //int countDeliveryDays = countDeliveryDays(deliveryDistance);
        System.out.println( "Потребуется дней " + countDeliveryDays(deliveryDistance));







    }
    public static void printLeapYear (int year){
        boolean isLeapYear=isLeapYear(year);
        if (isLeapYear){
            System.out.println(year + "  высокосный год");
        } else  {
            System.out.println(year + " Не высокосный год ");}
    }
    public static boolean isLeapYear(int year){
        return year % 4==0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void suggestVersion (int clientOS,int clientDeviceYear){
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {

            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                if (clientOS == 0 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для IOS по ссылке ");
                } else {
                    if (clientOS == 0 && clientDeviceYear < 2015) {
                        System.out.println(" Установите облегченную версию для IOS по ссылке");
                    }
                }
            }
        }
    }
    public static int countDeliveryDays ( int deliveryDistance){
        int deliveryDays = 0;
        if (deliveryDistance <20) {
             deliveryDays=1;
        }else{
            if (deliveryDistance  > 20  && deliveryDistance<=60) {
              deliveryDays=2;
            }else{
                if (deliveryDistance >60 && deliveryDistance<= 100) {
                    deliveryDays=3;
                }
            }
        }
        return deliveryDays;
    }
}