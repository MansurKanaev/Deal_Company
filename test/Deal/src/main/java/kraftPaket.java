import org.apache.commons.math.util.MathUtils;

public class kraftPaket {
    private final double CR370S = 11.21;
    private final double CR350S = 9.67;
    private final double CR280S = 8.43;
    private final double BR340S = 4.75;
    private final double BR290220S = 2.12;
    private final double BR290S = 2.27;
    private final double BR240S = 1.63;
    private final double PRS200S = 4.38;
    private final double PRS300S = 5.24;
    private final double PRKPL_S = 1.99;
    private final double SL25PMS = 5.12;

    private final double CR350 = 200 * CR350S;
    private final double BR340 = 450 * BR340S;
    private final double BR290 = 1000 * BR290S;
    private final double BR240 = 1000 * BR240S;
    private final double CR370 = 300 * CR370S;
    private final double BR290220 = 1000 * BR290220S;
    private final double CR280 = 300 * CR280S;
    private final double SL25PM = 600 * SL25PMS;
    private final double PRS200 = 800 * PRS200S;
    private final double PRS300 = 800 * PRS300S;
    private final double PRKP_L = 800 * PRKPL_S;

    private final static double roznPr = 20.0 / 100;
    private final static double optPr = 10.0 / 100;


    public int kp350r() {
        double x = CR350 + (CR350 * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp340r() {
        double x = BR340 + (BR340 * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp290r() {
        double x = BR290 + (BR290 * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp240r() {
        double x = BR240 + (BR240 * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp370r() {
        double x = CR370 + (CR370 * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp290220r() {
        double x = BR290220 + (BR290220 * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp280r() {
        double x = CR280 + (CR280 * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int sl25pmR() {
        double x = SL25PM + (SL25PM * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int pr200r() {
        double x = PRS200 + (PRS200 * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int pr300r() {
        double x = PRS300 + (PRS300 * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int prkplr() {
        double x = PRKP_L + (PRKP_L * roznPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp350o() {
        double x = CR350 + (CR350 * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp340o() {
        double x = BR340 + (BR340 * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp290o() {
        double x = BR290 + (BR290 * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp240o() {
        double x = BR240 + (BR240 * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp370o() {
        double x = CR370 + (CR370 * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp290220o() {
        double x = BR290220 + (BR290220 * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int kp280o() {
        double x = CR280 + (CR280 * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int sl25pmO() {
        double x = SL25PM + (SL25PM * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int pr200_O() {
        double x = PRS200 + (PRS200 * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int pr300_O() {
        double x = PRS300 + (PRS300 * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int prkplrO() {
        double x = PRKP_L + (PRKP_L * optPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public String toString() {
        String rozPR = String.valueOf((int) (roznPr * 100));
        String optPR = String.valueOf((int) (optPr * 100));
        String percent = "Розничная: " + rozPR + "% | " + "Оптовая: " + optPR + "%";
        return "Прайс Эконом Сервис: " + "\n" +
                "Закупочные цены: " + "\n" +
                "370x320x200 СР 300: шт-" + CR370S + " руб. | ящ-" + CR370 + " руб." + "\n" +
                "350x260x150 СР 200: шт-" + CR350S + " руб. |  ящ-" + CR350 + " руб." + "\n" +
                "280x240x140 СР 300: шт-" + CR280S + " руб. | ящ-" + CR280 + " руб." + "\n" +
                "340x260x150 БР 450: шт-" + BR340S + " руб. |  ящ-" + BR340 + " руб." + "\n" +
                "290x220x120 БР 1000: шт-" + BR290220S + " руб. | ящ-" + BR290220 + " руб." + "\n" +
                "290x180x120 БР 1000: шт-" + BR290S + " руб. | ящ-" + BR290 + " руб." + "\n" +
                "240x120x80 БР 1000: шт-" + BR240S + " руб. | ящ-" + BR240 + " руб." + "\n" +
                "Проз. стакан 200мл 800: шт-" + PRS200S + " руб. | ящ-" + PRS200 + " руб." + "\n" +
                "Проз. стакан 300мл 800: шт-" + PRS300S + " руб. | ящ-" + PRS300 + " руб." + "\n" +
                "Проз. крышка на стаканы 800: шт-" + PRKPL_S + " руб. | ящ-" + PRKP_L + " руб." + "\n" +
                "SL-25PM 600: шт-" + SL25PMS + " руб. | ящ-" + SL25PM + " руб." + "\n\n" +
                "Наша наценка: " + percent + "\n" +
                "370x320x200 СР 300: " + kp370r() + " руб. | " + kp370o() + " руб." + "\n" +
                "350x260x150 СР 200: " + kp350r() + " руб. | " + kp350o() + " руб." + "\n" +
                "280x240x140 СР 300: " + kp280r() + " руб. | " + kp280o() + " руб." + "\n" +
                "340x260x150 БР 450: " + kp340r() + " руб. | " + kp340o() + " руб." + "\n" +
                "290x220x120 БР 1000: " + kp290220r() + " руб. | " + kp290220o() + " руб." + "\n" +
                "290x180x120 БР 1000: " + kp290r() + " руб. | " + kp290o() + " руб." + "\n" +
                "240x120x80 БР 1000: " + kp240r() + " руб. | " + kp240o() + " руб." + "\n" +
                "Проз. стакан 200мл 800: шт-" + pr200r() + " руб. | ящ-" + pr200_O() + " руб." + "\n" +
                "Проз. стакан 300мл 800: шт-" + pr300r() + " руб. | ящ-" + pr300_O() + " руб." + "\n" +
                "Проз. крышка на стаканы 800: шт-" + prkplr() + " руб. | ящ-" + prkplrO() + " руб." + "\n" +
                "SL-25PM 600: " + sl25pmR() + " руб. | " + sl25pmO() + " руб." + "\n\n";

    }
}
