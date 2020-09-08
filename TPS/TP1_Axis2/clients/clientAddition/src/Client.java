import calculette.AdditionServiceStub;
import calculette.AdditionServiceStub.AdditionnerResponse;
import calculette.AdditionServiceStub.Additionner;
public class Client {
   public static void main (String [] args){
       try{
           //creation d'un stub pour le service Web Hello World
           AdditionServiceStub stub = new AdditionServiceStub();
           Additionner ad = new Additionner();
           ad.setEntier1(Integer.parseInt(args[0]));
           ad.setEntier2(Integer.parseInt(args[1]));
           AdditionnerResponse resp = stub.additionner(ad);
           // affichage de resultat
           System.out.println("resultat:" + resp.getResultat1());
       }catch(Exception e){
           System.out.println(e);
       }


   }   
} 