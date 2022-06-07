package anonym_clacc;

interface MonitoringSystem {
    void startMonitoring();
}

public class anonymous {
    private final static int currentErrorsCount = 23;

    public static void main(String[] args) {

        MonitoringSystem generalModule = () -> System.out.println("Мониторинг общих показателей стартовал!");

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }

            public int getCurrentErrorsCount() {
                return currentErrorsCount;
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem() {

            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };
        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();


    }
}
