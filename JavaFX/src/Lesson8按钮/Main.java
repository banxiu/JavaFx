package Lesson8按钮;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



/**
 * @program: FxLesson3
 * @description:
 * @author: Wangly
 * @create: 2021-03-30 16:56
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 按钮
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        // 放里面就在一起了
        Group group = new Group();
//        group.getChildren().add(b1);
//        group.getChildren().add(b2);
//        group.getChildren().add(b3);
        b1.setLayoutX(0);
        b1.setLayoutY(10);

        b1.setPrefHeight(50);
        b1.setPrefWidth(50);

        b2.setLayoutX(200);
        b2.setLayoutY(10);

        b2.setPrefHeight(50);
        b2.setPrefWidth(50);

        b3.setLayoutX(400);
        b3.setLayoutY(10);

        b3.setPrefHeight(50);
        b3.setPrefWidth(50);
        group.getChildren().addAll(b1, b2, b3);

//        group.setAutoSizeChildren(false);
//        System.out.println(group.contains(0, 20));
        group.getChildren().addListener(new ListChangeListener<Node>() {
            @Override
            public void onChanged(Change<? extends Node> c) {
                System.out.println("当前组件大小 = " +c.getList().size());
            }
        });
        // 单击事件
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button b5 = new Button("b5");
                b5.setLayoutY(10);
                b5.setLayoutX(600);
                group.getChildren().add(b5);


            }
        });
        Object[] objects = group.getChildren().toArray();
        for (Object object : objects) {
            Button bu = (Button) object;
            bu.setPrefWidth(100);
            bu.setPrefHeight(100);

        }
        System.out.println(objects.length);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}