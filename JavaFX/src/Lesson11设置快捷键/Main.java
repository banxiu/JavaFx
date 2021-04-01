package Lesson11设置快捷键;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @program: FxLesson3
 * @description: 设置快捷键
 * @author: Wangly
 * @create: 2021-03-31 13:35
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 设置button
        Button b1 = new Button("b1");
        // 布局位置
        b1.setLayoutX(100);
        b1.setLayoutY(100);
        // 设置初始大小
        b1.setPrefWidth(200);
        b1.setPrefHeight(200);
        // 设置大小
        b1.setFont(Font.font(20));

        // 单击事件
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                play();
            }
        });
        // 设置组
        Group group = new Group();
        // 将按钮添加进组中
        group.getChildren().add(b1);

        // 创建场景 并将组添加到场景中
        Scene scene = new Scene(group);

        // 第一种 KeyCode 字母 KeyCombination 功能键 或 其他都可以 与字母绑定的键必须是功能键
        KeyCombination kc1 = new KeyCodeCombination(KeyCode.C, KeyCombination.ALT_DOWN, KeyCombination.CONTROL_DOWN);
        // 将控件与按钮绑定
        Mnemonic mnemonic1 = new Mnemonic(b1, kc1);
        // 将快捷键添加到场景中
        scene.addMnemonic(mnemonic1);
        // 第二种 单个字符 与功能键组合
        KeyCombination kc2 = new KeyCharacterCombination("o", KeyCombination.CONTROL_DOWN);
        // 将控件与按钮绑定
        Mnemonic mnemonic2 = new Mnemonic(b1, kc2);
        // 将快捷键添加到场景中
        scene.addMnemonic(mnemonic2);

        // 推荐用法
        KeyCombination kccb = new KeyCodeCombination(KeyCode.Y, KeyCombination.SHIFT_DOWN);
        scene.getAccelerators().put(kccb, new Runnable() {
            @Override
            public void run() {
                System.out.println("run方法");
                play();
            }
        });



        // 设置窗体标题 尺寸大小等
        primaryStage.setTitle("JavaFX");
        primaryStage.setHeight(700);
        primaryStage.setWidth(800);
        primaryStage.setScene(scene);

        // 窗体显示
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void play() {
        System.out.println("setOnAction");
    }
}