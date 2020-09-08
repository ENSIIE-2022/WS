#commandes importantes :

###Compiler JAVA

un seul fichier : javac fichier.java
un package : javac *.java
executer : java Client.class

###Lancer le serveur Axis2 :
axis2server

###build avec Ant :
structure :
- Addition   
   - META-INF
       - Addition.wsdl
executer dans le dossier Addition : wsdl2java.sh -uri  META-INF/Addition.wsdl -p addition -d adb -s -ss -sd -ssi 
taper "ant" dans le dossier où se trouve le build.xml puis mettre le fichier /build/lib/*.aar dans axis2/repository/services enfin "axis2server".
Sinon faire "ant start.server

###Recup le framework Client :
avoir le serveur de lancé, faire :
wsdl2java.sh -uri http://localhost:8080/axis2/services/AdditionService?wsdl -d adb

