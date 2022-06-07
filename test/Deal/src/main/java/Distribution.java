import org.apache.commons.math.util.MathUtils;

public class Distribution {
    private final static double INCOME = 1_000_000;
    private final static double LPINCOME = 600_000;
    private final static int MANSURX = 50000;
    private final static double MIN_INCOME = 100_000;
    private final static double MIDDLE_INCOME = 150_000;
    private final static double MAX_INCOME = 200_000;
    private final static double PERCENT_AMINA = 4.0 / 100;
    private final static double PERCENT_AYZA = 6.575 / 100;
    private final static double PERCENT_ADAMM = 0.8125 / 100;
    private final static double PERCENT_MANSURK = 0.2875 / 100;
    private final static double PERCENT_MANSURH = 0.48875 / 100;
    private final static double PERCENT_MINKAIL = 0.625 / 100;

    public int investAmina() {
        double x = Math.round(INCOME * PERCENT_AMINA);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int investAyza() {
        double x = Math.round(INCOME * PERCENT_AYZA);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int investAdamM() {
        double x = Math.round(INCOME * PERCENT_ADAMM);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int investMK() {
        double x = Math.round(INCOME * PERCENT_MANSURK);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int investMH() {
        double x = Math.round(INCOME * PERCENT_MANSURH);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int investMinH() {
        double x = Math.round(INCOME * PERCENT_MINKAIL);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int zpDirectorInv() {
        return MANSURX + investMH();

    }

    public int zpManagerInv() {
        return zpManager() + investMK();
    }

    public int zpManager() {
        double x = (LPINCOME * 5.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }


    public int zpSalesman1() {
        double x = LPINCOME * 15.0 / 100;
        return (int) MathUtils.round(x, -2, +2);
    }

    public int zpSalesmanInv() {
        return zpSalesman1() + investMinH();
    }

    public int zpSum() {
        return zpSalesman1() + zpManager() + MANSURX;
    }

    public int sumInv() {
        return investAmina() + investAmina() + investMK() + investMH() + investMinH();
    }

    public int expenses() {
        return Math.round(zpDirectorInv() + zpManagerInv() + zpSalesmanInv() +
                investAmina() + investAmina());
    }

    public double profit() {
        return Math.round(LPINCOME - zpDirectorInv() - zpManagerInv() - zpSalesmanInv() -
                investAmina() - investAmina());
    }


    public String toString() {
        return "Доход Deal: " + INCOME + " руб." + "\n" +
                "Доход Лидер Печати: " + LPINCOME + " руб." + "\n" +
                "ЗП команды: " + "\n" +
                "Основателя (Мансур Х): " + MANSURX + " руб." + "\n" +
                "Продавца (Минкаил Х): " + zpSalesman1() + " руб." + "\n" +
                "Mенеджера (Мансур К): " + zpManager() + " руб." + "\n" +
                "Сума всех зп: " + zpSum() + "руб." + "\n" +
                "Инвестиции: " + "\n" +
                "Айза У: " + investAyza() + " руб." + "\n" +
                "Амина Н: " + investAmina() + " руб." + "\n" +
                "Адам М: " + investAdamM() + " руб." + "\n" +
                "Мансур Х: " + investMH() + " руб." + "\n" +
                "Минкаил Х: " + investMinH() + " руб." + "\n" +
                "Мансур К: " + investMK() + " руб." + "\n" +
                "Сума всех инв: " + sumInv() + "руб." + "\n" +
                "ЗП Основателя (Мансур Х) + инв: " + zpDirectorInv() + " руб." + "\n" +
                "ЗП Продавца (Минкаил Х) + инв: " + zpSalesmanInv() + " руб." + "\n" +
                "ЗП Mенеджера (Мансур К) + инв: " + zpManagerInv() + " руб." + "\n" +
                "Итого Расходов: " + expenses() + " руб." + "\n" +
                "Прибыль: " + profit() + " руб." + "\n";
    }
}
