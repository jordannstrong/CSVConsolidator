package main;

public class Order {
	
	private String OrderNumber;
	private String PPS;
	private String SSerial;
	private String FSerial;
	private String FMAC;
	private String hostname;
	private String xcp;
	public String getOrderNumber() {
		return OrderNumber;
	}
	
	public Order(String number) {
		OrderNumber = number;
	}
	
	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}
	public String getXcp() {
		return xcp;
	}
	public void setXcp(String xcp) {
		this.xcp = xcp;
	}
	public String getPPS() {
		return PPS;
	}
	public void setPPS(String pPS) {
		PPS = pPS;
	}
	public String getSSerial() {
		return SSerial;
	}
	public void setSSerial(String sSerial) {
		SSerial = sSerial;
	}
	public String getFSerial() {
		return FSerial;
	}
	public void setFSerial(String fSerial) {
		FSerial = fSerial;
	}
	public String getFMAC() {
		return FMAC;
	}
	public void setFMAC(String fMAC) {
		FMAC = fMAC;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

}
