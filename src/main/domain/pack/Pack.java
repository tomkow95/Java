package domain.pack;

import enums.Piority;
import enums.TypeOfPackage;

import java.util.Date;

public class Pack {

    private String describe;
    private Date date;
    private int moves;
    private Piority values;
    private TypeOfPackage type;

    public Pack(Piority hight, TypeOfPackage furniture) {
        values = hight;
        type = furniture;
        date = new Date();
        this.moves = 0;
    }
}
