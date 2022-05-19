package src.task2;

public class Task2 {
    public void getMeAnswer2() {
        String[][] arr = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 0) {
                    arr[j][i] = "W";
                    System.out.print(arr[j][i] + " ");
                } else {
                    arr[j][i] = "B";
                    System.out.print(arr[j][i] + " ");
                }
            System.out.println();

        }
    }
}
