public class Printer {
    private String queue = "";
    private int pendingPagesCount = 0;
    private int totalAmountPage = 0;

    public void append(String nameDoc) {
        append(nameDoc, "");
    }

    public void append(String nameDoc, String textDoc) {
        append(nameDoc, textDoc, 1);
    }

    public void append(String textDoc, String nameDoc, int amountPage) {

        pendingPagesCount = amountPage;
        totalAmountPage += pendingPagesCount;
        queue ="Имя документа: " + textDoc + "\n" + "Описание: "
                + nameDoc + "\n" + "Количество страниц: " + amountPage;
    }

    public void clear() {
        queue = "";
        pendingPagesCount = 0;
        System.out.println("Очередь Очищена." + "\n" + "Количество страниц в принтере: " + pendingPagesCount + "\n");
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public int getAllPageCount() {
        return totalAmountPage;
    }

    public void print() {
        if (queue.isEmpty()) {
            clear();
        } else {
            System.out.println(queue);
            System.out.println("Количество страниц в принтере: " + getPendingPagesCount());
            System.out.println("Общее количество распечатанных страниц: " + getAllPageCount() + "\n");
        }
    }
}
