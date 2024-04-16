import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {


    public void GeraJason(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrito = new FileWriter(endereco.cep() + ".json");
        escrito.write(gson.toJson(endereco));
        escrito.close();
    }
}
