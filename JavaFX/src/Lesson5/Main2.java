package Lesson5;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @program: FxLesson3
 * @description:
 * @author: Wangly
 * @create: 2021-03-30 15:30
 */
public class Main2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 设置隐式退出
        Platform.setImplicitExit(false);

        primaryStage.show();

        primaryStage.show();
        Platform.exit();

    }

    public static void main(String[] args) {
        launch(args);
    }
}