import java.util.*;
import java.io.*;
public class FileInfo {
	String fileToRead;
	int lineCounter = 0;
	public FileInfo (String inputFile) {
		fileToRead = inputFile;
	}
	public void lineCounter () {
		Scanner fileReader = new Scanner(this.fileToRead);
		while (fileReader.hasNextLine()) {
			lineCounter++;
			fileReader.nextLine();
		}
	}
}