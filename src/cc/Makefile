CPP = gcc
CPPFLAGS = -fPIC -shared -o
LIBRARYNAME=../lib/liblexnet.so

SRCS := $(wildcard com/lexnet/component/*.cc)
TEMP := $(wildcard com/lexnet/component/*.cc)
 
OBJS := $(patsubst %.cc,%.o, $(TEMP))

default: lexnetso



lexnetso: $(OBJS) 
	$(CPP) $(CPPFLAGS) $(LIBRARYNAME) -lc com/lexnet/component/LexNetProtocolBus.o com/lexnet/component/LexNetServer.o com/lexnet/component/LexNetProtocol.o com/lexnet/component/LexNetServiceBus.o
 


%.o:%.cc
	$(CPP) -fPIC -c -o $@ $<

clean:
	rm -f ../lib/*.so* 
	rm -f com/lexnet/component/*.o
