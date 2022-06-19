import org.apache.commons.math.util.MathUtils;

public class Dopamine {
    private final static double DINCOME = 15082.50;
    private final static double AS_INCOME = 1230;
    private final static double AS_PERCENT = 30.0 / 100;
    private final static double ZP_JOB = 10.0 / 100;
    private final static double MIN_RENT = 3000;
    private final static double WP_RENT = 2000;


    public int zpMansurDp() {
        double x = DINCOME * ZP_JOB;
        return (int) MathUtils.round(x, -2, +2);
    }

    public int rentAS() {
        double x = AS_INCOME * AS_PERCENT;
        return (int) MathUtils.round(x, -1, +2);
    }

    public int expenses() {
        return (int) (zpMansurDp() + rentAS() + MIN_RENT + WP_RENT);
    }

    public int profit() {
        return (int) ((int) DINCOME - ((zpMansurDp() + rentAS() + MIN_RENT + WP_RENT)));
    }


    public String toString() {
        return
                "Доход Дофамин: " + DINCOME + " руб. " + "\n" +
                        "Зп Мансур К: " + zpMansurDp() + " руб. " + "\n" +
                        "Аренда АС: " + rentAS() + " руб." + "\n" +
                        "Аренда ВП: " + WP_RENT + " руб." + "\n" +
                        "Аренда ТЦ М: " + MIN_RENT + " руб." + "\n" +
                        "Итого расходов: " + expenses() + " руб." + "\n" +
                        "Касса: " + profit() + " руб." + "\n";
    }
}
