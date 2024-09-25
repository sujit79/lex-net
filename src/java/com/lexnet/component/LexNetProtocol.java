package  com.lexnet.component;

public class LexNetProtocol{
	
	private LexNetProtocolBus lexNetProto;
	
	public LexNetProtocol() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LexNetProtocol(LexNetProtocolBus lexNetProto){
		this.lexNetProto = lexNetProto;
	}

	public LexNetProtocolBus getLexNetProto() {
		return lexNetProto;
	}

	public void setLexNetProto(LexNetProtocolBus lexNetProto) {
		this.lexNetProto = lexNetProto;
	}
	
}
