package Carros;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gravacao {

    public static void main(String[] args) throws IOException {

        LocadoraFisica loc = new LocadoraFisica();
        Localizacao localizacao;
        Carro carro;
        String nome = JOptionPane.showInputDialog("Coloque o nome");

        String cnpj = JOptionPane.showInputDialog("Coloque o cnpj");
        String telefone = JOptionPane.showInputDialog("Coloque o telefone");
        String endereco = JOptionPane.showInputDialog("Coloque o endereco");
        String bairro = JOptionPane.showInputDialog("Coloque o bairro");
        String cidade = JOptionPane.showInputDialog("Coloque a cidade");
        String estado = JOptionPane.showInputDialog("Coloque o estado");
        String codigo = JOptionPane.showInputDialog("Digite o codigo");
        String marca = JOptionPane.showInputDialog("Digite a marca");
        String modelo = JOptionPane.showInputDialog("Digite o modelo");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
        String acessorios = JOptionPane.showInputDialog("Digite os acessorios");
        carro = new Carro(codigo, marca, modelo, ano, acessorios);
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        String categoria = JOptionPane.showInputDialog("Digite a categoria");
        Lista lista = new Lista(carro, valor, categoria);
        localizacao = new Localizacao(endereco, bairro, cidade, estado);
        LocadoraFisica al = new LocadoraFisica(nome, cnpj, telefone, localizacao);
        loc.locadora.add(al);
        try {
            lista.writeFile();
            loc.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}