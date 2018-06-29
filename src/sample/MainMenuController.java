package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Model.Squad;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Контроллер главного меню
 */
public class MainMenuController implements Initializable{

    private Squad squad;        //model

    //----------------------------------------------

    /**
     * Нажатие на кнопку инициирует открытие окна первого боя
     * @param actionEvent
     */
    @FXML
    public void ppcBtn(ActionEvent actionEvent) {
      FirstMap firstMap = new FirstMap();
      firstMap.run(actionEvent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * Отображает форму Главного меню
     * @param primaryStage
     * @throws IOException
     */
    public void run(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Designe/MainMenu.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
