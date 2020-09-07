package json.structure.information;

import java.util.List;

public class Item {
    String id;
    String type;
    String name;
    double ppu;
    Batters batters;


    Item(String id, String type, String name, double ppu, Batters batters){
         this.id =id;
         this.type=type;
         this.name =name;
         this.ppu =ppu;
         this.batters=batters;

     }

}
