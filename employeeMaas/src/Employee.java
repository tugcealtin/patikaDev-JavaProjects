public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){

        if (this.salary < 1000){
            return salary;
        }else {
            double tax = salary * 0.03;
            return tax;
        }


    }

    int bonus() {
        if (this.workHours > 40) {
            int fazlaSaat = this.workHours - 40;
            int bonusUcret = fazlaSaat * 30;
            return bonusUcret;
        }
        System.out.println("bonus yok");
        return 0;
    }

    double raiseSalary() {
        if (hireYear <= 0 || hireYear > 2021) {
            System.out.println("gecersiz çalışma yili girdiniz! tekrar kontrol edin");
        } else {
            int calistiginYil = (2021 - this.hireYear);
            double zam;
            if (calistiginYil > 0 && calistiginYil < 10) {
                zam = this.salary * 0.05;
                return zam;
            } else if (calistiginYil>9&&calistiginYil<20) {
                zam=this.salary*0.1;
                return zam;
            } else if (calistiginYil>19) {
                zam=this.salary*0.15;
                return zam;
            }else {
            return 0;}
        }
return 0;
    }

   public  String toString(){
        double vergiBonus=this.salary+bonus()-tax();
        double toplamMaas=this.salary -tax() + bonus() + raiseSalary();
       System.out.println("Adı: "+this.name);
       System.out.println("Maasi: "+this.salary);
       System.out.println("Calisma saati: "+this.workHours);
       System.out.println("Başlangic yili: "+this.hireYear);
       System.out.println("Vergi: "+this.tax());
       System.out.println("Bonus: "+this.bonus());
       System.out.println("Maas Artisi: "+this.raiseSalary());
       System.out.println("Vergi ve bonus ile maas: "+vergiBonus);
       System.out.println("Toplam maas: "+toplamMaas);
        return null;
    }
}
