liblexnet.so:	ProtocolBus.o ServiceBus.o
	ld -shared -soname $@.1 -o $@.1.0 ProtocolBus.o ServiceBus.o -lc


ProtocolBus.o:	ProtocolBus.c 
	gcc -fPIC -c $<

ServiceBus.o:	ServiceBus.c
	gcc -fPIC -c $<

clean:
	rm -f *.so* *.o 

