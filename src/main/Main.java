import domain.Storage;
import domain.pack.Pack;
import enums.Piority;
import enums.TypeOfPackage;

public class Main {
    public static void main(String... args){
        Storage storage = new Storage(10, 2, 10);

        storage.addPackage(Piority.HIGHT, TypeOfPackage.FURNITURE);
        storage.addPackage(Piority.HIGHT, TypeOfPackage.FURNITURE);
    }
}
