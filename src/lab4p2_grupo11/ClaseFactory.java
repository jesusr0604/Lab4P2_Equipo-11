package lab4p2_grupo11;

import java.util.ArrayList;

public class ClaseFactory {
    public ArrayList<Entrenador> PocketTrainers =new ArrayList();

    public ClaseFactory(ArrayList<Entrenador> PocketTrainers) {
            Entrenador PocketTrainers.get(0)
        
    }
    
    
    
    public static void imprimirtrainer(ArrayList<Entrenador> t) {
       

            String no = "";
            for (int i = 0; i < t.size(); i++) {
                no += i + 1 + "." + t.get(i).getNombre().toString() + "\n";
            }
            System.out.println(no);

        
    }
    
    
    
}
