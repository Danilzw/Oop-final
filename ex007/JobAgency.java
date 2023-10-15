package ex007;

import java.util.ArrayList;

public class JobAgency implements Agency{

    ArrayList<Observer> observers = new ArrayList<>();
    ArrayList<String> vacancy = new ArrayList<>();

    public void registerobserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeobserv(Observer observer)
    {
        observers.remove(observer);
    }

    public void sendOffer(String name,int salary,String vacancy)
    {
        for(Observer observer:observers)
        {
            if(vacancy == observer.getStatus())
            {
                observer.getOffer(name, salary);
            }
            
        }
    }
    
}
