package renameandorganize;

import java.io.IOException;
import java.util.HashMap;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.core.ZipFile;

import main.Order;

public class Unzip {
	
	public Unzip() {
		
	}
	public void unzip(HashMap<String, Order> orderMap) throws IOException, ZipException {
		for(String key : orderMap.keySet()) {
			ZipFile zip = new ZipFile("./" + key + ".zip");
			zip.extractAll("./" + key);
		}
	}
}
