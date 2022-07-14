import java.io.IOException;
import java.util.Arrays;
import java.io.FileReader;

public class uri2137 {
    public static void main(String[] args){
        int vet[] = new int[30];
        int d =0;
    try{
        FileReader fr = new FileReader(arquivo);
        String  c =  (String) fr.read();
    //   vet.push(c);
        vet[d]=Integer.parseInt(c);
        Arrays.sort(vet); 
        d=d+1;
        fr.close();
    }catch(IOException ex){
        ex.printStackTrace();
    }}
}
