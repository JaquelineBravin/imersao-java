import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
//import java.io.BufferedInputStream;
import java.io.File;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
    public void cria() throws Exception {
        //ler a imagem 
    	InputStream = new FileInpuStream(new File("entrada/filme.jpg"));
        BufferedImage ImagemOriginal = ImageIO.read(InputStream);

        //criar nova imagem em memoria com transparencia e tamanho novo
        int largura = ImagemOriginal.getWidth();
        int altura = ImagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        //copiar imagem original pra nova imagem (em memoria)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(ImagemOriginal, 0, 0, null);
        
        //fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setFont(fonte);

        //escrever uma frase na nova imagem
        graphics.drawString("TOPZERA", 100, novaAltura - 100);

        //escrever nova imagem em um arquivo 
        ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));

    }
    
    public static void main(String[] args) throws Exception {
        var geradora = new GeradoraDeFigurinhas();
        geradora.cria();
    }
}
