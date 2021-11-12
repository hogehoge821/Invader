package shooting;

import javax.swing.*;

public class ShootingFrame extends JFrame {
    private ShootingPanel panel;

    public ShootingFrame() {
        panel = new ShootingPanel();

        this.add(panel);

        this.addKeyListener(new Keyboard());
        this.setTitle("Shooting");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);//画面の真ん中にフレームを表示
//        this.setResizable(false);//画面の大きさを変更できないための処理
        this.setVisible(true);
    }

    //accessorメソッド
    public ShootingPanel getPanel() {
        return panel;
    }
}
