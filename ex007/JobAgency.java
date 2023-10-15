package ex007;

import java.util.ArrayList;

public class JobAgency implements Agency{

    ArrayList<Observer> observers = new ArrayList<>();

    public void registerobserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeobserv(Observer observer)
    {
        observers.remove(observer);
    }

    public void sendOffer(String name,int salary)
    {
        for(Observer observer:observers)
        {
            observer.getOffer(name, salary);
        }
    }
    
}
