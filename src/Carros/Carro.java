package Carros;

public class Carro {
    private String codigo;
    private String marca;
    private String modelo;
    private int ano;
    private String acessorios;

    Carro(String codigo, String marca, String modelo, int ano, String acessorios) {
        this.acessorios = acessorios;
        this.codigo = codigo;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return "Conta Poupanca - " + super.toString();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }
}
