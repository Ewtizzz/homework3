public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte oneByte = 127;
        short twoBytes = 32767;
        int fourBytes = 2147483647;
        long eightBytes = 922337203;
        float veryBigNumber = 100000000;
        double insaneBigNumber = 1000000000;

        System.out.println("Значение переменной oneByte с типом byte равно " + oneByte);
        System.out.println("Значение переменной twoBytes с типом short равно " + twoBytes);
        System.out.println("Значение переменной fourBytes с типом int равно " + fourBytes);
        System.out.println("Значение переменной eightBytes с типом long равно " + eightBytes);
        System.out.println("Значение переменной veryBigNumber с типом float равно " + veryBigNumber);
        System.out.println("Значение переменной insaneBigNumber с типом double равно " + insaneBigNumber);

        float cat = 27.12f;
        float dog = 987678965549f;
        byte mouse = 2;
        short bird = 786;
        boolean answer = false;
        short number = 569;
        int notNumber = -159;
        short bigNumber = 27897;
        byte snake = 67;

        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        short amountOfPaper = 480;
        int paperForEachStudent = 480/(firstClass + secondClass + thirdClass);
        System.out.println(paperForEachStudent);

        int bottlesInTwoMinutes = 16;
        int bottlesInOneMinute = bottlesInTwoMinutes / 2;
        int bottlesInTwentyMinutes = bottlesInOneMinute * 20;
        int bottlesInOneDay = bottlesInOneMinute * 24 * 60;
        int bottlesInThreeDays = bottlesInOneDay * 3;
        int bottlesInOneMonth = bottlesInOneDay * 31;

        System.out.println("За минуту машина произвела " + bottlesInOneMinute + " бутылок");
        System.out.println("За 20 минут машина произвела " + bottlesInTwentyMinutes + " бутылок");
        System.out.println("За 1 день машина произвела " + bottlesInOneDay + " бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesInThreeDays + " бутылок");
        System.out.println("За месяц машина произвела " + bottlesInOneMonth + " бутылок");

        int dyeNeeded = 120;
        int whiteDye = 2;
        int brownDye = 4;
        int classes = dyeNeeded / (whiteDye + brownDye);
        int boughtWhiteDye = classes * whiteDye;
        int boughtBrownDye = classes * brownDye;
        System.out.println("в школе где " + classes + " классов, нужно " + boughtWhiteDye + " банок белой краски и " + boughtBrownDye + " банок коричневой краски");

        int amountOfBananas = 5;
        int amountOfMilk = 2;
        int amountOfIceCream = 2;
        int amountOfEggs = 4;
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggsWeight = 70;
        int kilogramm = 1000;

        int allWeights = (amountOfBananas * bananaWeight) + (amountOfMilk * milkWeight) + (amountOfIceCream * iceCreamWeight) + (amountOfEggs * eggsWeight);
        System.out.println(allWeights / kilogramm);

        int weightToLose = 7000;
        int losingWeightOne = 250;
        int losingWeightSecond = 500;
        int daysForFirst = weightToLose / losingWeightOne;
        int daysForSecond = weightToLose / losingWeightSecond;
        System.out.println(daysForFirst);
        System.out.println(daysForSecond);
        int daysInAverage = (daysForFirst + daysForSecond) / 2;
        System.out.println(daysInAverage);

        int Masha = 67760;
        int Denis = 83960;
        int Kristina = 76203;
        int mashaYear = Masha * 12;
        double mashaNewYear = (Masha * 1.1) * 12;
        double mashaDifference = mashaNewYear - mashaYear;
        int denisYear = Denis * 12;
        double denisNewYear = (Denis * 1.1) * 12;
        double denisDifference = denisNewYear - denisYear;
        int kristinaYear = Kristina * 12;
        double kristinaNewYear = (Kristina * 1.1) * 12;
        double kristinaDifference = kristinaNewYear - kristinaYear;
        System.out.println("Маша теперь получает " + mashaYear + " рублей. Годовой доход вырос на " + mashaDifference);
        System.out.println("Денис теперь получает " + denisYear + " рублей. Годовой доход вырос на " + denisDifference);
        System.out.println("Кристина теперь получает " + kristinaYear + " рублей. Годовой доход вырос на " + kristinaDifference);





    }
}