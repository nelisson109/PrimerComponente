module Ejemplo {
    exports Brandy;
    requires javafx.web;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires PrimerComponente;
    requires jdk.internal.le;
    requires javafx.fxml;


    opens Brandy to javafx.fxml;

}