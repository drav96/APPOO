package com.sample.correlation;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.correlation.models.AirModel;
import com.sample.correlation.models.AirView;
import com.sample.correlation.utils.CorrelationCalculator;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button simpleButton = new Button();

    @FXML
    private TableView<AirView> correlationTable = new TableView<>();

    public void initialize(URL location, final ResourceBundle resources) {
        simpleButton.setOnAction(event -> handleButtonPress());
        initTableView();

    }

    private void initTableView() {
        TableColumn flagsColumn = new TableColumn("Flags");
        flagsColumn.setCellValueFactory(new PropertyValueFactory<>("flags"));
        TableColumn catalogColumn = new TableColumn("Catalog");
        catalogColumn.setCellValueFactory(new PropertyValueFactory<>("catalog"));
        TableColumn elevationColumn = new TableColumn("Elevation");
        elevationColumn.setCellValueFactory(new PropertyValueFactory<>("elevation"));
        TableColumn frequencyColumn = new TableColumn("Frequency");
        frequencyColumn.setCellValueFactory(new PropertyValueFactory<>("frequency"));
        TableColumn lengthColumn = new TableColumn("Length");
        lengthColumn.setCellValueFactory(new PropertyValueFactory<>("length"));


        correlationTable.getColumns().addAll(flagsColumn, catalogColumn, elevationColumn, frequencyColumn,
                lengthColumn);
    }

    /**
     * Async call for retrieving the data from API
     * Obtained data is converter into needed format and inserted into TableView
     */
    private void handleButtonPress() {
        simpleButton.setDisable(Boolean.TRUE);

        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(System.getProperty("user.dir") +
                    "/src/main/resources/airfields.json"));
            ObjectMapper objectMapper = new ObjectMapper();
            List<AirModel> list = objectMapper.readValue(jsonData, new TypeReference<List<AirModel>>() {
            });

            correlationTable.setItems(FXCollections.observableArrayList(CorrelationCalculator.getINSTANCE().
                    with(list).computeCorrelationMatrix()
                    .getOutList()));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
