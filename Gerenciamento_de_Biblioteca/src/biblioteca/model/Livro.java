package biblioteca.model;

public class Livro {
    private String titulo_L;
    private String autores;
    private String editora;
    private String[] indice;
    private int x = 0;
    private String[] corpoDosCapitulos;

    public String getTitulo_L() {
        return titulo_L;
    }

    public void setTitulo_L(String titulo_L) {
        this.titulo_L = titulo_L;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String[] getIndice() {
        return indice;
    }

    public String getCorpoCapitulo(int indiceCapitulo) {
        if (indiceCapitulo >= 0 && indiceCapitulo < x) {
            return corpoDosCapitulos[indiceCapitulo];
        } else {
            return "Capítulo não encontrado";
        }
    }

    
    public void novoCapitulo() {
        indice = new String[x];
        corpoDosCapitulos = new String[x];

        for (int i = 0; i < x; i++) {
            Capitulo cap = new Capitulo();
            cap.setTitulo_c("Capítulo " + (i + 1));
            System.out.println("Adicione o Corpo do Capítulo " + (i + 1) + ":");
            String corpo = cap.getInput();
            
            if (corpo.isEmpty()) {
                System.out.println("Você encerrou a criação de capítulos.");
                break;
            }
            
            corpoDosCapitulos[i] = corpo;
            indice[i] = cap.getTitulo_c();
        }
    }



}