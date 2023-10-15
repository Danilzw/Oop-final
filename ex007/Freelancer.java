package ex007;

import java.util.Random;

public class Freelancer implements Observer{

    private String name;
    private int salary;
    private String status;

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public Freelancer(String name)
    {
        Random random = new Random(100);

        this.name = name;
        this.salary = random.nextInt();
        if(random.nextBoolean())
        {
            this.status = "Developer";
        }
        {
            this.status = "Designer";
        }
    }

    public void getOffer(String name,int salaryComp)
    {
        if(salaryComp <= salary)
        {
            System.out.printf("Я готов принять работу! (Company:%s,SalaryComp:%d)",name,salaryComp);
        }
        else
        {
            System.out.printf("Я НЕ готов принять работу! (Company:%s,SalaryComp:%d)",name,salaryComp);
        }
    }
    
}
