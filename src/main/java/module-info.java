module com.castelar.contacts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.castelar.contacts to javafx.fxml;
//    exports com.castelar.contacts;
    exports com.castelar.contacts.control;
    opens com.castelar.contacts.control to javafx.fxml;
}