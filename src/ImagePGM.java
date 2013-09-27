import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * Project: TP_Utilisation_Eclipse
 * Creation date: 27 sept. 2013
 * Author: Audrey
 */

public class ImagePGM {
	protected int largeur;
	protected int hauteur;
	protected int maxNiveauGris;
	protected int[][] pixels;
	
	/**
	 * Méthode pour lire une image et la sauver dans un objet "ImagePGM"
	 * @param pathFile: String
	 * @throws IOException
	 */
	
	public ImagePGM(){
		this.largeur = 0;
		this.hauteur = 0;
		this.maxNiveauGris = 0;
	}
	
	public void readFile(String pathFile) throws IOException{
		InputStream ips = null;
		try {
			ips = new FileInputStream(pathFile);
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			br.readLine();
			br.readLine();
			String ligne = br.readLine();
			StringTokenizer tokenizer = new StringTokenizer(ligne, " ");
			this.largeur = Integer.parseInt(tokenizer.nextToken());
			this.hauteur = Integer.parseInt(tokenizer.nextToken());
			this.pixels = new int[this.largeur][this.hauteur];
			int i=-1;
			while ((ligne=br.readLine())!=null){
				i++;
				StringTokenizer tokenizer2 = new StringTokenizer(ligne, " ");
				int j = -1;
				while(tokenizer2.hasMoreTokens()){
					j++;
					pixels[i][j]=Integer.parseInt(tokenizer2.nextToken());
				}
			}
			br.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeFile(){
		
	}
}
