package Lesson4;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @program: FxLesson3
 * @description:
 * @author: Wangly
 * @create: 2021-03-30 15:07
 */
public class Main3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 模态框设置
        Stage s1 = new Stage();
        s1.setTitle("s1");


        Stage s2 = new Stage();
        s2.setTitle("s2");
        // s2拥有s1
        s2.initModality(Modality.WINDOW_MODAL);
        s2.initOwner(s1);

        Stage s3 = new Stage();
        s3.setTitle("s3");
        // 单独模态框
        s3.initModality(Modality.APPLICATION_MODAL);


        s1.show();
        s2.show();
        s3.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}