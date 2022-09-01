import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tranzpozunu bılmak istediğiniz dizinin satırını girin: ");
        int row = input.nextInt();
        System.out.print("Tranzpozunu bılmak istediğiniz dizinin sütününu girin: ");
        int col = input.nextInt();

        int[][] Matris = new int[row][col];
        int[][] Transpoze = new int[col][row];
        System.out.println("Matris");
        for(int i =0 ;i < row; i++){
            for(int j = 0 ; j< col; j++){
                System.out.print((i+1) + ". satırın " + (j+1) + ". elemanını giriniz: ");
                Matris[i][j]= input.nextInt();
            }
        }
        System.out.println("Matris");
        for (int i = 0; i <Matris.length ; i++){
            for(int j = 0 ; j<Matris[i].length;j++){
                System.out.print(Matris[i][j] + " ");
            }
            System.out.println(" ");
        }

        for(int i = 0 ; i< row; i++){
            for(int j = 0; j<col; j++){
                Transpoze[j][i] = Matris[i][j];
            }
        }
        System.out.println("Transpoze");
        for (int i = 0; i <Transpoze.length ; i++){
            for(int j = 0 ; j<Transpoze[i].length;j++){
                System.out.print(Transpoze[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
