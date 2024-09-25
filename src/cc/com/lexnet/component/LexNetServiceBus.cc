#include "../h/common.h"

LexNetServiceBus::LexNetServiceBus(){
}

LexNetServiceBus::LexNetServiceBus(int port){
	//this->lProtoBus = (LexNetProtocolBus *) new LexProtocolBus(port);
}
LexNetServiceBus::~LexNetServiceBus(){
	delete this->lProtoBus;
}

LexNetProtocolBus* LexNetServiceBus::getLexNetProtocolBus(){
	return this->lProtoBus;
}
