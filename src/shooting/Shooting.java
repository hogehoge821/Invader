package shooting;

import java.awt.*;

public class Shooting {
    private static ShootingFrame shootingFrame;
    private static boolean loop;

    public static void main(String args[]) {
        shootingFrame = new ShootingFrame();

        Graphics gra = shootingFrame.getPanel().getImage().createGraphics();

        loop = false;
        int fps = 30;

        while (loop) {
            var startTime = System.currentTimeMillis();

            gra.setColor(Color.WHITE);
            gra.fillRect(0,0,500,500);
            gra.setColor(Color.BLACK);
            gra.fillRect(100,100,100,100);

            shootingFrame.getPanel().draw();
            try {
                Thread.sleep((1000 / fps) - (System.currentTimeMillis() - startTime));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
