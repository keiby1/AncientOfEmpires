package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Model.Factory;
import sample.Model.Squad;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * Контроллер первого боя
 */
public class FirstMap implements Initializable {

    @FXML
    private MenuItem nextTurn;
    private Squad squad;

    @FXML
    private ImageView img10;    //картинка замка
//-------------------------------------------------------

    /**
     * Начальная инициализация
     *
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {

      //ниже херня какая-то какая-то
        nextTurn.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Dsddddd");
            }
        });
    }

    /**
     * Нажатие на замок
     * открывает меню покупки югита
     *
     * @param event
     */
    @FXML
    private void img01Click(MouseEvent event) {
        WarriorCreaterController creater = new WarriorCreaterController();
        creater.run(event, this);
    }

    /**
     * Отображает окно первого боя
     *
     * @param actionEvent
     */
    public void run(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader();
            Stage stage = new Stage();
            Parent root = loader.load(getClass().getResource("Designe/FirstMap.fxml"));
            stage.setTitle("Первый бой");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.NONE);
            stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
            stage.showAndWait();
        } catch (Exception e) {
        }
    }

    /**
     * Получает выбранного воина и создает экземпляр посредством фабрики
     * @param s - тип воина
     */
    public void sendWarrior(String s) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Создан воин!");
        alert.setHeaderText("Тут доп инфо");
        alert.setContentText("Вы создали " + s);
        alert.showAndWait();

        if(s != null) {
            System.out.println(s);
            Factory.createUnit(s);
        }
        else{
            System.out.println("Получен пустой воин");
        }
    }

    @FXML
    public void menuItemNextTurnClick(ActionEvent actionEvent){
        System.out.println("dfsdf");
     /*   Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Передача хода");
        alert.setHeaderText("");
        alert.setContentText("Передать ход?");
        // option != null.
        Optional<ButtonType> option = alert.showAndWait();
        if (option.get() == ButtonType.OK) {
            //чтото
        } else if (option.get() == ButtonType.CANCEL) {
          //  что-то еще
        } else {
            //ваще ппц
        }
*/
    }
}