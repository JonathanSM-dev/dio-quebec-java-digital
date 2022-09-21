package exercicio_list;

import java.util.*;

public class listTemperatura {
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        List<String> month = new ArrayList<>();
        month.add("Jannuary");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");

        System.out.println("Insira a temperatura dos 6 primeiros meses em ordem de janeiro a junho:");

        Scanner scan = new Scanner(System.in);
        int tempTotal = 0;
        for (int i = 0; i < month.size(); i++) {
            temp.add(i, scan.nextInt());
        }

    Iterator<Integer> iterator = temp.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            tempTotal += next;
        }

        Integer avrgTemp = tempTotal/temp.size();

        //Faz a comparação entre a temperatura e a média através do método get
        for (int i = 0; i < month.size(); i++) {
            if (temp.get(i) > avrgTemp){
                System.out.println(month.get(i) + " - " + temp.get(i));
            }
        }


    }
}
