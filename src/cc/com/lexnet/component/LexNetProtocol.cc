#include <iostream>
#include <cstdlib>
#include <string>
#include <sys/socket.h>
#include "../h/common.h"

LexNetProtocol::LexNetProtocol(){
	std::cout<<"Invalid Usage LexNetServer portnum";
}
LexNetProtocol::LexNetProtocol(int port){
}
LexNetProtocol::~LexNetProtocol(){
}
Soc* LexNetProtocol::getSocketTcp(){
	return NULL;
}


