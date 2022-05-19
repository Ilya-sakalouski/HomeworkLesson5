package src.task4;

public class Task4 {
    public void getMeAnswer4() {
        int[][] mass = {{1, 2, 3}, {4, 5, 6}};
        int summ = 0;
        for (int[] ints : mass) {
            for (int anInt : ints) {
                summ += anInt;
            }
        }
        System.out.println(summ);
    }
}
