import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //fazer a conexão HTTP E BUSCAR OS TOP 250 FILMES
        String url = "gfdgfgfdgdfgddg";
//        String url = "imbd-api.com";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);
//        Httpclient

        // pegar só os dados interessantes (titulo, poster, classificação)
//        JsonParser jsonParser = new JsonParser();
//        List<Map<String, String>> listaDeFilmes = body;
        // exibir e manipular 
        System.out.println(body);
    }
}
