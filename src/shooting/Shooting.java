package shooting;

import java.awt.*;

public class Shooting {
    private static ShootingFrame shootingFrame;
    private static boolean loop;

    public static void main(String args[]) {
        shootingFrame = new ShootingFrame();

        Graphics gra = shootingFrame.getPanel().getImage().createGraphics();

        loop = true;
        long startTime;
        long fpsTime = 0;
        int fps = 30;
        int FPS = 0;
        int FPSCount = 0;

        while (loop) {
            if ((System.currentTimeMillis() - fpsTime) >= 1000) {
                fpsTime = System.currentTimeMillis();
                FPS = FPSCount;
                FPSCount = 0;
            }
            FPSCount++;
            startTime = System.currentTimeMillis();
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
            System.out.println(System.currentTimeMillis() - startTime);
        }
    }
}
