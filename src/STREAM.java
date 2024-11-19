import stdlib.StdOut;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class STREAM {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "stream");

        String joinedString = words.stream().collect(Collectors.joining(",")); // Delimiter is ","

        StdOut.println(joinedString);
    }
}
