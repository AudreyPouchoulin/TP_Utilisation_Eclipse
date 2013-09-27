import java.io.IOException;

/**
 * Project: TP_Utilisation_Eclipse
 * Creation date: 27 sept. 2013
 * Author: Audrey
 */

/**
 * @author Audrey
 *
 */
public class Main {
	public static void main (String[] args) throws IOException{
		ImagePGM image = new ImagePGM();
		String pathFile = "lena.pgm";
		image.readFile(pathFile);
	}
}
