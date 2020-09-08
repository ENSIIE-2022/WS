package service.mail;
import java.util.*;
import service.mail.*;
public class MailServer{
    Vector<Message> messages;
    public MailServer(){
        this.messages = new Vector<Message>();
    }

   public String sendMessage(String fromp, String top, String messagep){
       // créer un  nouveau message 
       messages.add(new Message(fromp,top,messagep));
       // ajouter LE dans la listes des messages du serveur
       return ("Message sent successfully nb:" + messages.size());
    }

    public Message[] getMessages (String to){
        Vector<Message> ms = new Vector<Message>();
        for (Message me : this.messages) {
            if (me.getTo().equals(to)) {
                ms.add(me);
                me.setIsOld();
            }
        }
        return (Message[])ms.toArray();
    }

    public String removeMessages (String to){
	int oldMessageNumber=0;
    int i = 0;
    for (Message m : messages){
            if(m.getTo().equals(to)){
                messages.remove(i);
                oldMessageNumber=i;
            }
            i++;
        }
	// supprimer tous les messages marqué comme étant "lu" et dont le destinataire est "to"
	if(oldMessageNumber==0)
	   return ("No old messages");
	else
	   return ("Old messages removed successfully");
    }

}