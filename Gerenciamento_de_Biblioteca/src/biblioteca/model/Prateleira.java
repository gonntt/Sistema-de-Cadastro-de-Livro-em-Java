package biblioteca.model;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prateleira {
    public void criarLivro() throws IOException {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite 1 para Cadastrar um Livro " );
        int caminho = sc1.nextInt();
        if (caminho == 1) {
            File arquivo = new File("/home/gabriel/Biblioteca/texto.txt");
            arquivo.createNewFile();
            Livro lv = new Livro();
            System.out.println("Escreva o nome do livro");
            String nome = sc1.next();

            lv.setTitulo_L(nome);
            System.out.println("Escreva o nome do autor");
            String nomes = sc1.next();
            lv.setAutores(nomes);
            System.out.println("Escreva o nome da Editora");
            String editor = sc1.next();
            lv.setEditora(editor);
            System.out.println("Escreva o número de índices");
            int tamanhoDoIndice = sc1.nextInt();
            lv.setX(tamanhoDoIndice);

            lv.novoCapitulo();

            
            FileWriter writer = new FileWriter(arquivo);
            writer.write("Título do Livro: " + lv.getTitulo_L() + "\n");
            writer.write("Autores: " + lv.getAutores() + "\n");
            writer.write("Editora: " + lv.getEditora() + "\n");
            writer.write("Índices dos Capítulos:\n");
            for (int i = 0; i < lv.getX(); i++) {
                writer.write((i + 1) + ". " + lv.getIndice()[i] + "\n");
                writer.write("Corpo do Capítulo " + (i + 1) + ":\n");
                writer.write(lv.getCorpoCapitulo(i) + "\n");
            }
            writer.close();
        }
    }
}
