package horadosistema;
import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;
public class HoraDoSistema{
    public static void main(String[] args){
        Date data = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(data.toString());
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println (loc.getDisplayLanguage()); 
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);
    

    }
}