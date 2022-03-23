import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import com.diogonunes.jcolor.*;

class Main {
  public static void main(String[] args) throws Throwable {
    BufferedImage img = ImageIO.read(new File("rainbow.jpg"));
    for(int y = 0; y < img.getHeight(); y+= 10) {
      for(int x = 0; x < img.getWidth(); x+=5) {
        Color col = new Color(img.getRGB(x, y));
        Color col2 = new Color(img.getRGB(x, y + 1));
  
        System.out.print(Ansi.colorize("▄", Attribute.BACK_COLOR(col.getRed(), col.getGreen(), col.getBlue()), Attribute.TEXT_COLOR(col2.getRed(), col2.getGreen(), col2.getBlue())));
      }
      System.out.println();
    }
  }
}