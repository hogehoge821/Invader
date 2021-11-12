package shooting;

import javax.swing.*;

public class ShootingFrame extends JFrame {
    public ShootingFrame() {
        this.setTitle("Shooting");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationByPlatform(true);//フレームの表示位置をOSに任せる
        this.setVisible(true);
    }
}
