#ifndef _BUS_
#define _BUS_

class LexNetServiceBus{
public:
	LexNetProtocolBus *lProtoBus;
	LexNetServiceBus();
	LexNetServiceBus(int port);

	~LexNetServiceBus();

	LexNetProtocolBus* getLexNetProtocolBus();
};

#endif
