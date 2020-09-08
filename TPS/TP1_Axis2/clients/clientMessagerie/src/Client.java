import service.mail.MessagerieStub;
import service.mail.MessagerieStub.*;
public class Client {
   public static void main (String [] args){
       try{

           MessagerieStub stub = new MessagerieStub();

           SendMessage s = new SendMessage();
           s.setArgs0("lucas");
           s.setArgs1("franck");
           s.setArgs2("coucou");
           SendMessageResponse send = stub.sendMessage(s);
           System.out.println("Lucas a envoyé un mail à Franck : 'coucou'");

           GetMessages g = new GetMessages();
           g.setArgs0("franck");
           GetMessagesResponse get = stub.getMessages(g);
           Message[] reste = get.get_return();
           String lu;
           for (Message m : reste) {
               lu = m.getIsNew() ? "non lu" : "deja lu";
               System.out.println("-------\nMail de " + m.getFrom() + " à " + m.getTo() + " (" + lu + ") : \n" + m.getMessage() + "\n-------");
           }

           RemoveMessages r = new RemoveMessages();
           r.setArgs0("franck");
           RemoveMessagesResponse resp = stub.removeMessages(r);
           System.out.println("Franck a essayé de vider sa boite des mails lus donc : " + resp.get_return());

       }catch(Exception e){
           System.out.println("Erreur :");
           System.out.println(e);
       }


   }   
}