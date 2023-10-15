package ex007;

import java.util.Random;

public class Freelancer implements Observer {

    private String name;
    private int salary;

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
