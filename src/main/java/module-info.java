module com.maxjacobi.randomnamegenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.maxjacobi.randomnamegenerator to javafx.fxml;
    exports com.maxjacobi.randomnamegenerator;
}