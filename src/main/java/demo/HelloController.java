package demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cty;

    @FXML
    private Button getData;

    @FXML
    void initialize() {
        getData.setOnAction(event ->{
            System.out.println("Все ок");
        });
    }
}
