module org.example.week3_assignment2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week3_assignment2 to javafx.fxml;
    exports org.example.week3_assignment2;
}