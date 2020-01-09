package Brandy;

import brandy.Componente;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ventanaController implements Initializable {

    @FXML
    Componente componentePrueba;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void sacarCompo(){
        componentePrueba.setNombre("Martin");
        componentePrueba.saludar();
    }
}
