package ex007;

public class Program
{
    public static void main(String[] args) {
        
    

        Agency joAgency = new JobAgency();

        Company company = new Company("Google", 20000,joAgency,EnumType.Designer);
        Company company2 = new Company("Microsoft", 15600,joAgency,EnumType.Developer);
        Company company3 = new Company("Mechta", 1000,joAgency,EnumType.Cleaner);

        Worker worker = new Worker("Sergey",EnumType.Designer);
        Worker worker2 = new Worker("Oleg",EnumType.Cleaner);
        Freelancer freelancer = new Freelancer("Vladimir",EnumType.Developer);

        joAgency.registerobserver(worker);
        joAgency.registerobserver(freelancer);
        joAgency.registerobserver(worker2);


        company.needEmploee();
        company2.needEmploee();
        company3.needEmploee();
    }
}