package Fichas;
public class Alugar {

    public String nome;
    public String data;
    public String filmes;
    public int qtd=0;

    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public String valor;
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFilmes() {
        return filmes;
    }
    public void setFilmes(String filmes) {
        this.filmes = filmes;
    }

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}
