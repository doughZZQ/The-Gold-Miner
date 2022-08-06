package Block;

import java.awt.*;

public class GoldSuper extends Gold {
    public GoldSuper() {
        super();
        this.width = 105;
        this.height = 105;
        this.m = 80;
        this.score = 10;
        this.image = Toolkit.getDefaultToolkit().getImage("imgs/gold2.gif");
    }
}
