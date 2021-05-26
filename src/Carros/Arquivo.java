package Carros;

import java.io.IOException;

public interface Arquivo {

    public int readFile () throws IOException;
    public int writeFile() throws IOException;
}