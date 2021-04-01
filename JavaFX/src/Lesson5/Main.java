package Lesson5;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * @program: FxLesson3
 * @description:
 * @author: Wangly
 * @create: 2021-03-30 15:15
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start方法里面的线程名字 :" +Thread.currentThread().getName() );
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("run方法里面的线程名字 :" +Thread.currentThread().getName() );
                int i = 1;
                while (i <= 10) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("i=" +i);
                    i = i + 1;
                }
            }
        });

        System.out.println("runLater下面");
    }

    public static void main(String[] args) {
        launch(args);
    }
}