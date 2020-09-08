import carre.AuCarreServiceStub;
import carre.AuCarreServiceStub.CalculeResponse;
import carre.AuCarreServiceStub.Calcule;
public class Client {
   public static void main (String [] args){
       try{
           //creation d'un stub pour le service Web Hello World
           AuCarreServiceStub stub = new AuCarreServiceStub();
           //invocation de la methode calcule avec le int donne en args
            Calcule a = new Calcule();
            a.setArgs0(Integer.parseInt(args[0]));
           CalculeResponse resp = stub.calcule(a);
           // affichage de resultat
           System.out.println(resp.get_return());
       }catch(Exception e){
           System.out.println(e);
       }


   }   
} 