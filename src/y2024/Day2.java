package src.y2024;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;
import src.common.FileReader;

public abstract class Day2 {

    private final static Integer INTERVAL_MIN = 1;
    private final static Integer INTERVAL_MAX = 3;

    public static String executePart1() {

        List<String> input = FileReader.readInputFile();

        Long validAscendingLines =
                input.stream()
                     .filter(line -> {
                         List<String> splitLine = List.of(line.split(" "));
                         return IntStream.range(0, splitLine.size() - 1)
                                         .allMatch(i -> {
                                             int delta = Integer.parseInt(splitLine.get(i)) - Integer.parseInt(splitLine.get(i + 1));
                                             return delta <= -INTERVAL_MIN && delta >= -INTERVAL_MAX;
                                         });
                     })
                     .count();

        Long validDescreasingLines =
                input.stream()
                     .filter(line -> {
                         List<String> splitLine = List.of(line.split(" "));
                         return IntStream.range(0, splitLine.size() - 1)
                                         .allMatch(i -> {
                                             int delta = Integer.parseInt(splitLine.get(i)) - Integer.parseInt(splitLine.get(i + 1));
                                             return delta >= INTERVAL_MIN && delta <= INTERVAL_MAX;
                                         });
                     })
                     .count();

        return validAscendingLines + validDescreasingLines + "";
    }

    public static String executePart2() {

        List<String> input = FileReader.readInputFile();

        Long validAscendingLines =
                input.stream()
                     .filter(line -> {
                         List<String> splitLine = List.of(line.split(" "));
                         return IntStream.range(0, splitLine.size() - 1)
                                         .allMatch(i -> {
                                             int delta = Integer.parseInt(splitLine.get(i)) - Integer.parseInt(splitLine.get(i + 1));
                                             return delta <= -INTERVAL_MIN && delta >= -INTERVAL_MAX;
                                         });
                     })
                     .count();

        Long validDescreasingLines =
                input.stream()
                     .filter(line -> {
                         List<String> splitLine = List.of(line.split(" "));
                         return IntStream.range(0, splitLine.size() - 1)
                                         .allMatch(i -> {
                                             int delta = Integer.parseInt(splitLine.get(i)) - Integer.parseInt(splitLine.get(i + 1));
                                             return delta <= -INTERVAL_MIN && delta >= -INTERVAL_MAX;
                                         });
                     })
                     .count();

        return validAscendingLines + validDescreasingLines + "";
    }

}
