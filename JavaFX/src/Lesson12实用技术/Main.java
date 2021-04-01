package Lesson12实用技术;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @program: FxLesson3
 * @description: 输入框，密码框，标签，实用技术
 * @author: Wangly
 * @create: 2021-03-31 15:35
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 输入框
        Group group = new Group();
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setHeight(700);
        primaryStage.setWidth(800);
        PasswordField ptext = new PasswordField();
        ptext.setLayoutX(400);
        ptext.setLayoutY(100);
        ptext.setFont(Font.font(20));
        ptext.setPromptText("请输入Nipple 密码");
        ptext.setFocusTraversable(false);
        TextField text = new TextField();
//        text.setText("文本");


        text.setLayoutX(100);
        text.setLayoutY(100);

        text.setFont(Font.font(20));
        // 提示
        Tooltip tooltip = new Tooltip();
        tooltip.setText("this is tips");
        tooltip.setFont(Font.font(20));
        text.setTooltip(tooltip);
        // 输入框提示
        text.setPromptText("请输入Nipple 尺寸");
        text.setFocusTraversable(false);
        // 输入框监听事件
        text.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // 限制输入字符
                System.out.println(oldValue);
                if (newValue.length() > 7) {
                    text.setText(oldValue);
                }
            }
        });
        // 选择监听器
        text.selectedTextProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(oldValue);
            }
        });

        //
        ptext.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });
        // 文本框单击事件 用鼠标
        text.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("单击事件");
            }
        });
        group.getChildren().add(text);
        group.getChildren().add(ptext);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}