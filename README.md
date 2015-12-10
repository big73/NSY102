# NSY102
C'est un simple projet HelloWorld en java rmi

Il n'y a rien pas de besoin particulier pour l'exécuter, il suffit juste de "descendre les sources"
et de pré-compiler ou "interpréter" les classes comme ceci dans une invite de commande (peu importe l'OS). 
(Il faut être dans le répertoire "src" pour lancer les commandes suivantes).

$ javac fr/ipst/cnam/server/Server.java
$ javac fr/ipst/cnam/client/Client.java
$ javac fr/ipst/cnam/services/HelloInt.java
$ javac fr/ipst/cnam/services/HelloOD.java

maintenant il faut compiler le byte code en langage machine, ce qui va charger le programme en mémoire.

$ javac fr/ipst/cnam/server/Server

et dans une console
$ javac fr/ipst/cnam/client/Client

et là doit s'afficher dans la seconde console un joli "Hello world !"
