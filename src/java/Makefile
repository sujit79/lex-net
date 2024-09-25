JFLAGS = -g
JC = javac
JARUTIL = jar
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	com/lexnet/component/LexNetProtocolBus.java \
	com/lexnet/component/LexNetServer.java \
	com/lexnet/component/LexNetProtocol.java \
	com/lexnet/component/LexNetServiceBus.java 
default: classes jarcreate

jarcreate: classes
	$(JARUTIL) cvf ../lib/lexnet.jar com/lexnet/component/*.class

classes: $(CLASSES:.java=.class)

clean:
	$(RM) com/lexnet/component/*.class
	$(RM) ../lib/*.jar

