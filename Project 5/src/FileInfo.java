import java.util.*;
import java.io.*;
/**
 * This class detects how many lines are in the 
 * @author Alexander Caruso <acaruso@skidmore.edu>
 */
public class FileInfo {
	private String fileToRead;
	private int lineCounter = 0;
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
	public int getLineCount() {
		return lineCounter;
	}
	
}