import java.awt.Desktop;
import java.net.URI;

public class Navegador {

public class NavegadorSimples {
    public static void main(String[] args) {
        try {
            // Especifica a URL que você deseja abrir no navegador
            URI uri = new URI("https://www.example.com");

            // Abre a URL no navegador padrão do sistema
            Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

}
