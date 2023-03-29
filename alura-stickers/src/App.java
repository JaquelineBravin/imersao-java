import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.InputStream;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
    	
        System.out.println("Hello, World!");

        //fazer a conexão HTTP E BUSCAR OS TOP 250 FILMES
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json";
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY";
       
        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        // pegar só os dados interessantes (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeConteudos = parser.parse(json);
        System.out.println(listaDeConteudos.size());
        
        // exibir e manipular 
        var geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < 3; i++) {

            Conteudo conteudo = conteudo.get(i);

            InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.titulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println(conteudo.titulo());
            System.out.println();
        }
    }
}
