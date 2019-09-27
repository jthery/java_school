package tp1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CheckSum extends ConsoleService<Integer[][], Void> {

  @Override
  public void run(Integer[][] args) {

  }

  public static void main(String[] args) throws Exception {
    var data = Files.readAllLines(Paths.get(CheckSum.class.getResource("/puzzle.txt")
      .toURI()))
      .stream()
      .map(line -> line.split(" +"))
      .map(array -> Arrays.stream(array)
        .map(item -> Integer.valueOf(item))
        .toArray(Integer[]::new))
      .toArray(Integer[][]::new);
    new CheckSum().run(data);
  }
}
