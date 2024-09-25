#ifndef _PROTOCOL_BUS_
#define _PROTOCOL_BUS_


class LexNetProtocolBus{
	LexNetProtocol *lProto;
public:
	LexNetProtocolBus(int port);
	
	~LexNetProtocolBus();
	LexNetProtocol* getLexNetProtocol();
};

#endif
