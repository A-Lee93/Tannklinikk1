package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        TableView<Person> tableView = new TableView<Person>();
        final Callback<TableColumn<Person, String>, TableCell<Person, String>> cellFactory = new DragSelectionCellFactory();
        ObservableList<Person> observableList = FXCollections.observableArrayList();
        tableView.setItems(observableList);
        TableColumn<Person,String> firstNameCol = new TableColumn<Person,String>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory("fornavn"));
        firstNameCol.setCellFactory(cellFactory);
        TableColumn<Person,String> lastNameCol = new TableColumn<Person,String>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory("etternavn"));
        lastNameCol.setCellFactory(cellFactory);


        tableView.getSelectionModel().setSelectionMode(
                SelectionMode.MULTIPLE
        );


        for(int i = 0; i < 10; i++)
        {
            observableList.add(new Person("Ali" + i, "El " + i));
        }

        tableView.getColumns().setAll(firstNameCol, lastNameCol);
        Button button = new Button("Test Knapp");
        button.setOnAction(e -> pushedButton());
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(button,tableView);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(stackPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    public void pushedButton()
    {
        System.out.println("You pressed the button!");
    }

    public static class DragSelectionCell extends TableCell<Person, String> {

        public DragSelectionCell() {
            setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    getTableView().getSelectionModel().clearAndSelect(getIndex());
                    startFullDrag();
                    getTableColumn().getTableView().getSelectionModel().select(getIndex(), getTableColumn());
                }
            });
            setOnMouseDragEntered(new EventHandler<MouseDragEvent>() {

                @Override
                public void handle(MouseDragEvent event) {
                    getTableColumn().getTableView().getSelectionModel().select(getIndex(), getTableColumn());
                }

            });
            setOnMouseReleased(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    System.out.println("Selected: ");
                    for(Person p : getTableView().getSelectionModel().getSelectedItems())
                    {
                        System.out.println(p.getInfo());
                    }
                }
            });
        }
        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            if (empty) {
                setText(null);
            } else {
                setText(item);
            }
        }

    }

    public static class DragSelectionCellFactory implements Callback<TableColumn<Person, String>, TableCell<Person, String>> {

        @Override
        public TableCell<Person, String> call(final TableColumn<Person, String> col) {
            return new DragSelectionCell();
        }

    }
}

