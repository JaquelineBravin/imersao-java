import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
    public void cria() throws Exception {
        //ler a imagem 
        BufferedImage ImagemOriginal = ImageIO.read(new File("entrada/filme.jpg"));

        //criar nova imagem em memoria com transparencia e tamanho novo
        int largura = ImagemOriginal.getWidth();
        int altura = ImagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        //copiar imagem original pra nova imagem (em memoria)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(ImagemOriginal, null, 0, 0);

        //escrever uma frase na nova imagem

        //escrever nova imagem em um arquivo 
        ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"))

    }
    public static void main(String[] args) throws Exception {
        var geradora = new GeradoraDeFigurinhas();
        geradora.cria();
    }
}
