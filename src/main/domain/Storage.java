package domain;

import domain.pack.Pack;
import enums.Piority;
import enums.TypeOfPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class Storage {

    private final int x;
    private final int y;
    private final int z;

    HashMap<String, Package> idHistory;
    private ArrayList[][] storage;

    public Storage(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        initialize();
    }

    private void initialize() {

        this.storage = new ArrayList[x][y];

        for(int i = 0; i < x; i++)
            for(int j = 0; j < y; j++){
                storage[i][j] = new ArrayList<Pack>(this.y);
            }
    }

    public void addPackage(Piority hight, TypeOfPackage furniture) {
        for(int i = 0; i < x; i++)
            for(int j = 0; j < y; j++){
                ArrayList<Pack> sth = storage[i][j];

                if(sth.size() == this.y){
                    System.out.println("Kolumna pelna");
                }else{
                    sth.add(new Pack(hight, furniture));
                    System.out.println("Ilosc elementopw w kolumnie: " + sth.size());
                    return;
                }
        }
    }
}
