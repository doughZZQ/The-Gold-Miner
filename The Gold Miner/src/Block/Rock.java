package Block;

import java.awt.*;

public class Rock extends Block
{
    public Rock()
    {
        this.x = (int) (Math.random() * 550 + 100);
        this.y = (int) (Math.random() * 550 + 300);
        this.width = 52;
        this.height = 52;
        this.m = 50;
        this.score = 2;
        this.flag = false;
        this.type = 2;
        this.image = Toolkit.getDefaultToolkit().getImage("imgs/rock1.png");
    }
}
