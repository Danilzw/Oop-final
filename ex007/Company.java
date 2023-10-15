package ex007;

import java.util.Random;

public class Company{

    private String companyName;
    private int maxSalary;
    private Agency JobAgency;
    private EnumType enumType;

    public int getMaxSalary() {
        return maxSalary;
    }

    public Company(String companyName,int maxSalary, Agency JobAgency,EnumType enumType)
    {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.JobAgency = JobAgency;
        this.enumType = enumType;
        
    }

    public void needEmploee()
    {
        Random random = new Random();
        int salary = random.nextInt(maxSalary);
        JobAgency.sendOffer(companyName,salary,enumType);
    }
    
}
