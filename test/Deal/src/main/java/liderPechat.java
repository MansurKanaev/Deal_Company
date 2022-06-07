import org.apache.commons.math.util.MathUtils;


public class liderPechat {
    private final double TAPE = 72 * 50.68;
    private final double TAPEPL = 72 * 63.36;
    private final double TAPEMAX = 54 * 88.70;
    private final double TAPEMINI = 240 * 18.06;
    private final double STICKER2 = 75 * 88.20;
    private final double STICKER3 = 60 * 97.58;
    private final double STICKER4 = 60 * 109.78;
    private final double STICKER1 = 5 * 115.0;
    private final double TAPEPACK = (TAPE / 72) * 12;
    private final double TAPEMINIPACK = (TAPEMINI / 240) * 20;
    private final static double tapePr = 30.0 / 100;
    private final static double miniPr = 50.0 / 100;

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

    public int Sticker2() {
        double x = STICKER2 + (STICKER2 * tapePr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker3() {
        double x = STICKER3 + (STICKER3 * tapePr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker4() {
        double x = STICKER4 + (STICKER4 * tapePr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapePack() {
        double x = (TAPEPACK + (TAPEPACK * tapePr));
        return (int) MathUtils.round(x, -2, +2);
    }

    public int Sticker1() {
        double x = STICKER1 + (STICKER1 * miniPr);
        return (int) MathUtils.round(x, -2, +2);
    }


    public int TapeMini() {
        double x = TAPEMINI + (TAPEMINI * miniPr);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int TapeMiniPack() {
        double x = (TAPEMINIPACK + (TAPEMINIPACK * miniPr));
        return (int) MathUtils.round(x, -2, +2);
    }

    public String toString() {
        String procTape = "30% | 50%";
        return "Закупочные цены: " + "\n" +
                "Tape: " + TAPE + " руб." + "\n" +
                "Tape+: " + TAPEPL + " руб." + "\n" +
                "TapeMax: " + TAPEMAX + " руб." + "\n" +
                "TapeMini: " + TAPEMINI + " руб." + "\n" +
                "TapePack: " + TAPEPACK + " руб." + "\n" +
                "TapeMiniPack: " + TAPEMINIPACK + " руб." + "\n" +
                "Sticker1: " + STICKER1 + " руб." + "\n" +
                "Sticker2: " + STICKER2 + " руб." + "\n" +
                "Sticker3: " + STICKER3 + " руб." + "\n" +
                "Sticker4: " + STICKER4 + " руб." + "\n" + "\n" +
                "Цены Лидер печати: проценты " + procTape + "\n" +
                "Tape: " + Tape() + " руб." + "\n" +
                "Tape+: " + TapePl() + " руб." + "\n" +
                "TapeMax: " + TapeMax() + " руб." + "\n" +
                "TapeMini: " + TapeMini() + " руб." + "\n" +
                "TapePack: " + TapePack() + " руб." + "\n" +
                "TapeMiniPack: " + TapeMiniPack() + " руб." + "\n" +
                "Sticker 30x20: " + Sticker1() + " руб." + "\n" +
                "Sticker 43x25: " + Sticker2() + " руб." + "\n" +
                "Sticker 58x30: " + Sticker3() + " руб." + "\n" +
                "Sticker 58x40: " + Sticker4() + " руб." + "\n";
    }
}
