module co.edu.uniquindio.poo.laboratorio2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.laboratorio2 to javafx.fxml;
    exports co.edu.uniquindio.poo.laboratorio2;
}