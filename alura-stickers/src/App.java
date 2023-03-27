import java.net.URI;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //fazer a conexão HTTP E BUSCAR OS TOP 250 FILMES
<<<<<<< HEAD
        String url = "gfdgfgfdgdfgddg";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient;
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);
=======
        String url = "imbd-api.com";
        Httpclient
>>>>>>> 508a71a19f16a96b6a895a81911f4a9aadd8dcbb

        // pegar só os dados interessantes (titulo, poster, classificação)
        JsonParser jsonParser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = body;
        // exibir e manipular 
    }
}
