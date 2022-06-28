public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("ramazan", "TRH", "555");
        Teacher t2 = new Teacher("mustafa", "FZK", "532");
        Teacher t3 = new Teacher("ali", "MAT", "541");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course matematik = new Course("Matematik", "103", "MAT");
        matematik.addTeacher(t3);


        Student s1=new Student("Tugce","1328","4",matematik,fizik,tarih);
        s1.addBulkExamNote(80,80,80);
        s1.addBulkQuizNote(20,20,20);
        s1.printNote();
        s1.isPass();


    }
}
