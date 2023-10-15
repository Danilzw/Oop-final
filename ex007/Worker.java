package ex007;

import java.util.Random;

public class Worker implements Observer{
    
    private String name;
    private int salary;

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public Worker(String name)
    {
        Random random = new Random(20000);

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
