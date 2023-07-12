// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
        System.out.println("    Задача 1:");
        int a = 10000;
        byte b = 8;
        short c = 200;
        long d = 345247012;
        float fl = 132.5F;
        double e = 23.345215;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("fl = " + fl);
        System.out.println("e = " + e);

    }

    public static void task2() {
        System.out.println("    Задача 2:");
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = 27897;
        short f = -159;
        byte g = 67;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
    }
    public static void task3() {
        System.out.println("    Задача 3:");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short numberPapers = 480;
        int sumStudents = LP + AS + EA;
        int paperForStudent = numberPapers / sumStudents ;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("    Задача 4:");
        short bottlesAnMinute = 16/2;
        short time;
        int bottles;
        time = 20;
        bottles = time * bottlesAnMinute;
        System.out.println("За " + time + " минут машина произвела " + bottles + " штук бутылок");
        time = 1; //сутки
        bottles = (time * 24 * 60) * bottlesAnMinute;
        System.out.println("За " + time + " день машина произвела " + bottles + " штук бутылок");
        time = 3; // 3 дня
        bottles = (time * 24 * 60) * bottlesAnMinute;
        System.out.println("За " + time + " дня машина произвела " + bottles + " штук бутылок");
        time = 1; // месяц (30 дней)
        bottles = (time * 30 * 24 * 60) * bottlesAnMinute;
        System.out.println("За " + time + " месяц машина произвела " + bottles + " штук бутылок");
    }
    public static void task5() {
        System.out.println("    Задача 5:");
        short tins = 120;
        byte white = 2;
        byte brown = 4;
        int classes = tins / (white + brown); // кол-во классов в школе
        int whiteForSchool = classes * white;
        int brownForSchool = classes * brown;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteForSchool + " банок белой краски и " + brownForSchool + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("    Задача 6:");
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        int gramms = bananas * 80 + milk * 105 / 100 + iceCream * 100 + eggs * 70;
        float kg = gramms / 1000.00f;
        System.out.println("количество завтрака в граммах: " + gramms);
        System.out.println("количество завтрака в граммах: " + kg);
    }
    public static void task7() {
        System.out.println("    Задача 7:");
        byte kgSum = 7;
        float grDayMin = 250;
        float daysMax = (kgSum * 1000) / grDayMin;
        System.out.println(daysMax + " дней уйдет на похудение за 250 грамм в день " );
        float grDayMax = 500;
        float daysMin = (kgSum * 1000) / grDayMax;
        System.out.println(daysMin + " дней уйдет на похудение за 500 грамм в день ");
        float daysAv = (daysMin + daysMax)/2;
        System.out.println("потребуется " + daysAv + " дней в среднем, чтобы добиться результата похудения");
    }
    public static void task8() {
        System.out.println("    Задача 8:");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int tmp;
        int dif;

        tmp = masha;
        masha += (masha * 10)/100;
        dif = (masha - tmp)*12;
        System.out.println("Маша теперь получает " + masha + " рублей. Годовой доход вырос на " + dif + " рублей");

        tmp = denis;
        denis += (denis*10)/100;
        dif = (denis-tmp)*12;
        System.out.println("Денис теперь получает " + denis + " рублей. Годовой доход вырос на " + dif + " рублей");

        tmp = kristina;
        kristina += (kristina*10)/100;
        dif = (kristina-tmp)*12;
        System.out.println("Кристина теперь получает " + kristina + " рублей. Годовой доход вырос на " + dif + " рублей");
    }
}