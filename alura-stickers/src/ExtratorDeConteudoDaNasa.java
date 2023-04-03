import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNasa {
	
	public List<Conteudo> extraiConteudos(String json) {
		
		// pegar só os dados interessantes (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);
        System.out.println(listaDeConteudos.size());
        
        List<Conteudo> conteudos = new ArrayList<>();
	}
}
