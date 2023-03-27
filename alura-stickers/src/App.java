import java.net.URI;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //fazer a conexão HTTP E BUSCAR OS TOP 250 FILMES
        String url = "gfdgfgfdgdfgddg";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient;
        var request = HttpRequest.newBuilder(endereco).GET().build();
        client.send(request, BodyHandlers)

        // pegar só os dados interessantes (titulo, poster, classificação)
        // exibir e manipular 
    }
}
