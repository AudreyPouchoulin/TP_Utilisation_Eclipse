import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.omg.CORBA.portable.ValueOutputStream;

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
	
	public void readFile(String pathFile) throws IOException{
		InputStream ips = null;
		try {
			ips = new FileInputStream(pathFile);
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			String ligne = br.readLine();
			System.out.println(ligne);
//			this.largeur=ligne.;
//			this.hauteur=;
//			this.maxNiveauGris=br.readLine();
//			
//			while ((ligne=br.readLine())!=null){
//				System.out.println(ligne);
//				chaine+=ligne+"\n";
//			}
			br.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void writeFile(){
		
	}
}
