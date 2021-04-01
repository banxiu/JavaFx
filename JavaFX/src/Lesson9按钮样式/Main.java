package Lesson9按钮样式;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


/**
 * @program: FxLesson3
 * @description: Button按钮以及简单介绍设置背景颜色和外边框等问题
 * @author: Wangly
 * @create: 2021-03-30 17:29
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("button");
        // 布局
        b1.setLayoutX(100);
        b1.setLayoutY(100);

        Button b2 = new Button("b2");
        b2.setLayoutX(100);
        b2.setLayoutY(100);

        b1.setPrefWidth(200);
        b1.setPrefHeight(200);

//        BackgroundFill backgroundFill = new BackgroundFill(Paint.valueOf("#8FBC8F00"),new CornerRadii(20),
//                new Insets(10));
//        Background background = new Background(backgroundFill);
//        b1.setBackground(background);
//        BorderStroke bos = new BorderStroke(Paint.valueOf("#9F81F7"), BorderStrokeStyle.DASHED, new CornerRadii(20),
//                new BorderWidths(10));
//        javafx.scene.layout.Border bo = new javafx.scene.layout.Border(bos);
//        b1.setBorder(bo);

        // 大小
        b1.setPrefWidth(200);
        b1.setPrefHeight(200);
        // 按钮背景颜色
        b1.setStyle("-fx-background-color: #FFB6C1");
        // 单击事件
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button b = (Button) event.getSource();
                System.out.println("b1的文本是 :" + b1.getText());
            }
        });
        Group group = new Group();
        Scene scene = new Scene(group);
        group.getChildren().add(b1);
//        group.getChildren().add(b2);
        primaryStage.setScene(scene);
        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}