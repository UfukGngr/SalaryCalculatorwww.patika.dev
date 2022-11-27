public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        double tax=0;
        if (this.salary < 1000){
            return 0;
        }
        if (salary >=1000){
            tax=(this.salary)*3/100;
        }
        return tax;
    }
    double bonus(){
        double bonus=0;
        if(this.workHours > 40){
            bonus=(workHours-40)*30.0;
        }
        return bonus;
    }
    double raiseSalary(){
        int totalYear=2021 - this.hireYear;
        double raise=0;
        if (totalYear <10 ){
            raise=this.salary*(5/100.0);
        }else if (totalYear > 9 && totalYear < 20 ) {
            raise=this.salary*(10/100.0);
        }else if (totalYear >19) {
            raise=this.salary*(15/100.0);
        }
        return raise;
    }

    void printEmployee(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı " + this.hireYear);
        System.out.println("Vergi " + this.tax());
        System.out.println("Bonus " + this.bonus());
        System.out.println("Maaş Artışı " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş " + (this.salary+this.bonus()-this.tax()));
        System.out.println("Toplam Maaş " + (this.salary+this.raiseSalary()));
    }
}
