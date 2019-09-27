package tp1;

public class ConvertKmToMile extends ConsoleService<String[], Void> {

  @Override
  public void run(String[] args) {
	  System.out.println("saisir la distance en km :");
	  
	  double km = readDouble();
	  System.out.println("valeur saisie : " + km);
	  
	  double result = km / 1.60934;
	  System.out.println("voici le résultat : " + result);
    
  }
  
  public static void main(String...args) {
    new ConvertKmToMile().run(args);
  }

}
