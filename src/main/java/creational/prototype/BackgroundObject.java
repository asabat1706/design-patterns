package creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;

//create concrete classes
@AllArgsConstructor
@Setter
public class BackgroundObject implements GraphicalObject
{
    private int x;
    private int y;
    private int width;
    private int height;
    private BackgroundObjType type;
//    private List<Integer> pixel = new ArrayList<>();

    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(x,y,width,height,type);
    }
}
