package Lesson7;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;


/**
 * @program: FxLesson3
 * @description:
 * @author: Wangly
 * @create: 2021-03-30 16:11
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        /**
         * URL 获取资源有问题
         * URL url = getClass().getClassLoader().getResource("src/Lesson7/ICON/img.png");
        String s = url.toExternalForm();*/
        // 跳转连接
        HostServices services = getHostServices();
        services.showDocument("www.baidu.com");
        // 节点
        Button button = new Button("按钮");
        button.setPrefHeight(200);
        button.setPrefWidth(200);
        button.setCursor(Cursor.MOVE);

        // 布局类
        Group group = new Group();
        group.getChildren().add(button);
        Scene scene = new Scene(group);
        scene.setCursor(Cursor.cursor("https://img.icons8.com/color/72/youtube-play.png"));
//        scene.setCursor(Cursor.CLOSED_HAND);

        // Stage -> Scene ->RootNode
        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);
        primaryStage.setTitle("javaFx");

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}