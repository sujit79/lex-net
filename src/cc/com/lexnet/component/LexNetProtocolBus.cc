#include "../h/common.h"

LexNetProtocolBus::LexNetProtocolBus(int port){
	this->lProto = (LexNetProtocol *)new LexNetProtocol(port);
}
LexNetProtocolBus::~LexNetProtocolBus(){
	delete this->lProto;
}
LexNetProtocol* LexNetProtocolBus::getLexNetProtocol(){
	return this->lProto;
}
