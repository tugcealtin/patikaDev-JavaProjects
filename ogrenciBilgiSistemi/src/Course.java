public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int quiz;


    Teacher teach;//ogrentmen sınıfından bir nitelik sağladık bu nitelik ogretmen sınıfıdnaki özellikleri  barındıracak

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;


    }

    //cours sınıfındaki metodu o sınıfta oluşturulan nesne sayesinde çağırabiliyoruz
    void printTeacherInfo() {
        this.teach.print();

    }

    void addTeacher(Teacher teach) {
        if (teach.branch.equals(this.prefix)) {
            this.teach = teach;
            System.out.println("derse ogretmen atandi ");
        } else {
            System.out.println("ogretmen ile ders uyusmuyor");
        }

    }
}
