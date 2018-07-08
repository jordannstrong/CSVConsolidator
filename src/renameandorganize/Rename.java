package renameandorganize;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class Rename {
	public Rename() throws IOException {
		File f = new File("."); // current directory
	
		FileFilter directoryFilter = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
	
		File[] files = f.listFiles(directoryFilter);
		for(int i = 0; i < files.length; i++) {
			if(i == 0) {
				
			} else if (files[i].isDirectory()) {
				File path = files[i];
				
				File[] matches = path.listFiles(new FilenameFilter()
				{
				  public boolean accept(File dir, String name)
				  {
				     return name.endsWith("00L.txt");
				  }
				});
				
				File file = matches[0];

				File file2 = new File(matches[0].toString().substring(0, 9) + ".txt");
				
				
				// TODO: Add move to network folder
				//File file3 = new File()

				if (file2.exists())
				   throw new java.io.IOException("file exists");

				boolean success = file.renameTo(file2);
				//file2.renameTo();

				if (!success) {
				} else {
					file.delete();
				}
			} else {
			}
			System.out.println();
		}
	}
}
