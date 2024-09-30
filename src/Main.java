import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        enum MarcasAutos{
            Audi , BMW , TOYOTA , RENAULT , KIA , FERRARI
        }

        List<MarcasAutos> marcasAutos = new ArrayList<>();

       // marcasAutos.add(MarcasAutos.BMW);
        //System.out.println(marcasAutos.toString());

        for (Papeleria P : Papeleria.values()){
            System.out.println(P.name());
            System.out.println("CANTIDAD:" + P.getUnidades());
            System.out.println("PRECIO: " +P.getCosto());
        }

    }
}