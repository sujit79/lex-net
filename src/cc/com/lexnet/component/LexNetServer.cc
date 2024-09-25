
#include "../h/common.h"
using namespace std;

LexNetServer::LexNetServer(){
 std::cout<<	"Invalid Usage !!!!!!!!!!!!"	<<endl;
 std::cout<<	"Usage LexNetServer [portserver] hostserver [portclient] hostclient "<<endl;
 std::cout<<	"Usage LexNetServer [portclient] hostclient "<<endl;
}
LexNetServer:: LexNetServer(int argc, char *argv [] ) {

 int port = std::atoi(argv [1]);
 LexNetServiceBus *Server1 = new LexNetServiceBus(port);
 int clientport = std::atoi(argv [3]);
}
LexNetServer::~LexNetServer(){
 exit(0);
}


int main(int argc, char *argv[]){
	LexNetServer *lServer = new LexNetServer(argc, argv);
	return 1;
}
