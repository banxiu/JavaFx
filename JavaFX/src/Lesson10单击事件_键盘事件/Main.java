package Lesson10单击事件_键盘事件;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @program: FxLesson3
 * @description:
 * @author: Wangly
 * @create: 2021-03-31 10:11
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("button");
        // 布局
        b1.setLayoutX(100);
        b1.setLayoutY(100);
        b1.setPrefWidth(200);
        b1.setPrefHeight(200);
        //字体
        b1.setFont(Font.font(40));
        // b1的单击事件
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("单击事件");
            }
        });
        // 双击事件或多击事件
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getClickCount() == 2 && event.getButton().name().equals(MouseButton.PRIMARY.name())) {
                    System.out.println();
                    System.out.println("双击事件");
                }
            }
        });
        // 键盘事件监听
        b1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                if (event.getCode().getName().equals(KeyCode.A.getName())) {
                    System.out.println("按下了:" + event.getCode().name());
                }
            }
        });
       /* // 键盘释放事件
        b1.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("释放了:" + event.getCode().name());
            }
        });*/






        Group group = new Group();
        Scene scene = new Scene(group);
        group.getChildren().add(b1);
        primaryStage.setScene(scene);
        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.setTitle("javaFx");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}