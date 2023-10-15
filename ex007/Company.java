package ex007;

import java.util.Random;

public class Company{

    private String companyName;
    private int maxSalary;
    private Agency JobAgency;
    private String vacancy;

    public int getMaxSalary() {
        return maxSalary;
    }

    public Company(String companyName,int maxSalary, Agency JobAgency,String vacancy)
    {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.JobAgency = JobAgency;
        this.vacancy = vacancy;
        
    }

    public void needEmploee()
    {
        Random random = new Random();
        int salary = random.nextInt(maxSalary);
        JobAgency.sendOffer(companyName,salary,vacancy);
    }
    
}
