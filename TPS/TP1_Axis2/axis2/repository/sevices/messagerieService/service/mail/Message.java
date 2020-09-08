package service.mail;
public class Message implements java.io.Serializable {
    private String message="";
    private String from;
    private String to;
    private boolean isNew;
    
    public Message(String fromp, String top, String messagep){
	    setTo(top);
        setFrom(fromp);
        setMessage(messagep);
        setIsNew();
    }
    
    public String getTo(){
	return to;
    }
    public String getFrom(){
	return from;
    }
    public String getMessage(){
	return message;
    }
    public boolean getIsNew(){
	return isNew;
    }

    public void setTo(String top){
	to=top;
    }
    public void setFrom(String fromp){
	from=fromp;
    }
    
    //ici vous pouvez ajouter les methodes que vous jugez nécessaires
    public void setMessage(String messagep){
	message=messagep;
    }

    public void setIsNew(){
        isNew=true;
    }

    public void setIsOld(){
        isNew=false;
    }

    @Override
    public String toString(){
        return "to:" +to+ "from:" +from+ "msg:" +message+"\n";
    }
}