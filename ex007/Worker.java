package ex007;

import java.util.Random;

public class Worker implements Observer{
    
    private String name;
    private int salary;
    private EnumType enumType;

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public Worker(String name,EnumType enumType)
    {
        Random random = new Random(20000);

        this.name = name;
        this.salary = random.nextInt();
        this.enumType = enumType;
        
    }

    public void getOffer(String name,int salaryComp,EnumType compenumType)
    {
        if(enumType == compenumType)
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
        else
        {
            System.out.println("Я не буду работать не по профессии");
        }
        
    }
}
