package src.task1;

import java.util.Arrays;

public class Task1 {
    public void getMeAnswer1(){
        int[][][] mass1 = {{{1,2,3},{4,5,6}}, {{7,8,9},{10,11,12}}};
        for (int i = 0; i < mass1.length; i++) {
            for (int j = 0; j < mass1[i].length; j++) {
                for (int k = 0; k <= mass1[j].length; k++) {
                    mass1[i][j][k] ++;
                    System.out.print(mass1[i][j][k] + " ");
                }
            }
        }
        System.out.println();
    }
}
