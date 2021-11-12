package shooting;

import javax.swing.*;

public class ShootingFrame extends JFrame {
    public ShootingFrame() {
        this.setTitle("Shooting");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);//画面の真ん中にフレームを表示
//        this.setResizable(false);//画面の大きさを変更できないための処理
        this.setVisible(true);
    }
}
