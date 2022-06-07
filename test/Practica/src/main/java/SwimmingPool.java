public class SwimmingPool {

    public void fillingPool() {
        int volume = 1200;  // объем бассейна
        int fillingSpeed = 30;    // 30л наполняет за 1 мин
        int devastation = 10; // 10л выливается за 1 мин
        int result = 0;
        int i = 0;
        while (result < volume) {
            result += fillingSpeed - devastation;
            i += 1;
        }
        System.out.println("Бассейн наполнится за: " + i + " мин");
    }
}
