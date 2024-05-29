package sample.triliza;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private Label myL;

    @FXML
    private TextField myT;
    @FXML
    private Button myB;
    String username;

    private int me = 0;  //metritis gia pontous dikous mou
    private int pc = 0;  

    public void submit(ActionEvent event) {
        username = myT.getText();// eksxwrisi onomatos apo to pliktrologio
        myL.setText("Welcome " + username + ". Are you ready to play tic tac toe?");//emfanise sto kitrino tetragwno
        SCORE.setText(me + "                 " + pc);//emfanise ta arxika score
        myB.setDisable(true);//apenergopoiei to submit
    }
    

    //---------------------------------------------------------------------------------------
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    ArrayList<Button> buttons;

    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttons = new ArrayList<>(Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9));
        buttons.forEach(button -> {
            setupButton(button);//kalei tin sinartisi 
            button.setFocusTraversable(false);//Gia na min epilegei sunexeia ena koutaki kai to kanei mple gurw gurw
        });
    }

    private void setupButton(Button button) {
        myL.setDisable(true);//apenergopoihse 
        button.setOnMouseClicked(mouseEvent -> {
            myL.setText("");
            button.setText("X");
            button.setDisable(true);
            checkIfGameIsOver();
                 
//pithanoi tropoi na kaneis triliza
            if (button1.isDisable()) {  // An to button1 einai apenergopoihmeno kai to button 5 den einai apenergopoihmeno tote to pc na valei O sto button 5 kai na to apenergopoihsei
                if (!(button5.isDisable())) {
                    button5.setText("O");
                    button5.setDisable(true);
                } else if (!(button9.isDisable())) {
                    button9.setText("O");
                    button9.setDisable(true);
                } else if (!(button3.isDisable())) {
                    button3.setText("O");
                    button3.setDisable(true);
                } else if (!(button7.isDisable())) {
                    button7.setText("O");
                    button7.setDisable(true);
                } else if (!(button1.isDisable())) {
                    button1.setText("O");
                    button1.setDisable(true);
                } else if (!(button4.isDisable())) {
                    button4.setText("O");
                    button4.setDisable(true);
                } else if (!(button2.isDisable())) {
                    button2.setText("O");
                    button2.setDisable(true);
                } else if (!(button6.isDisable())) {
                    button6.setText("O");
                    button6.setDisable(true);
                } else if (!(button8.isDisable())) {
                    button8.setText("O");
                    button8.setDisable(true);
                }
            } else if (button2.isDisable()) {
                if (!(button5.isDisable())) {
                    button5.setText("O");
                    button5.setDisable(true);
                } else if (!(button9.isDisable())) {
                    button9.setText("O");
                    button9.setDisable(true);
                } else if (!(button3.isDisable())) {
                    button3.setText("O");
                    button3.setDisable(true);
                } else if (!(button7.isDisable())) {
                    button7.setText("O");
                    button7.setDisable(true);
                } else if (!(button1.isDisable())) {
                    button1.setText("O");
                    button1.setDisable(true);
                } else if (!(button4.isDisable())) {
                    button4.setText("O");
                    button4.setDisable(true);
                } else if (!(button2.isDisable())) {
                    button2.setText("O");
                    button2.setDisable(true);
                } else if (!(button6.isDisable())) {
                    button6.setText("O");
                    button6.setDisable(true);
                } else if (!(button8.isDisable())) {
                    button8.setText("O");
                    button8.setDisable(true);
                }
            } else if (button3.isDisable()) {
                if (!(button5.isDisable())) {
                    button5.setText("O");
                    button5.setDisable(true);
                } else if (!(button9.isDisable())) {
                    button9.setText("O");
                    button9.setDisable(true);
                } else if (!(button3.isDisable())) {
                    button3.setText("O");
                    button3.setDisable(true);
                } else if (!(button7.isDisable())) {
                    button7.setText("O");
                    button7.setDisable(true);
                } else if (!(button1.isDisable())) {
                    button1.setText("O");
                    button1.setDisable(true);
                } else if (!(button4.isDisable())) {
                    button4.setText("O");
                    button4.setDisable(true);
                } else if (!(button2.isDisable())) {
                    button2.setText("O");
                    button2.setDisable(true);
                } else if (!(button6.isDisable())) {
                    button6.setText("O");
                    button6.setDisable(true);
                } else if (!(button8.isDisable())) {
                    button8.setText("O");
                    button8.setDisable(true);
                }
            } else if (button4.isDisable()) {
                if (!(button5.isDisable())) {
                    button5.setText("O");
                    button5.setDisable(true);
                } else if (!(button9.isDisable())) {
                    button9.setText("O");
                    button9.setDisable(true);
                } else if (!(button3.isDisable())) {
                    button3.setText("O");
                    button3.setDisable(true);
                } else if (!(button7.isDisable())) {
                    button7.setText("O");
                    button7.setDisable(true);
                } else if (!(button1.isDisable())) {
                    button1.setText("O");
                    button1.setDisable(true);
                } else if (!(button4.isDisable())) {
                    button4.setText("O");
                    button4.setDisable(true);
                } else if (!(button2.isDisable())) {
                    button2.setText("O");
                    button2.setDisable(true);
                } else if (!(button6.isDisable())) {
                    button6.setText("O");
                    button6.setDisable(true);
                } else if (!(button8.isDisable())) {
                    button8.setText("O");
                    button8.setDisable(true);
                }
            } else if (button5.isDisable()) {
                if (!(button5.isDisable())) {
                    button5.setText("O");
                    button5.setDisable(true);
                } else if (!(button9.isDisable())) {
                    button9.setText("O");
                    button9.setDisable(true);
                } else if (!(button3.isDisable())) {
                    button3.setText("O");
                    button3.setDisable(true);
                } else if (!(button7.isDisable())) {
                    button7.setText("O");
                    button7.setDisable(true);
                } else if (!(button1.isDisable())) {
                    button1.setText("O");
                    button1.setDisable(true);
                } else if (!(button4.isDisable())) {
                    button4.setText("O");
                    button4.setDisable(true);
                } else if (!(button2.isDisable())) {
                    button2.setText("O");
                    button2.setDisable(true);
                } else if (!(button6.isDisable())) {
                    button6.setText("O");
                    button6.setDisable(true);
                } else if (!(button8.isDisable())) {
                    button8.setText("O");
                    button8.setDisable(true);
                }
            } else if (button6.isDisable()) {
                if (!(button5.isDisable())) {
                    button5.setText("O");
                    button5.setDisable(true);
                } else if (!(button9.isDisable())) {
                    button9.setText("O");
                    button9.setDisable(true);
                } else if (!(button3.isDisable())) {
                    button3.setText("O");
                    button3.setDisable(true);
                } else if (!(button7.isDisable())) {
                    button7.setText("O");
                    button7.setDisable(true);
                } else if (!(button1.isDisable())) {
                    button1.setText("O");
                    button1.setDisable(true);
                } else if (!(button4.isDisable())) {
                    button4.setText("O");
                    button4.setDisable(true);
                } else if (!(button2.isDisable())) {
                    button2.setText("O");
                    button2.setDisable(true);
                } else if (!(button6.isDisable())) {
                    button6.setText("O");
                    button6.setDisable(true);
                } else if (!(button8.isDisable())) {
                    button8.setText("O");
                    button8.setDisable(true);
                }
            } else if (button7.isDisable()) {
                if (!(button5.isDisable())) {
                    button5.setText("O");
                    button5.setDisable(true);
                } else if (!(button9.isDisable())) {
                    button9.setText("O");
                    button9.setDisable(true);
                } else if (!(button3.isDisable())) {
                    button3.setText("O");
                    button3.setDisable(true);
                } else if (!(button7.isDisable())) {
                    button7.setText("O");
                    button7.setDisable(true);
                } else if (!(button1.isDisable())) {
                    button1.setText("O");
                    button1.setDisable(true);
                } else if (!(button4.isDisable())) {
                    button4.setText("O");
                    button4.setDisable(true);
                } else if (!(button2.isDisable())) {
                    button2.setText("O");
                    button2.setDisable(true);
                } else if (!(button6.isDisable())) {
                    button6.setText("O");
                    button6.setDisable(true);
                } else if (!(button8.isDisable())) {
                    button8.setText("O");
                    button8.setDisable(true);
                }
            } else if (button8.isDisable()) {
                if (!(button5.isDisable())) {
                    button5.setText("O");
                    button5.setDisable(true);
                } else if (!(button9.isDisable())) {
                    button9.setText("O");
                    button9.setDisable(true);
                } else if (!(button3.isDisable())) {
                    button3.setText("O");
                    button3.setDisable(true);
                } else if (!(button7.isDisable())) {
                    button7.setText("O");
                    button7.setDisable(true);
                } else if (!(button1.isDisable())) {
                    button1.setText("O");
                    button1.setDisable(true);
                } else if (!(button4.isDisable())) {
                    button4.setText("O");
                    button4.setDisable(true);
                } else if (!(button2.isDisable())) {
                    button2.setText("O");
                    button2.setDisable(true);
                } else if (!(button6.isDisable())) {
                    button6.setText("O");
                    button6.setDisable(true);
                } else if (!(button8.isDisable())) {
                    button8.setText("O");
                    button8.setDisable(true);
                }
            } else if (button9.isDisable()) {
                if (!(button5.isDisable())) {
                    button5.setText("O");
                    button5.setDisable(true);
                } else if (!(button9.isDisable())) {
                    button9.setText("O");
                    button9.setDisable(true);
                } else if (!(button3.isDisable())) {
                    button3.setText("O");
                    button3.setDisable(true);
                } else if (!(button7.isDisable())) {
                    button7.setText("O");
                    button7.setDisable(true);
                } else if (!(button1.isDisable())) {
                    button1.setText("O");
                    button1.setDisable(true);
                } else if (!(button4.isDisable())) {
                    button4.setText("O");
                    button4.setDisable(true);
                } else if (!(button2.isDisable())) {
                    button2.setText("O");
                    button2.setDisable(true);
                } else if (!(button6.isDisable())) {
                    button6.setText("O");
                    button6.setDisable(true);
                } else if (!(button8.isDisable())) {
                    button8.setText("O");
                    button8.setDisable(true);
                }
            }

            checkIfGameIsOver();
        });
    }

    public String line;

    public void checkIfGameIsOver() {


                                        
    //kanei elegxo oles tis pithanes periptwseis trilizas
        for (int a = 0; a < 8; a++) {
            if (a == 0) {
                line = button1.getText() + button2.getText() + button3.getText();
            } else if (a == 1) {
                line = button4.getText() + button5.getText() + button6.getText();
            } else if (a == 2) {
                line = button7.getText() + button8.getText() + button9.getText();
            } else if (a == 3) {
                line = button1.getText() + button5.getText() + button9.getText();
            } else if (a == 4) {
                line = button3.getText() + button5.getText() + button7.getText();
            } else if (a == 5) {
                line = button1.getText() + button4.getText() + button7.getText();
            } else if (a == 6) {
                line = button2.getText() + button5.getText() + button8.getText();
            } else if (a == 7) {
                line = button3.getText() + button6.getText() + button9.getText();
            }
                
            
            
            if (line.equals("XXX")) {
                if (a == 1) {
                    button1.setDisable(true);
                    button7.setDisable(true);
                    button8.setDisable(true);
                    button9.setDisable(true);
                    button2.setDisable(true);
                    button3.setDisable(true);
                    me++;
                } else if (a == 0) {
                    button4.setDisable(true);
                    button7.setDisable(true);
                    button8.setDisable(true);
                    button9.setDisable(true);
                    button5.setDisable(true);
                    button6.setDisable(true);
                    me++;
                } else if (a == 2) {
                    button1.setDisable(true);
                    button4.setDisable(true);
                    button5.setDisable(true);
                    button6.setDisable(true);
                    button2.setDisable(true);
                    button3.setDisable(true);
                    me++;
                } else if (a == 3) {
                    button4.setDisable(true);
                    button7.setDisable(true);
                    button8.setDisable(true);
                    button3.setDisable(true);
                    button2.setDisable(true);
                    button6.setDisable(true);
                    me++;
                } else if (a == 4) {
                    button4.setDisable(true);
                    button2.setDisable(true);
                    button8.setDisable(true);
                    button9.setDisable(true);
                    button1.setDisable(true);
                    button6.setDisable(true);
                    me++;
                } else if (a == 5) {
                    button3.setDisable(true);
                    button2.setDisable(true);
                    button8.setDisable(true);
                    button9.setDisable(true);
                    button5.setDisable(true);
                    button6.setDisable(true);
                    me++;
                } else if (a == 6) {
                    button4.setDisable(true);
                    button7.setDisable(true);
                    button3.setDisable(true);
                    button9.setDisable(true);
                    button1.setDisable(true);
                    button6.setDisable(true);
                    me++;
                } else if (a == 7) {
                    button4.setDisable(true);
                    button7.setDisable(true);
                    button8.setDisable(true);
                    button1.setDisable(true);
                    button5.setDisable(true);
                    button2.setDisable(true);
                    me++;
                }
                label.setText(username + " won this round.");
                SCORE.setText(me / 2 + "                 " + pc / 2);

            } else if (line.equals("OOO")) {
                if (a == 0) {
                    button4.setDisable(true);
                    button7.setDisable(true);
                    button8.setDisable(true);
                    button9.setDisable(true);
                    button5.setDisable(true);
                    button6.setDisable(true);
                    pc = pc + 2;
                } else if (a == 1) {
                    button1.setDisable(true);
                    button2.setDisable(true);
                    button3.setDisable(true);
                    button7.setDisable(true);
                    button8.setDisable(true);
                    button9.setDisable(true);
                    pc = pc + 2;
                } else if (a == 2) {
                    button1.setDisable(true);
                    button4.setDisable(true);
                    button5.setDisable(true);
                    button6.setDisable(true);
                    button2.setDisable(true);
                    button3.setDisable(true);
                    pc = pc + 2;
                } else if (a == 3) {
                    button4.setDisable(true);
                    button7.setDisable(true);
                    button8.setDisable(true);
                    button3.setDisable(true);
                    button2.setDisable(true);
                    button6.setDisable(true);
                    pc = pc + 2;
                } else if (a == 4) {
                    button4.setDisable(true);
                    button2.setDisable(true);
                    button8.setDisable(true);
                    button9.setDisable(true);
                    button1.setDisable(true);
                    button6.setDisable(true);
                    pc = pc + 2;
                } else if (a == 5) {
                    button3.setDisable(true);
                    button2.setDisable(true);
                    button8.setDisable(true);
                    button9.setDisable(true);
                    button5.setDisable(true);
                    button6.setDisable(true);
                    pc = pc + 2;
                } else if (a == 6) {
                    button4.setDisable(true);
                    button7.setDisable(true);
                    button3.setDisable(true);
                    button9.setDisable(true);
                    button1.setDisable(true);
                    button6.setDisable(true);
                    pc = pc + 2;
                } else if (a == 7) {
                    button4.setDisable(true);
                    button7.setDisable(true);
                    button8.setDisable(true);
                    button1.setDisable(true);
                    button5.setDisable(true);
                    button2.setDisable(true);
                    pc = pc + 2;
                }
                label.setText("Computer has won this round.");
                SCORE.setText(me / 2 + "                 " + pc / 2);// epeidi ipirxe bug to ekana /2
            }
        }
    }

    @FXML
    private Label SCORE;

    @FXML
    void restartGame(ActionEvent event) {
        buttons.forEach(button -> this.resetButton(button));
        label.setText("");
    }

    @FXML
    public void setToZero(ActionEvent event) {  
        me = 0;
        pc = 0;
        label.setText("New game.");
        myB.setDisable(false);
        SCORE.setText(me + "                 " + pc);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("");
        alert.setHeaderText("The game ended. Wins has to 0. New game ");
        alert.showAndWait(); 
       restartGame(event);
    }

    public void resetButton(Button button) {
        button.setDisable(false);
        button.setText("");
    }

}
 