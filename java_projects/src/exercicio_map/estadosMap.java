

package exercicio_map;

import java.util.*;

public class estadosMap {
    public static <estados> void main(String[] args) {
        HashMap<String, Integer> estados = new HashMap<String, Integer>();

        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);


        //Substituição
        estados.put("RN", 3534165);

        //Verificação de existência de termo
        System.out.println("PB existe? " + estados.containsKey("PB"));

        //Exibe população de PE
        System.out.println("População PE: " + estados.get("PE"));

        if (estados.isEmpty()){
            System.out.println("Sem estados cadastrados");
        }





    }
}
