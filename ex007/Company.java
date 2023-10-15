package ex007;

import java.util.Random;

public class Company {

    private String companyName;
    private int maxSalary;
    private Agency JobAgency;

    public Company(String companyName,int maxSalary, Agency JobAgency)
    {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.JobAgency = JobAgency;
        
    }

    public void needEmploee()
    {
        Random random = new Random();
        int salary = random.nextInt(maxSalary);
        JobAgency.sendOffer(companyName,salary);
    }
    
}
