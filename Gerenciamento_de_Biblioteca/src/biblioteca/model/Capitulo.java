package biblioteca.model;

import java.util.Scanner;

public class Capitulo {
    private String titulo_c;

    public String getTitulo_c() {
        return titulo_c;
    }

    public void setTitulo_c(String titulo_c) {
        this.titulo_c = titulo_c;
    }

    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
