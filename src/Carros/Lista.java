package Carros;

import java.io.*;
import java.util.ArrayList;

public class Lista implements Arquivo{
    private Carro carro;
    private double valor;
    private String categoria;
    private LocadoraFisica locadora;
    public ArrayList<Lista> lista=null;

    Lista(Carro carro, double valor, String categoria) {
        this.carro = carro;
        this.valor = valor;
        this.categoria = categoria;
        lista=new ArrayList<Lista>();
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int readFile() throws IOException {
        return 0;
    }

    @Override
    public int writeFile() throws IOException {
        OutputStream os= new FileOutputStream("carros.txt");
        OutputStreamWriter osw= new OutputStreamWriter(os);
        BufferedWriter bw= new BufferedWriter(osw);

        int tam=lista.size();
        bw.write(tam + "\n");
        for(int i=0;i<tam;i++) {
            Lista aux = lista.get(i);
            bw.write(locadora.getNome()+ "\n");
            bw.write(aux.getCategoria()+ "\n");
            bw.write(aux.getValor()+ "\n");
            bw.write(aux.getCarro().getModelo()+ "\n");
            bw.write(aux.getCarro().getAcessorios()+ "\n");
            bw.write(aux.getCarro().getAno()+ "\n");
            bw.write(aux.getCarro().getCodigo()+ "\n");
            bw.write(aux.getCarro().getMarca()+ "\n");
        }
        bw.close();
        return 0;
    }
}
