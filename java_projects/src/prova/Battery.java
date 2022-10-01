package prova;

public class Battery {
    public int getBattery(int... eventos) {
        int battery = 50;
        for (int i = 0; i < eventos.length; i++){
            battery = battery + (eventos[i]);
        }
        if (battery <= 100){
            return battery;
        }else{
            return 100;
        }

    }
}
