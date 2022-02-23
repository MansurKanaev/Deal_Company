import org.apache.commons.math.util.MathUtils;

public class typePrices {
    private final static double TAPE = 72 * 43.45;
    private final static double TAPEPL = 72 * 54.32;
    private final static double TAPEMAX = 54 * 76.04;
    private final static double TAPE57 = 240 * 15.48;
    private final static double TAPEMINI = 320 * 11.61;
    private final static double STICKER2 = 75 * 60.68;
    private final static double STICKER3 = 60 * 67.11;
    private final static double STICKER4 = 60 * 75.50;
    private final static double TAPEPACK = 43.45;
    private final static double TAPEMINIPACK = 11.61;

    public int getTape() {
        double x = TAPE + (TAPE * 40.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapeDar() {
        double x = TAPE + (TAPE * 20.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapePl() {
        double x = TAPEPL + (TAPEPL * 35.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapePlDar() {
        double x = TAPEPL + (TAPEPL * 17.5 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapeMax() {
        double x = TAPEMAX + (TAPEMAX * 35.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapeMaxDar() {
        double x = TAPEMAX + (TAPEMAX * 17.5 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTape57() {
        double x = TAPE57 + (TAPE57 * 50.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTape57Dar() {
        double x = TAPE57 + (TAPE57 * 25.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapeMini() {
        double x = TAPEMINI + (TAPEMINI * 85.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapeMiniDar() {
        double x = TAPEMINI + (TAPEMINI * 42.5 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getSticker2() {
        double x = STICKER2 + (STICKER2 * 55.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getSticker2Dar() {
        double x = STICKER2 + (STICKER2 * 27.5 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getSticker3() {
        double x = STICKER3 + (STICKER3 * 35.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getSticker3Dar() {
        double x = STICKER3 + (STICKER3 * 17.5 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getSticker4() {
        double x = STICKER4 + (STICKER4 * 35.0 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getSticker4Dar() {
        double x = STICKER4 + (STICKER4 * 17.5 / 100);
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapePack() {
        double x = (TAPEPACK + (TAPEPACK * 55.0 / 100)) * 12;
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapePackDar() {
        double x = (TAPEPACK + (TAPEPACK * 27.5 / 100)) * 12;
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapeMiniPack() {
        double x = (TAPEMINIPACK + (TAPEMINIPACK * 95.0 / 100)) * 20;
        return (int) MathUtils.round(x, -2, +2);
    }

    public int getTapeMiniPackDar() {
        double x = (TAPEMINIPACK + (TAPEMINIPACK * 47.5 / 100)) * 20;
        return (int) MathUtils.round(x, -2, +2);
    }

    public String toString() {
        return "Tape: " + getTape() + "/" + getTapeDar() + " руб." + "\n" +
                "Tape+: " + getTapePl() + "/" + getTapePlDar() + " руб." + "\n" +
                "TapeMax: " + getTapeMax() + "/" + getTapeMaxDar() + " руб." + "\n" +
                "Tape57: " + getTape57() + "/" + getTape57Dar() + " руб." + "\n" +
                "TapeMini: " + getTapeMini() + "/" + getTapeMiniDar() + " руб." + "\n" +
                "Sticker2: " + getSticker2() + "/" + getSticker2Dar() + " руб." + "\n" +
                "Sticker3: " + getSticker3() + "/" + getSticker3Dar() + " руб." + "\n" +
                "Sticker4: " + getSticker4() + "/" + getSticker4Dar() + " руб." + "\n" +
                "TapePack: " + getTapePack() + "/" + getTapePackDar() + " руб." + "\n" +
                "TapeMiniPack: " + getTapeMiniPack() + "/" + getTapeMiniPackDar() + " руб." + "\n";
    }
}
