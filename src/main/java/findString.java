import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class findString {
	private static final String FILENAME = "chapter7";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {

			// br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			//String text = br("textfile.txt");
			
			String sCurrentLine;
			
			Scanner sc2 = null;
			int count = 0;
			
		    try {
		        sc2 = new Scanner(new File("chapter7"));
		    } catch (FileNotFoundException e) {
		        e.printStackTrace();  
		    }
		    
		    while (sc2.hasNextLine() && count < 2194) {
		            Scanner s2 = new Scanner(sc2.nextLine());
		        while (s2.hasNext() && count < 2194) {
		            String s = s2.next();
		            System.out.println(s);
		            count++;
		        }
		    }

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
}
