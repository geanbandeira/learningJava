import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    
    public void start(Stage primaryStage){
    Button btn = new Button();
    btn.setText("Clique Aqui");
    btn.setOnAction(event -> System.out.println("Clicou!"));
    
    StackPane root = StackPane();
    root.getChildren().add(btn);
    Scena scena = new Scena(root, 300, 250);
    
    primaryStage.setTitle("Começo");
    primaryStage.setScene(scene);
    primaryStage.show();
}
	public static void main(String[] args) {
        launch(args);
	}
}




