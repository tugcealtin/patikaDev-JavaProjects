public class Student {
    Course matematik;
    Course fizik;
    Course tarih;
    Course quiz;

    String name;
    String stuNo;
    String classes;
    double matAvarage;
    double fizAvarage;
    double tahAvarage;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course mat, Course fiz, Course trh) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.matematik = mat;
        this.fizik = fiz;
        this.tarih = trh;
        this.avarage=0.0;
        this.matAvarage=0.0;
        this.fizAvarage=0.0;
        this.tahAvarage=0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int matNot, int fizNot, int trhNot) {
        if (matNot >= 0 && fizNot <= 100) {
            this.matematik.note = matNot;
        }
        if (fizNot >= 0 && fizNot <= 100) {
            this.fizik.note = fizNot;
        }
        if (trhNot >= 0 && fizNot <= 100) {
            this.tarih.note = trhNot;
        }


    }

    void addBulkQuizNote(int matq, int fizq, int tarihq) {

        this.matematik.quiz = matq;
        this.fizik.quiz = fizq;
        this.tarih.quiz = tarihq;


    }
    void calculateAverage(){
        double mat=((this.matematik.quiz)*0.2)+((this.matematik.note)*0.8);
        this.matAvarage=mat;
        double fiz=((this.fizik.quiz)*0.2)+((this.fizik.note)*0.8);
        this.fizAvarage=fiz;
        double tah=((this.tarih.quiz)*0.2)+((this.tarih.note)*0.8);
        this.tahAvarage=tah;
    }

    void isPass() {
        calculateAverage();
        this.avarage = ((this.matAvarage + this.fizAvarage + this.tahAvarage) / 3);
        if (this.avarage < 55) {
            System.out.println("Ortalama: " + avarage + " ogrenci sinifta kaldi");
        } else {
            System.out.println("Ortalama: " + avarage + " sinifi gectiniz");
        }
    }

    void printNote() {
        System.out.println(name + " isimli ogrencinin notlari: ");
        System.out.println(this.matematik.name + "---Ders Notu: " + this.matematik.note + "/ Quiz notu: " + this.matematik.quiz);
        System.out.println(this.fizik.name + "---Ders Notu: " + this.fizik.note + "/ Quiz notu: " + this.fizik.quiz);
        System.out.println(this.tarih.name + "---Ders Notu: " + this.tarih.note + "/ Quiz notu: " + this.tarih.quiz);


    }
}
