import java.util.ArrayList;
import java.uitl.List;

/**
 * Created by mrk on 4/7/14.
 */
public class Board {
    ArrayList<String> spots;

    public Board() {
        this.spots = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }

    private List<String> row(int[] arrSpotIndex) {
        List<String> row = new ArrayList<String>();
        for (int i = 0; i < arrSpotIndex; ++i) {
            row.add(this.spots.get(arrSpotIndex[i]));
        }
        return row;
    }

    public List<String> firstRow() {
        return row({0, 1, 2};
    }

    public List<String> secondRow() {
        return row({3, 4, 5};
    }

    public List<String> thirdRow() {
        return row({6, 7, 8};
    }

    private String display(int[] arrSpotIndex) {
        return this.spots.get(arrSpotIndex[0]) + " | " + this.spots.get(arrSpotIndex[1]) + " | " + this.spots.get(arrSpotIndex[2]) + "\n";
    }

    public void display() {
        String formattedRow = display({0, 1, 2}) + display({3, 4, 5}) + display({6, 7, 8});
        System.out.print(formattedRow);
    }
}
