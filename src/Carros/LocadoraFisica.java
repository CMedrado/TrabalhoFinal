package Carros;

import java.io.*;
import java.util.ArrayList;

public class LocadoraFisica implements Arquivo {
    private String nome;
    private String cnpj;
    private String telefone;
    protected Localizacao localizacao;
    public ArrayList<LocadoraFisica> locadora;

    public LocadoraFisica(){
        locadora = new ArrayList<LocadoraFisica>();
    }

    public LocadoraFisica(String nome, String cnpj, String telefone, Localizacao localizacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.localizacao = localizacao;
    }

    public String toString() {
        return "Locadora - CNPJ: " + cnpj + ", Nome: " + nome + ", Telefone: " + telefone + ", Localizacao: " + localizacao.toString();
    }
    @Override
    public int readFile() throws IOException {
        InputStream is= new FileInputStream("locadora.txt");
        InputStreamReader isr= new InputStreamReader(is);
        BufferedReader br= new BufferedReader(isr);

        String s = br.readLine();
        int locadoras=0;
        int c=1;
        for(int i=(s.length()-1);i>=0;i--) {
            locadoras+=((s.charAt(i)-'0')*c);
            c*=10;
        }


        for(int i=0;i<locadoras;i++) {
            s=br.readLine();
            String nome=s; //read name

            s=br.readLine(); //read year_birth and change String to int
            c=1;
            int year_birth=0;
            for(int i1=s.length()-1;i1>=0;i1--) {
                year_birth+=((s.charAt(i1)-'0')*c);
                c*=10;
            }

            s=br.readLine(); //read institution
            String institution=s;

            LocadoraFisica loc = new LocadoraFisica (nome,year_birth,institution);
            locadora.add(loc);
        }
        br.close();
        return 0;
    }

    public int writeFile() throws IOException {

        OutputStream os = new FileOutputStream("locadora.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw= new BufferedWriter(osw);

        int tam = locadora.size();
        bw.write(tam + "\n");
        for (int i = 0; i < tam; i++) {
            LocadoraFisica aux = locadora.get(i);
            bw.write(aux.getNome() + "\n");
            bw.write(aux.getCnpj() + "\n");
            bw.write(aux.getTelefone() + "\n");
            bw.write(aux.localizacao.getEndereco() + "\n");
            bw.write(aux.localizacao.getCidade() + "\n");
            bw.write(aux.localizacao.getEstado() + "\n");
            bw.write(aux.localizacao.getBairro() + "\n");
        }
        bw.close();
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
