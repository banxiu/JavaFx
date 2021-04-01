package Lesson4;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

/**
 * @program: FxLesson3
 * @description:
 * @author: Wangly
 * @create: 2021-03-30 14:50
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 设置透明
        primaryStage.setOpacity(0.5);
        // 设置应用始终在最顶层
        primaryStage.setAlwaysOnTop(true);

        primaryStage.setX(500);
        primaryStage.setY(500);

        primaryStage.xProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("x坐标 = " + newValue);

            }
        });
        // 监听事件   观察者模式
        primaryStage.yProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("y坐标 = " + newValue);
            }
        });
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}