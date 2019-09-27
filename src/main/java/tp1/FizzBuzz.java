package tp1;

public class FizzBuzz extends ConsoleService<String[], Void> {

  @Override
  public void run(String[] args) {
    // TODO
		for(int i = 0; i < 200; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.print("FizzBuzz \n");
			}else if(i%3 == 0){
				System.out.print("Fizz \n");
			}else if (i%5 == 0) {
				System.out.print("Buzz \n");
			}else {
				System.out.print(i + "\n");
			}
		}
  }

  public static void main(String... args) {
    new FizzBuzz().run(args);
  }

}
