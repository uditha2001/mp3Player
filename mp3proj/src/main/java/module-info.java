module org.example.mp3proj {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens org.example.mp3proj to javafx.fxml;
    exports org.example.mp3proj;
}