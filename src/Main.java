import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite iznos koji trebate dobiti: ");
        int unos= scanner.nextInt();
        System.out.println("Unjeli ste: " + unos);

        int[] novcanice = {500,100,50,20,10,5,2,1};



        for(int i = 0; i< novcanice.length && unos!=0; i++){
            if(unos>= novcanice[i]){
                    System.out.println("Novcanica "+ novcanice[i]+" :"+unos/ novcanice[i]);
                unos=unos% novcanice[i];
            }
        }








    }


}

















