package Lesson6;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @program: FxLesson3
 * @description: Screen
 * @author: Wangly
 * @create: 2021-03-30 15:39
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 获取主屏幕
        Screen primary = Screen.getPrimary();
        // 全部界面尺寸
        Rectangle2D rec = primary.getBounds();
        //
        Rectangle2D rec1 = primary.getVisualBounds();
        // 全部屏幕宽高坐标
        System.out.println("左上角x = " + rec.getMinX() + " " + "右下角y = " + rec.getMinY());
        System.out.println("左上角x = " + rec.getMaxX() + " " + "右下角y = " + rec.getMaxY());
        System.out.println("左上角x = " + rec.getHeight() + " " + "右下角y = " + rec.getWidth());
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}