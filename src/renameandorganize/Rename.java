package renameandorganize;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

import main.Order;

public class Rename {

	public Rename() {

	}

	public void rename(ArrayList<String> orders) throws IOException {
		File f = new File("."); // current directory

		for(String s : orders) {
			String path = ".\\" + s;
			
			File workingDir = new File(path);

			File[] matches = workingDir.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.endsWith("00L.txt");
				}
			});

			File file = matches[0];

			File file2 = new File(".\\" + s + "\\" + s + ".txt");
			File file3 = new File(".\\" + s + ".txt");
			
			
			// File file3 = new File(new URI("file:\\\\172.21.8.70\\ios\\gs\\" +
			// matches[0].toString().substring(0, 9) + ".txt"));

			// TODO: Add move to network folder
			// File file3 = new File()

			boolean success = file.renameTo(file2);
			boolean success2 = file.renameTo(file3);
			file.delete();
			// file2.renameTo(file3);

			if (!success) {
			} else {
				file.delete();
			}
			System.out.println();
		}
	}
}
