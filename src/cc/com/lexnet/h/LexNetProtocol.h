#ifndef _PROTOCOL_
#define _PROTOCOL_

#include <iostream>
#include <cstdlib>
#include <string>
#include <sys/socket.h>
#include "../h/SOC/SOC.h"

class LexNetProtocol{
public:
	LexNetProtocol();
	LexNetProtocol(int port);
	~LexNetProtocol();
	Soc * getSocketTcp();

};

#endif
