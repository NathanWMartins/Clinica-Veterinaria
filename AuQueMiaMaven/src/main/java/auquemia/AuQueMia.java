package auquemia;

import Telas.Janela;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sistema de uma clinica veterinária, classe inicial (MAIN)
 *
 * @author Rafaela e Nathan
 */
public class AuQueMia {

    public static void main(String[] args) {
        String idioma;
        String pais;

        if (args.length != 2) { //executavel foi chamado sem argumentos/parametro cli
            idioma = System.getProperty("user.language"); //idioma na config do sistema operacional
            pais = System.getProperty("user.country"); //pais na config do sistema operacional
        } else { //temos argumentos por cli
            idioma = args[0]; //idioma enviado por cli
            pais = args[1]; //pais enviado por cli
        }

        //avaliando se temos traducao disponivel
        ArrayList<String> traducoesDisponiveis = new ArrayList<String>();
        traducoesDisponiveis.add("pt");
        traducoesDisponiveis.add("en");
        traducoesDisponiveis.add("es");
        if (!traducoesDisponiveis.contains(idioma)) {
            idioma = "pt";
            pais = "BR";
        }

        //exemplo abaixo eh para desenvolvimento local com src/main/resources
        //usar enquanto estiver desenvolvendo
//        Locale localCorrente = new Locale(idioma, pais);
//        ResourceBundle traducoes = ResourceBundle.getBundle("MessagesBundle", 
//                                                                localCorrente);
        //deploy, para usar com o executavel .jar
        ResourceBundle traducoes = null;
        String nomeArquivo = "./idiomas/MessagesBundle_"+idioma+"_"+pais+".properties";
        InputStream newInputStream;
        try {
            newInputStream = Files.newInputStream(Paths.get(nomeArquivo));
            traducoes = new PropertyResourceBundle(newInputStream);

        } catch (IOException ex) {
            Logger.getLogger(AuQueMia.class.getName()).log(Level.SEVERE, null, ex);
        }
        Janela j = new Janela(traducoes);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }

}

