package Carros;

public class Localizacao {
    private String bairro;
    private String endereco;
    private String cidade;
    private String estado;

    Localizacao(String endereco, String bairro, String cidade, String estado) {
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString() {
        return " Endereco: " + endereco + ", Bairro: " + bairro + ", Cidade: " + cidade + ", Estado: " + estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
