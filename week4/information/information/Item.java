package json.structure.information;

import java.util.List;

public class Item {
    int id;
    String type;
    String name;
    double ppu;
    Batters batters;


    Item(int id, String type, String name, double ppu, Batters batters){
         this.id =id;
         this.type=type;
         this.name =name;
         this.ppu =ppu;
         this.batters=batters;
         
     }

}
