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
        int consumptionWhiteColour =2;
        int consumptionBrownColour =4;
        int commonQuantity =120;
        int numberRooms = commonQuantity/(consumptionWhiteColour+consumptionBrownColour);
        consumptionWhiteColour =consumptionWhiteColour*numberRooms ;
        consumptionBrownColour =consumptionBrownColour*numberRooms ;
        System.out.println("В школе, где "+numberRooms+" классов, для ремонта нужно");
        System.out.println(consumptionWhiteColour+" банок белой и "+consumptionBrownColour+" банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int numberBananas =5;
        int weitBananas =80;
        int numberMilk =2;
        int weitMilk =105;
        int numberIceCream =2;
        int weitIceCream =100;
        int numberEgg =4;
        int weitEgg =70;
        float commonWeit =numberBananas*weitBananas+numberMilk*weitMilk+numberIceCream*weitIceCream+numberEgg*weitEgg;
        System.out.println("Общий вес завтрака составляет "+commonWeit+" грамм, или "+commonWeit/1000+" килограмм");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int commonWeit =7000;
        int minEffectiveness =250;
        int maxEffectiveness =500;
        int numberDays =commonWeit/minEffectiveness;
        System.out.println("Спортсмен сможет сбросить "+commonWeit/1000+" кг за "+numberDays+" дней худея по 250 грамм");
        numberDays =commonWeit/maxEffectiveness;
        System.out.println("Спортсмен сможет сбросить "+commonWeit/1000+" кг за "+numberDays+" дней худея по 500 грамм");
        numberDays =(commonWeit/maxEffectiveness+commonWeit/minEffectiveness)/2;
        System.out.println("В среднем потребуется "+numberDays+" дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        float salaryMasha =67760f;
        float salaryDenis =83690f;
        float salaryKristina =76230f;
        float increase = 0.1f*salaryMasha;
        System.out.println("Маша теперь получает "+salaryMasha*1.1f+" рублей. Годовой доход вырос на "+12*increase+" рублей");
        increase = 0.1f*salaryDenis;
        System.out.println("Денис теперь получает "+salaryDenis*1.1f+" рублей. Годовой доход вырос на "+12*increase+" рублей");
        increase = 0.1f*salaryKristina;
        System.out.println("Кристина теперь получает "+salaryKristina*1.1f+" рублей. Годовой доход вырос на "+12*increase+" рублей");
    }
}