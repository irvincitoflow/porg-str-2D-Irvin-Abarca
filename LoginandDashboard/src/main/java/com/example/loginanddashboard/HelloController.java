package com.example.loginanddashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField txUsuario;

    @FXML
    private TextField txCorreo;

    @FXML
    private PasswordField txPassword;

    @FXML
    private Label lbError;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        String usuario = txUsuario.getText().trim();
        String correo = txCorreo.getText().trim();
        String password = txPassword.getText();

        lbError.setText("");

        //Verifica que el correo no este vacio y sean minimo 4 caracteres
        if (correo.isEmpty() || correo.length() < 4) {
            lbError.setText("Error: El correo debe tener al menos 4 caracteres.");
            return;
        }
        if (!correo.contains("@") || !correo.contains(".")) {
            lbError.setText("Error: Formato de correo inválido.");
            return;
        }

        if (password.length() < 6) {
            lbError.setText("Error: La contraseña debe tener al menos 6 caracteres.");
            return;
        }

        //Cuando se valida entra a esta seccion
        String nombreUsuario = correo.substring(0, correo.indexOf("@"));
        lbError.setStyle("-fx-text-fill: green;");
        lbError.setText("¡Éxito! Cargando dashboard...");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
            Parent root = loader.load();

            com.example.Login.HomeContoller homeContoller = loader.getController();
            homeContoller.setUsuario(nombreUsuario);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            lbError.setText("Error al cargar la pantalla del Dashboard.");
        }
    }
}