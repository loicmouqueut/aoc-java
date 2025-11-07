package src;

import src.common.ExerciseExecutor;
import src.y2024.Day1;

public class AdventOfCode {

    private final static String YEAR = "2024";
    private final static Integer DAY = 1;
    private final static Integer PART = 2;

    public static void main(String[] args){

        System.out.println("\nExecuting exercise " + DAY + " part " + PART + " of year " + YEAR + "\n");

        String result = ExerciseExecutor.execute(YEAR, DAY, PART);

        if (result.equals("-1")) {
            System.out.println("Not implemented yet");
            return;
        }
        System.out.println("Result: " + result);

    }

}
