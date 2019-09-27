package tp1;

public class EspaceRemplacement extends ConsoleService<char[], char[]> {

  @Override
  public char[] runWithControl(char[] chaine) {
    // TODO
    return new char[0];
  }

  public static void main(String[] args) {
    EspaceRemplacement cal = new EspaceRemplacement();

    cal.assertEqual("Bienvenue%20à%20l'EPSI", new String(cal.runWithControl("Bienvenue à l'EPSI".toCharArray())));

    cal.assertEqual("Anti-espace", new String(cal.runWithControl("Anti-espace".toCharArray())));
  }
}
