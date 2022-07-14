import java.util.Scanner;

public class uri1933 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String frase = ler.nextLine();
        String array[] = new String[2];
        array = frase.split(" "); 
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        if(a==b){
            System.out.println(a);
        }else if(a>b) {
            System.out.println(a);
        

        }else{
            System.out.println(b);

        }
    }

}
