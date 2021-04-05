package sk.majba.items;

import java.util.Arrays;
import java.util.Random;

public class DamageRange {
    private final int[][] attackValues;
    private final Random rand;

    public DamageRange(int minimalDmg, int maximalDmg) {
        this.rand = new Random();
        this.attackValues = new int[3][2];
        double intervalLenght = maximalDmg - minimalDmg;
        double subintervalLenght = intervalLenght/3;
        double current_start = minimalDmg;
        for (int i = 0; i < 3; ++i) {
            this.attackValues[i][0] = (int)(Math.round(current_start));
            this.attackValues[i][1] = (int)(Math.round(current_start + subintervalLenght));
            current_start += subintervalLenght;
        }
        System.out.println(Arrays.deepToString(this.attackValues));
    }

    public int getDamageUtoku(char typUtoku) {
        int low;
        int high;
        switch (typUtoku) {
            case 'Q':
                System.out.println(Arrays.toString(this.attackValues[0]));
                return this.rand.nextInt(this.attackValues[0][1] - this.attackValues[0][0] + 1) + this.attackValues[0][0];
            case 'M':
                System.out.println(Arrays.toString(this.attackValues[1]));
                return this.rand.nextInt(this.attackValues[1][1] - this.attackValues[1][0] + 1) + this.attackValues[1][0];
            case 'H':
                System.out.println(Arrays.toString(this.attackValues[2]));
                return this.rand.nextInt(this.attackValues[2][1] - this.attackValues[2][0] + 1) + this.attackValues[2][0];
            default:
                return 0;
        }
    }
}
