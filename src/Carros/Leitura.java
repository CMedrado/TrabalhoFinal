package Carros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Leitura {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            FileInputStream f = new FileInputStream("arquivoObj.txt");
            ObjectInputStream s = new ObjectInputStream(f);

            LocadoraFisica alx;

            while ((alx = (LocadoraFisica)s.readObject()) != null) {
                System.out.println(alx.toString());
            }
            s.close();
            f.close();
        }
        catch (IOException e) { System.out.println("Fim"); }

        catch (Exception e) { e.printStackTrace(); }
    }
}
