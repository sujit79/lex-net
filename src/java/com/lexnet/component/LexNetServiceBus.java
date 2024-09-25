package  com.lexnet.component;

public class LexNetServiceBus{
	
	private LexNetProtocol lexNetProto;
	
	public LexNetProtocol getLexNetProto() {
		return lexNetProto;
	}
	public void setLexNetProto(LexNetProtocol lexNetProto) {
		this.lexNetProto = lexNetProto;
	}
	public LexNetServiceBus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LexNetServiceBus(LexNetProtocol lexNetProto){
		this.lexNetProto = lexNetProto;
	}
}
