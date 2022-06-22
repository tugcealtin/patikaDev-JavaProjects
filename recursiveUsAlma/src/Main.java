public class Main {
   static int usAlma(int us,int taban){
       if(us==0){
           return 1;
       }
       if(us==1){
           return taban;
       }

       return usAlma(us-1,taban)*usAlma(1,taban);
   }
    public static void main(String[] args) {

        System.out.println(usAlma(4,2));
    }
}
