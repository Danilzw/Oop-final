package ex007;

public class Program
{
    public static void main(String[] args) {
        
    

        Agency joAgency = new JobAgency();

        Company company = new Company("Google", 20000,joAgency,"Developer");
        Company company2 = new Company("Microsoft", 15600,joAgency,"Designer");
        Company company3 = new Company("Mechta", 1000,joAgency,"Cleaner");

        Worker worker = new Worker("Sergey");
        Worker worker2 = new Worker("Oleg");
        Freelancer freelancer = new Freelancer("Vladimir");

        joAgency.registerobserver(worker);
        joAgency.registerobserver(freelancer);
        joAgency.registerobserver(worker2);


        company.needEmploee();
        company2.needEmploee();
        company3.needEmploee();
    }
}