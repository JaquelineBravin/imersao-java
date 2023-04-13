import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
	public static void main(String[] args) throws Exception {
    	
//    	 API api = API.IMDB_TOP_SERIES;

//    	 String url = api.getUrl("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json");
//         ExtratorDeConteudo extrator = api.getExtrator();
    	 
//         String url = "https://api.nasa.gov/planetary/apod?api_key=67HQTzWQUMls5Y494fX9Icxv1PHmXwWNOXextKOo";
//         ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();

         String url = "http://localhost:8080/linguagens";
         ExtratorDeConteudo extrator = new ExtratorConteudoIMDB();

         var http = new ClienteHttp();
         String json = http.buscaDados(url);

         // exibir e manipular os dados 
         List<Conteudo> conteudos = extrator.extraiConteudos(json);

         var geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < 3; i++) {

            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println(conteudo.getTitulo());
            System.out.println();
        }
    }
}
