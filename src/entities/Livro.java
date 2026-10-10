package entities;
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao,  boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public boolean emprestimo() {
        if (disponivel) {
            disponivel = false;
            return true;
        }

        return false;
    }
    public boolean devolver() {
        if (!disponivel) {
            disponivel = true;
            return true;
        }

        return false;
    }
    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    public boolean isDevolver() {
        return !disponivel;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + " autor: " + autor + " anoPublicacao: " + anoPublicacao;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}