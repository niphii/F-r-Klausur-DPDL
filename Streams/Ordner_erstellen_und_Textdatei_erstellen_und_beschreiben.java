package Streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ordner_erstellen_und_Textdatei_erstellen_und_beschreiben {

	public static void main(String[] args) throws IOException {
		
		File ordner = new File("src/Streams/TextOrdner"); //Dateipfad startet immer im workspace Ordner!
        ordner.mkdirs(); //erstellt den Ordner, bzw. die Ordner die auch noch fehlen!
		
		
		String data = "Dies ist ein Test Satz!";
		
		try (FileWriter Datei = new FileWriter("src/Streams/TextOrdner/test.txt")) {
			Datei.write("Hallo!" + data);
		}

	}

}
