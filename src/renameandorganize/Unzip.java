package renameandorganize;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.core.ZipFile;

import main.Order;

public class Unzip {
	
	public Unzip() {
		
	}
	public void unzip(ArrayList<String> orders) throws IOException, ZipException {
		for(String s : orders) {
			ZipFile zip = new ZipFile("./" + s + ".zip");
			zip.extractAll("./" + s);
		}
	}
}
