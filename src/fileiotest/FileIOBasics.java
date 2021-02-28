package fileiotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOBasics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File finp = new File("G://input.txt");

		File fout = new File("G://output.txt");

		FileInputStream finpstream = new FileInputStream(finp);

		FileOutputStream foutstream = new FileOutputStream(fout);

		int c = 0;

		while (c != -1) {

			c = finpstream.read();

			char letter = (char) c;
			if (c != -1) {
				
				System.out.print(letter);

				foutstream.write(letter);
			}
		}

		foutstream.close();

		finpstream.close();
	}

}
