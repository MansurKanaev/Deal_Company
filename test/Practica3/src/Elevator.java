package src;

public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(int floor) {
        while (true) {
            if (floor < minFloor || floor > maxFloor || floor == 0) {
                System.out.println("Ошибка такого этажа нет!=(");
                break;
            } else if (currentFloor < floor) {
                System.out.println("\t" + currentFloor);
                moveUp();
                if (currentFloor == 0) currentFloor += 1;
            } else if (currentFloor > floor) {
                System.out.println("\t" + currentFloor);
                moveDown();
                if (currentFloor == 0) currentFloor -= 1;
            }
            if (currentFloor == floor) break;
        }
        System.out.println("Текущий этаж: " + getCurrentFloor());
    }
}
