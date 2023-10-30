package biblioteca.io;
import java.io.IOException;
import biblioteca.model.*;

public class App {
   
	public static void main(String[] args) throws IOException {
	  Prateleira acesso = new Prateleira();
	  acesso.criarLivro();
	}
}
