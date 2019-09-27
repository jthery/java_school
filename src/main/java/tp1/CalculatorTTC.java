package tp1;

public class CalculatorTTC extends ConsoleService<String[], Void> {

  @Override
  public void run(String[] args) {
	   // TODO
      double reponse;
      double taxe;
      double userNumber;
      
      System.out.println("Calculer Montant TTC");
      System.out.println("Entrer le prix HT");
      
      userNumber = this.readDouble();
      System.out.println("Entrer la Taxe en pourcentage :");
      taxe = this.readDouble();
      taxe /= 100;
      reponse =  (userNumber*taxe)+ userNumber;
      
      System.out.println("Montant HT"+ " " + userNumber);
      System.out.println("Taxe en pourcentage "+ " " + taxe);
      System.out.printf("Montant TTC : %.2f", reponse); 
  }

  public static void main(String[] args) {
    CalculatorTTC cal = new CalculatorTTC();
    cal.run(args);
  }

}
