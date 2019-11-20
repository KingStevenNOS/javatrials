import javafx.*;


public class App extends Application{

    public static void main(final String[] args) {
        launch(args);
    }

    public void start() {
        primaryStage.setTitle("Title of the window");
        Button button = new Button();
        button = setText("click me");

        final StackPane layout = new StackPane();
        layout.getChildren().add(button);

        final Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}