package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        primaryStage.setTitle("javaFx");
        // 图标
        primaryStage.getIcons().add(new Image("sample/img.png"));
        // 最小化
//        primaryStage.setIconified(true);
//        primaryStage.setMaximized(true); // 最大化
        // 宽度 高度
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);

        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                // 观察者
                System.out.println("当前高度 = " + newValue.doubleValue());
            }
        });
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                // 观察者
                System.out.println("当前宽度 = " + newValue.doubleValue());
            }
        });
        // 设置全屏 必须设置scene   stage ->scene->Node
        primaryStage.setFullScreen(true);
        primaryStage.setScene(new Scene(new Group()));
        primaryStage.show();
        // 这里获取 显示后的值


    }


    public static void main(String[] args) {
        launch(args);
    }
}
