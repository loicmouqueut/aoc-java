package src.y2024;

import java.util.ArrayList;
import java.util.List;
import src.common.FileReader;

public abstract class Day1 {

    public static String executePart1() {

        List<Integer> col1 = new ArrayList<>();
        List<Integer> col2 = new ArrayList<>();
        List<String> input = FileReader.readInputFile();
        int result = 0;

        input.forEach(line -> {
            String[] splitLine = line.split(" {3}");
            col1.add(Integer.parseInt(splitLine[0]));
            col2.add(Integer.parseInt(splitLine[1]));
        });

        col1.sort(Integer::compareTo);
        col2.sort(Integer::compareTo);

        for (int index = 0; index < col1.size(); index++) {
            result += Math.abs(col1.get(index) - col2.get(index));
        }
        return result + "";
    }

    public static String executePart2() {

        List<Integer> col1 = new ArrayList<>();
        List<Integer> col2 = new ArrayList<>();
        List<String> input = FileReader.readInputFile();
        int result = 0;

        input.forEach(line -> {
            String[] splitLine = line.split(" {3}");
            col1.add(Integer.parseInt(splitLine[0]));
            col2.add(Integer.parseInt(splitLine[1]));
        });

        col2.sort(Integer::compareTo);

        int currentValue = 0;

        for (int index = 0; index < col1.size(); index++) {
            currentValue = col1.get(index);
            int finalCurrentValue = currentValue;
            result += (int) (currentValue * col2.stream().filter((secondValue) -> secondValue == finalCurrentValue).count());
        }

        return result + "";
    }
}
