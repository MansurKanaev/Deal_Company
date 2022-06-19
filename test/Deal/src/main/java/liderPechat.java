import org.apache.commons.math.util.MathUtils;


public class liderPechat {
    private final double TAPE = 72 * 45.64;
    private final double TAPEPL = 72 * 57.04;
    private final double TAPEMAX = 54 * 79.86;
    private final double TAPEMINI = 240 * 16.78;
    private final double STICKER2 = 75 * 84.86;
    private final double STICKER3 = 60 * 93.66;
    private final double STICKER4 = 60 * 105.12;
    private final double STICKER1 = 5 * 115.0;
    private final double TAPEPACK = (TAPE / 72) * 12;
    private final double TAPEMINIPACK = (TAPEMINI / 240) * 20;

    private final static double tapePr = 80.0 / 100;
    private final static double stikPr = 30.0 / 100;
    private final static double tapePo = 70.0 / 100;
    private final static double stikPo = 20.0 / 100;


    public int Tape() {
        double x = TAPE + (TAPE * tapePr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapePl() {
        double x = TAPEPL + (TAPEPL * tapePr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapeMax() {
        double x = TAPEMAX + (TAPEMAX * tapePr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapePack() {
        double x = (TAPEPACK + (TAPEPACK * tapePr));
        return (int) MathUtils.round(x, -2, +2);
    }


    public int TapeMini() {
        double x = TAPEMINI + (TAPEMINI * tapePr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapeMiniPack() {
        double x = (TAPEMINIPACK + (TAPEMINIPACK * tapePr));
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker1() {
        double x = STICKER1 + (STICKER1 * stikPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker2() {
        double x = STICKER2 + (STICKER2 * stikPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker3() {
        double x = STICKER3 + (STICKER3 * stikPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker4() {
        double x = STICKER4 + (STICKER4 * stikPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapeO() {
        double x = TAPE + (TAPE * tapePo);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapePlO() {
        double x = TAPEPL + (TAPEPL * tapePo);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapeMaxO() {
        double x = TAPEMAX + (TAPEMAX * tapePo);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapePackO() {
        double x = TAPEPACK + (TAPEPACK * tapePo);
        return (int) MathUtils.round(x, -2, +2);
    }


    public int TapeMiniO() {
        double x = TAPEMINI + (TAPEMINI * tapePo);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapeMiniPackO() {
        double x = TAPEMINIPACK + (TAPEMINIPACK * tapePo);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker1O() {
        double x = STICKER1 + (STICKER1 * stikPo);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker2O() {
        double x = STICKER2 + (STICKER2 * stikPo);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker3O() {
        double x = STICKER3 + (STICKER3 * stikPo);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker4O() {
        double x = STICKER4 + (STICKER4 * stikPo);
        return (int) MathUtils.round(x, -2, +2);
    }


    public String toString() {
        String tapePr = String.valueOf((int) (liderPechat.tapePr * 100));
        String stikPr = String.valueOf((int) (liderPechat.stikPr * 100));
        String tapePro = String.valueOf((int) (liderPechat.tapePo * 100));
        String stikPro = String.valueOf((int) (liderPechat.stikPo * 100));

        String procTape = "\nРозница: " + stikPr + "% (S2,S3,S4) | " + tapePr + "% (Ост)\n" +
                "Оптовая: " + stikPro + "% (S2,S3,S4) | " + tapePro + "% (Ост)";
        return "Прайс Мега Маркет: " + "\n" +
                "Закупочные цены: " + "\n" +
                "Tape: " + TAPE + " руб." + "\n" +
                "Tape+: " + TAPEPL + " руб." + "\n" +
                "TapeMax: " + TAPEMAX + " руб." + "\n" +
                "TapeMini: " + TAPEMINI + " руб." + "\n" +
                "TapePack: " + TAPEPACK + " руб." + "\n" +
                "TapeMiniPack: " + TAPEMINIPACK + " руб." + "\n" +
                "Sticker1: " + STICKER1 + " руб." + "\n" +
                "Sticker2: " + STICKER2 + " руб." + "\n" +
                "Sticker3: " + STICKER3 + " руб." + "\n" +
                "Sticker4: " + STICKER4 + " руб." + "\n\n" +
                "Наша наценка: " + procTape + "\n" +
                "Tape: " + Tape() + " руб. | " + TapeO() + "руб.\n" +
                "Tape+: " + TapePl() + " руб. | " + TapePlO() + "руб.\n" +
                "TapeMax: " + TapeMax() + " руб. | " + TapeMaxO() + "руб.\n" +
                "TapeMini: " + TapeMini() + " руб. | " + TapeMiniO() + "руб.\n" +
                "TapePack: " + TapePack() + " руб. | " + TapePackO()+ "руб.\n" +
                "TapeMiniPack: " + TapeMiniPack() + " руб. | " + TapeMiniPackO() + "руб.\n" +
                "Sticker 30x20: " + Sticker1() + " руб. | " + Sticker1O() + "руб.\n" +
                "Sticker 43x25: " + Sticker2() + " руб. | " + Sticker2O() + "руб.\n" +
                "Sticker 58x30: " + Sticker3() + " руб. | " + Sticker3O() + "руб.\n" +
                "Sticker 58x40: " + Sticker4() + " руб. | " + Sticker4O() + "руб.\n";
    }
}
