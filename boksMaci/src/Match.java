public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("========YENI ROUND=======");
                int chance = Math.round((float) Math.random());
                //.round en yakın sayıya yuvarlamak için kullanılır
                //.random 0 ile 1 arasında ondalıklı bir sayı verir böylece ya 1e yada 0a yuvarla dedik
                System.out.println("chance : " + chance);
                if (chance == 0) {
                    f2.health = f1.hit(f2);
                    if (isWin()) break;
                    f1.health = f2.hit(f1);
                    if (isWin()) break;                 //rastgele oyuncunun basladığı senaryo
                }
                if (chance == 1) {
                    f1.health = f2.hit(f1);
                    if (isWin()) break;
                    f2.health = f1.hit(f2);
                    if (isWin()) break;

                }
                printScore();

               /* this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(f1);           //birinci oyuncunun başladığı senaryo
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name+" Saglik : "+this.f1.health);
                System.out.println(this.f2.name+" Saglik : "+this.f2.health);*/
            }

        } else {
            System.out.println("Sporcular birbirine uygun degil");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + "kazandi");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + "kazandı");
            return true;
        }
        return false;
    }
    void printScore(){
        System.out.println("-----------");
        System.out.println(f1.name+" Kalan can \t:"+f1.health);
        System.out.println(f2.name+" Kalan can \t:"+f2.health);
    }
}
