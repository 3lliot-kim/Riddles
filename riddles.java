import java.lang.reflect.Array;
import java.util.*;

class riddles {
    private String choice;
    private static String[] full_list = new String[1];

    public static void main(String[] args) {
        riddles select = new riddles();
        list_riddles();
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Riddle # to Run: ");
    
        select.choice = myObj.nextLine();
        select.run_riddle(select.choice);
    }

    public static void list_riddles() {
        String riddle_one = "1) 100 Prisoners Riddle";
        full_list[0] = riddle_one;
        System.out.println();
        for (int i = 0; i < full_list.length; i++) {
            System.out.println(full_list[i]);
        }
        System.out.println();
    }

    public String run_riddle(String choice) {
        for (int i = 0; i < full_list.length; i++) {
            if (choice == "1") {
                prison_riddle();
            }
        }
        return "end";
    }

    public static void prison_riddle() {
        prison_riddle puzzle = new prison_riddle();
        puzzle.find();
        puzzle.printGrid();
        System.out.println(puzzle.fate);
    }
}
