    import java.util.Scanner;

public class uri1893 {
    public static void main(String[] args){

    Scanner ler = new Scanner(System.in);
    String frase = ler.nextLine();
    String array[] = new String[2];
    array = frase.split(" "); 
    int a = Integer.parseInt(array[0]);
    int b = Integer.parseInt(array[1]);
    if(b <= 2 ){
        System.out.println("nova");
    }else if(b <= 96 && a <= b){
        System.out.println("crescente");
    }else if (3 <= b && b <= 96 && a > b){
        System.out.println("minguante");

    }else if (b<= 100){
        System.out.println("cheia");

    }

        

    }
}