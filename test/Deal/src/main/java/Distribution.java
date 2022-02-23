import org.apache.commons.math.util.MathUtils;

public class Distribution {

    private final static double INCOME = 102_719.23;

    private final static double MININCOME = 100_000;
    private final static double MIDDLEINCOME = 150_000;
    private final static double PERCENT10 = 10.0 / 100;
    private final static double PERCENT1 = 1.0 / 100;
    private final static double PERCENT05 = 0.5 / 100;


    public int invest10() {
        double x = Math.round(INCOME * PERCENT10);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int invest1() {
        double x = Math.round(INCOME * PERCENT1);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int invest05() {
        double x = Math.round(INCOME * PERCENT05);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int zpManager() {
        double x = INCOME * 7.0 / 100;
        double y = INCOME * 3.5 / 100;

        return INCOME >= MININCOME ? (int) MathUtils.round(x, -2, +2) : (int) MathUtils.round(y, -2, +2);
    }

    public int zpSalesman() {
        if (INCOME >= MININCOME && INCOME < MIDDLEINCOME) {
            double x = Math.round(INCOME * 20.0 / 100);
            return (int) MathUtils.round(x, -2, +2);
        } else if (INCOME > 0 && INCOME < MININCOME) {
            double x = Math.round(INCOME * 15.0 / 100);
            return (int) MathUtils.round(x, -2, +2);
        } else if (INCOME >= MIDDLEINCOME) {
            double x = Math.round(INCOME * 25.0 / 100);
            return (int) MathUtils.round(x, -2, +2);
        }
        return 0;
    }

    public int zpAssistant() {
        double x = INCOME * 3.0 / 100;
        double y = INCOME * 1.5 / 100;
        return INCOME >= MININCOME ? (int) MathUtils.round(x, -2, +2) : (int) MathUtils.round(y, -2, +2);
    }

    public int expenses() {
        return Math.round(zpManager() + zpSalesman() + zpAssistant() + invest10() + invest10() + invest1() + invest05());
    }

    public double profit() {
        return Math.round(INCOME - zpManager() - zpSalesman() - zpAssistant() - invest10() - invest10() - invest1() - invest05());
    }


    public String toString() {
        return "ЗП менеджера (Мансур К): " + zpManager() + " руб." + "\n" +
                "ЗП продавца (Минкаил Х): " + zpSalesman() + " руб." + "\n" +
                "ЗП ассистент  (Магдан Х): " + zpAssistant() + " руб." + "\n" +
                "Инвестиции Амины Н: " + invest10() + " руб." + "\n" +
                "Инвестиции Айза У: " + invest10() + " руб." + "\n" +
                "Инвестиции Мансура: " + invest1() + " руб." + "\n" +
                "Инвестиции Минкаила: " + invest05() + " руб." + "\n" +
                "Прибыль: " + profit() + " руб." + "\n" +
                "Сумма Расходов: " + expenses() + " руб.";

    }
}
