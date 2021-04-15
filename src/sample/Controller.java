package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {

    @FXML
    private TextField fTextFild;

    @FXML
    private TextArea fTextArea;

    @FXML
    private Button fbSend;

    @FXML
    public void onClickMethod() {
      fTextArea.appendText(fTextFild.getText() + "\n");
      fTextFild.clear();
    }
}

