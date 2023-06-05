package com.sae;

import java.io.IOException;
import javafx.fxml.FXML;

public class AccueilController {

    @FXML
    private void switchToCreate() throws IOException {
        App.setRoot("CreateFoire");
    }
}
