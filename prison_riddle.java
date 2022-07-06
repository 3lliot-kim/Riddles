import java.util.*;

public class prison_riddle {
    private int[][] grid;
    private int num_prisoners = 100;
    private List<Integer> list;
    private List<Boolean> prisoners;
    private int check;
    public Boolean fate;

    public prison_riddle() {
        this.grid = new int[10][10];
        list = new ArrayList<>(this.num_prisoners);
        prisoners = new ArrayList<>(this.num_prisoners);
        for (int i = 0; i < this.num_prisoners; i++){
            list.add(i + 1);
            prisoners.add(false);
        }
        Collections.shuffle(list);
        placeValue();
    }

    public void placeValue() {
        for (int i = 0; i < this.num_prisoners; i++) {
            int r = i / 10;
            int c = i % 10;
            this.grid[r][c] = this.list.get(i);
        }
    }

    public void printGrid() {
        for(int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                System.out.print("|");
                if (this.grid[r][c] < 10) {
                    System.out.print("  " + this.grid[r][c] + " ");
                }
                else if (this.grid[r][c] == 100) {
                    System.out.print(" " + this.grid[r][c] + "");
                }
                else {
                    System.out.print(" " + this.grid[r][c] + " ");
                }
            }
            System.out.println("|");
        }
    }

    public void find() {
        for (int i = 0; i < 100; i++) {     
            this.check = this.list.get(i);  
            for (int z = 0; z < 50; z++) {
                if (i + 1 == this.check) {
                    this.prisoners.set(i, true);
                    break;
                }
                else {
                    this.check = this.list.get(this.check - 1);
                }
            }
        }
        if (this.prisoners.contains(false)) {
            this.fate = false;
        }
        else {
            this.fate = true;
        }
    }
}