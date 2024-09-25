package  com.lexnet.component;

public class LexNetProtocolBus{
	String URL = "URL";
	String PORT = "PORT";
	String PROTOCOL = "PROTOCOL";
	
	String PATH = "PATH";
	
	public LexNetProtocolBus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String url) {
		URL = url;
	}

	public String getPORT() {
		return PORT;
	}

	public void setPORT(String port) {
		PORT = port;
	}

	public String getPROTOCOL() {
		return PROTOCOL;
	}

	public void setPROTOCOL(String protocol) {
		PROTOCOL = protocol;
	}

	public String getPATH() {
		return PATH;
	}

	public void setPATH(String path) {
		PATH = path;
	}
	
	public LexNetProtocolBus getProtocolBus(){
		return this;
	}
	
	public void setProtocolBus(LexNetProtocolBus lexProtocolBus){
		setPATH(lexProtocolBus.getPATH());
		setURL(lexProtocolBus.getURL());
		setPORT(lexProtocolBus.getPORT());
		setPROTOCOL(lexProtocolBus.getPROTOCOL());
	}
}
