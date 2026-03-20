package model; // Declaração do pacote

public class Novela {

    // Atributos
    private String titulo;
    private String autor;
    private int numeroCapitulos;

    // Construtor padrão
    public Novela() {
        this.titulo = "Avenida Brasil";
        this.autor = "João Emanuel Carneiro";
        this.numeroCapitulos = 100;
    }

    // Construtor com parâmetros
    public Novela(String titulo, String autor, int numeroCapitulos) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroCapitulos = numeroCapitulos;
    }

    // Método que exibe um resumo
    public void exibirResumo() {
        System.out.println("A novela " + titulo + "escrita por " + autor +
                " possui " + numeroCapitulos + " capítulos emocionantes!");
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    // toString
    @Override
    public String toString() {
        return "Novela{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroCapitulos=" + numeroCapitulos +
                '}';
    }
}