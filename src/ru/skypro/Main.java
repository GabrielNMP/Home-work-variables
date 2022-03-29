package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Task 1
        byte pen = 3;
        short pencil = 100;
        int eraser = 1000;
        long stars = 1_000_000_000L;
        float hour = 4.5f;
        double position = 3.56743786;
        char smile = 41;
        boolean aLotEraser = eraser > 3;


        // Task 2
        System.out.println(" Task 2. Answers. ");
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float totalWeight = boxer1 + boxer2;
        double overWeight = boxer2 - boxer1;
        System.out.println("Total weight of boxers = " + totalWeight + " kg");
        System.out.println("Difference in weight = " + overWeight + " kg");

    // Task 3
        System.out.println("------------------");
        System.out.println(" Task 3. Answers. ");
        int banana = 5;
        int bananaWeight = 80;
        int bananaTotal = banana * bananaWeight;
        int milk = 200;
        int milkWeight100Ml = 105;
        double milkWeight1Ml = 105.00 / 100.00;
        double milkTotal = milk * milkWeight1Ml;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int iceCreamTotal = iceCream * iceCreamWeight;
        int egg = 4;
        int eggWeight = 70;
        int eggTotal = egg * eggWeight;
        double breakfastTotal = bananaTotal + milkTotal + iceCreamTotal + eggTotal;
        System.out.println(" Breakfast total weight in gram = " + breakfastTotal + " g ");
        int grPerKg = 1000;
        double totalKg = breakfastTotal / (double)grPerKg;
        System.out.println(" Breakfast total weight in kg = " + totalKg + " kg");

    // Task 4
        System.out.println("__________________");
        System.out.println(" Task 4. Answers. ");
        int weightOut = 7;
        int grToKg = 1000;
        int lossWeigt1 = 250;
        float lossWeigtKg1 = lossWeigt1 / (float)grToKg;
        int lossWeight2 = 500;
        float lossWeightKg2 = lossWeight2 / (float)grToKg;
        float days1 = weightOut / lossWeigtKg1;
        int days11 = (int) days1;
        float days2 = weightOut / lossWeightKg2;
        int days22 = (int) days2;
        float daysMiddle = (days1 + days2) / 2f;
        int daysMiddle2 = (int) daysMiddle;
        System.out.println(" Total days by 250g = " + days11);
        System.out.println(" Total days by 500g = " + days22);
        System.out.println(" Total average value days = " + daysMiddle2);

    // Task 5
        System.out.println(" ________________");
        System.out.println(" Task 5. Answer. ");
        int mashaMonth1 = 67_760;
        int mashaYear1 = mashaMonth1 * 12;
        int denMonth1 = 83_690;
        int denYear1 = denMonth1 * 12;
        int kristinaMonth1 = 76_230;
        int kristinaYear1 = kristinaMonth1 * 12;
        double mashaNew = (mashaMonth1 * 0.1) + mashaMonth1;
        double denNew = (denMonth1 * 0.1) + denMonth1;
        double kristinaNew = (kristinaMonth1 * 0.1) + kristinaMonth1;
        double mashaNewYear = mashaNew * 12;
        double denNewYear = denNew * 12;
        double kristinaNewYear = kristinaNew *12;
        double mashaDelta  = mashaNewYear - mashaYear1;
        double denDelta = denNewYear - denYear1;
        double kristinaDelta =kristinaNewYear - kristinaYear1;
        System.out.println(" Masha's salary now = " + mashaNew + " RUB. Annual income increased in " + mashaDelta + " RUB.");
        System.out.println(" Denis's salary now = " + denNew + " RUB. Annual income increased in " + denDelta + " RUB.");
        System.out.println(" Kristina's salary now = " + kristinaNew + " RUB. Annual income increased in " + kristinaDelta + " RUB.");
















    }
}
