import java.util.ArrayList;

public class DotCom {
    private ArrayList<Integer> locationCell;

    public void setLocationCell(ArrayList<Integer> locs) {
        locationCell = locs;
    }

    public String checkYourself(int input) {
        String text = "Мимо";
        int index = locationCell.indexOf(input);
        if (index >= 0) {
            locationCell.remove(index);
            if (locationCell.isEmpty()) {
                text = "Потопил";
            } else {
                text = "Попал";
            }
        }
        System.out.println(text);
        return text;
    }
}



