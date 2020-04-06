package pl.edu.pwr.KantorApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pl.edu.pwr.KantorApp.Model.Valute;
import pl.edu.pwr.KantorApp.Repository.ValuteRepository;


/**
 * JavaFX App
 */

public class App extends Application {
	
    Group root = new Group();

	VBox strings = new VBox();

	HBox buttonBox = new HBox();

	ComboBox<Valute> valutaBox = new ComboBox<>();

	final private int WIDTH = 1000;
	final private int HEIGHT = 600;

	private ValuteRepository valuteRepository = new ValuteRepository();
	
    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        
        valutaBox.getItems().addAll(valuteRepository.getValutes());

		root.getChildren().add(strings);

		strings.setPadding(new Insets(10, 30, 10, 30));
		strings.setSpacing(20);

		strings.getChildren().add(new Text("Select the currency"));
		strings.getChildren().add(buttonBox);
		
		buttonBox.setSpacing(10);
		buttonBox.getChildren().add(valutaBox);
        
        var scene = new Scene(new StackPane(root), WIDTH, HEIGHT);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}