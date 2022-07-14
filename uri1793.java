import java.util.Scanner;


public class uri1793{
    public static void main(String[] args){
        int n;
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);

        n = ler.nextInt();
        while(n !=0){
            // System.out.print("aquii");

            String frase = ler.nextLine();
            // System.out.println(frase);
            String array[] = new String[30];
            array = frase.split(" "); 
            int c =0;
            int d =1;
            int contador = 0;
            // System.out.println(array.length-1);

            if((array.length-1)==0){
                contador=10;
            }
            contador=10;
            while(c <(array.length-1)){
               
                // if(Integer.parseInt(array[c+1])>(Integer.parseInt(array[c])+10)){
                    System.out.print("d");

                    System.out.println(Integer.parseInt(array[d]));
                    System.out.println("c");

                    System.out.println(Integer.parseInt(array[c]));

                if((Integer.parseInt(array[d])-Integer.parseInt(array[c]))>10){
                    System.out.println("aquii");

                    contador = contador+10;
                }else{
                    // contador = contador+Integer.parseInt(array[c]);
                    contador = contador+(Integer.parseInt(array[d])-Integer.parseInt(array[c]));

                }
                c=c+1;
                d=d+1;
                System.out.print("contador");

                System.out.println(contador);

            }        

        
       
            // System.out.println(array[0]);
            // System.out.println(array.length);
            System.out.println(contador);

            n = ler.nextInt();

        }
    }
}