import hello.HelloWorldServiceStub;
import hello.HelloWorldServiceStub.HelloResponse;
public class Client {
   public static void main (String [] args){
       try{
           //creation d'un stub pour le service Web Hello World
           HelloWorldServiceStub stub = new HelloWorldServiceStub();
           //invocation de la methode hello
           HelloResponse resp = stub.hello();
           // affichage de resultat
           System.out.println(resp.get_return());
       }catch(Exception e){
           System.out.println(e);
       }


   }   
} 