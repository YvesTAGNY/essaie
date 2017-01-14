package controller;

import java.io.IOException;
import java.net.URL;

import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControleurConnexion extends Pane{
	
	@FXML private TextField nameUser;
	@FXML private Button inscription;
	@FXML private Button connexion;

    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
    }

    public StringProperty textProperty() {
        return  nameUser.textProperty();
    }

    @FXML
    protected void doInscription(ActionEvent event) throws IOException {
        System.out.println("doInscription : " + getText());
        setText("ex : Julle");
        //actions
        
        
        //fermeture de la fenetre de connection
        Stage cStage = (Stage)connexion.getScene().getWindow();
        cStage.close();  
        
        //ouverture de la fenetre Client
        final URL url = getClass().getResource("/view/IHM_Client.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader(url);
        final Pane root = (Pane) fxmlLoader.load();
        final Scene scene = new Scene(root);
        final Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        stage.requestFocus();
        //
        Label un = (Label) root.getChildren().get(17);
        un.setText(getText());
    }
    
    @FXML
    protected void doConnexion(ActionEvent event) throws IOException {
        System.out.println("doConnexion : " + getText());
        //actions
        
       
        
        //fermeture de la fenetre de connection
        Stage cStage = (Stage)connexion.getScene().getWindow();
        cStage.close();  
        
        //ouverture de la fenetre Client
        final URL url = getClass().getResource("/view/IHM_Client.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader(url);
        final Pane root = (Pane) fxmlLoader.load();
        final Scene scene = new Scene(root);
        final Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        //
        Label un = (Label) root.getChildren().get(17);
        un.setText(getText());
    }
}