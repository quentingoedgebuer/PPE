package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

   @FXML
   private Button button;

   @FXML
   private TextField text;


   @FXML
   private void nouvelleF(){

       try {
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(Main.class.getResource("justeP.fxml"));
           AnchorPane page = (AnchorPane) loader.load();

           Stage stage = new Stage();
           Scene scene = new Scene(page);
           stage.initModality(Modality.APPLICATION_MODAL);// on ne peut pas �crire dans les autres fen�tres

           JusteP controller = loader.getController();//Returns the controller associated with the root object.
           controller.setStage(stage);

           stage.setTitle("JUSTE PRIX Proposition");
           stage.setScene(scene);
           stage.show();

       }
       catch (IOException e){
           e.printStackTrace();
       }
   }




    public void fonctionText(){
        System.out.println("bonjour");

    }

   public void Fbutton() {


    }}
