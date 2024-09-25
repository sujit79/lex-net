#ifndef _SERVER_
#define _SERVER_

#include <iostream>
#include <cstdlib>
#include <string>
#include <sys/socket.h>

class LexNetServer{
public:
	 LexNetServer();
	 LexNetServer(int argc, char *argv [] ); 
	 ~LexNetServer();
};

#endif
