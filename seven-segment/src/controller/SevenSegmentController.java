package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class SevenSegmentController implements Initializable {


    @FXML
    private Rectangle a;

    @FXML
    private Rectangle b;

    @FXML
    private Rectangle c;

    @FXML
    private Rectangle d;

    @FXML
    private Rectangle e;

    @FXML
    private Rectangle f;

    @FXML
    private Rectangle g;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    private void resetLED() {
        Rectangle[] recs = {a,b,c,d,e,f,g};
        for (Rectangle rec:recs) {
            rec.setFill(Color.WHITE);
        }
    }

    private void turnLedOn(Rectangle...shapes) {
        resetLED();
        for (Rectangle shape:shapes) {
            shape.setFill(Color.BLACK);
        }
    }

    public void getNumberToShow(int num) {
        if (num == 0) {
            turnLedOn(a,b,c,d,e,f);
        } else if (num == 1) {
            turnLedOn(b,c);
        } else if (num == 2) {
            turnLedOn(a,b,g,e,d);
        } else if (num == 3) {
            turnLedOn(a,b,g,c,d);
        } else if (num == 4) {
            turnLedOn(b,c,g,f);
        } else if (num == 5) {
            turnLedOn(a,f,g,c,d);
        } else if (num == 6) {
            turnLedOn(a,c,d,e,f,g);
        } else if (num == 7) {
            turnLedOn(a,b,c);
        } else if (num == 8) {
            turnLedOn(a,b,c,d,e,f,g);
        } else if (num == 9) {
            turnLedOn(a,b,g,f,e,d);
        }
    }

}
