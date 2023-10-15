package ex007;


public interface Agency {

    public void registerobserver(Observer observer);

    public void removeobserv(Observer observer);

    public void sendOffer(String name,int salary,EnumType enumType);
    
}
