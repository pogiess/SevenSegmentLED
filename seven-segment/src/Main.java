import controller.SevenSegmentController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/SevenSegment.fxml"));
        loader.load();
        stage.setScene(new Scene(loader.getRoot()));
        stage.show();

        SevenSegmentController sevenSegmentController = loader.getController();

        Thread thread = new Thread(() -> {
            for (int i = 0; i <= 9; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                sevenSegmentController.getNumberToShow(i);
            }
        });
        thread.start();
    }
}