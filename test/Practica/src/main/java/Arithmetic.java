public class Arithmetic {
    private final int x;
    private final int y;

    public Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sumNumber() {
        return x + y;
    }

    public int additionNumber() {
        return x * y;
    }

    public int maxNumber() {
        return Math.max(x, y);
    }

    public int minNumber() {
        return Math.min(x, y);
    }

    public void print() {
        System.out.println("Сумма двух чисел: " + sumNumber() + "\n" +
                "Произведение двух чисел: " + additionNumber() + "\n" +
                "Мин двух чисел " + minNumber() + "\n" +
                "Мах двух чисел " + maxNumber());
    }

}
