package org.example.week3_assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.LightBase;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label distance;

    @FXML
    private  Label Fuelused;
    @FXML
    private Button calculate;
    @FXML
    private Label result;
    @FXML
    private TextField distanceText;
    @FXML
    private TextField fuelText;

    private ResourceBundle bundle;




    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void chanceLanguage_en(ActionEvent actionEvent) {
        Locale locale = new Locale("EN");
        bundle = ResourceBundle.getBundle("bundle", locale);
        distance.setText(bundle.getString("distance.text"));
        Fuelused.setText(bundle.getString("Fuelused.text"));
        calculate.setText(bundle.getString("calculate.text"));
    }

    public void chanceLanguage_fr(ActionEvent actionEvent) {
        Locale locale = new Locale("FR");
        bundle = ResourceBundle.getBundle("bundle", locale);
        distance.setText(bundle.getString("distance.text"));
        Fuelused.setText(bundle.getString("Fuelused.text"));
        calculate.setText(bundle.getString("calculate.text"));
    }

    public void chanceLanguage_jp(ActionEvent actionEvent) {
        Locale locale = new Locale("JP");
        bundle = ResourceBundle.getBundle("bundle", locale);
        distance.setText(bundle.getString("distance.text"));
        Fuelused.setText(bundle.getString("Fuelused.text"));
        calculate.setText(bundle.getString("calculate.text"));
    }

    public void chanceLanguage_ir(ActionEvent actionEvent) {
        Locale locale = new Locale("IR");
        bundle = ResourceBundle.getBundle("bundle", locale);
        distance.setText(bundle.getString("distance.text"));
        Fuelused.setText(bundle.getString("Fuelused.text"));
        calculate.setText(bundle.getString("calculate.text"));
    }

    public void setResult(){
        float dis = Float.parseFloat(distanceText.getText());
        float fuel = Float.parseFloat(fuelText.getText());

        float math = (fuel / dis) * 100;

        String resu =  Fuelused.getText() + " " + math + "L/100KM";

        result.setText(resu);
    }
}