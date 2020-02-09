import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        CustomObject customObject = new CustomObject();
        List<String> list = new ArrayList<>();
        System.out.println("Button class loader is " + button.getClass().getClassLoader());
        System.out.println("custom object class loader is " + customObject.getClass().getClassLoader());
        System.out.println("list class loader is " + list.getClass().getClassLoader());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
