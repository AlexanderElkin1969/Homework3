public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte typeByte = 100;
        short typeShort = 1000;
        int typeInt = 1000000;
        long typeLong = 1000000000L;
        float typeFloat;
        double typeDouble;
        typeFloat = 1f/ 3;
        typeDouble = 1d/ 3;

        System.out.println("Значение переменной typeByte с типом byte  равно "+typeByte);
        System.out.println("Значение переменной typeShort с типом short равно "+typeShort);
        System.out.println("Значение переменной typeInt с типом int равно "+typeInt);
        System.out.println("Значение переменной typeLong с типом long равно "+typeLong);
        System.out.println("Значение переменной typeFloat с типом float равно "+typeFloat);
        System.out.println("Значение переменной typeDouble с типом double равно "+typeDouble);
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte typeByte = 67;
        short typeShort1 = -159;
        short typeShort2 = 569;
        int typeInt = 27897;
        long typeLong = 987678965549L;
        float typeFloat = 27.12f;
        double typeDouble = 2.786d;
        System.out.println("Значение переменной typeByte с типом byte  равно "+typeByte);
        System.out.println("Значение переменной typeShort1 с типом short равно "+typeShort1);
        System.out.println("Значение переменной typeShort2 с типом short равно "+typeShort2);
        System.out.println("Значение переменной typeInt с типом int равно "+typeInt);
        System.out.println("Значение переменной typeLong с типом long равно "+typeLong);
        System.out.println("Значение переменной typeFloat с типом float равно "+typeFloat);
        System.out.println("Значение переменной typeDouble с типом double равно "+typeDouble);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int numberStudents1 =23;
        int numberStudents2 =27;
        int numberStudents3 =30;
        int numberPaper =480;
        numberPaper=numberPaper /(numberStudents1+numberStudents2+numberStudents3);
        System.out.println("На каждого ученика рассчитано "+numberPaper+" листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int productivity =16;
        int time =2;
        int period =20;
        int amount =productivity*period/time;
        System.out.println("За 20 минут машина произвела "+amount +" штук бутылок");
        period =24*60;
        amount =productivity*period/time;
        System.out.println("За сутки машина произвела "+amount +" штук бутылок");
        period =3*period;
        amount =productivity*period/time;
        System.out.println("За 3 дня машина произвела "+amount +" штук бутылок");
        period =10*period;
        amount =productivity*period/time;
        System.out.println("За 30 дней машина произвела "+amount +" штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
    }
    public static void task6() {
        System.out.println("Задача 6");
    }
    public static void task7() {
        System.out.println("Задача 7");
    }
    public static void task8() {
        System.out.println("Задача 8");
    }
}