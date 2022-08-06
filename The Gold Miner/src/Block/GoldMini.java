package Block;

import java.awt.*;

public class GoldMini extends Gold {
    public GoldMini() {
        super();
        this.width = 36;
        this.height = 36;
        this.m = 10;
        this.score = 4;
        this.image = Toolkit.getDefaultToolkit().getImage("imgs/gold0.gif");
    }
}
