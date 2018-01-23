/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;

import javafx.stage.Stage;

/**
 *
 * @author lg
 */
public class JavaFXApplication12 extends Application {
    
    TabPane tabPane;
    
    
    TableView dwTable, czwTable;
    
    
    TableView matrycaPlanow;
    TableView wynikiPomiarow,wariancje;
    
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
        loadTabs();
       
        
        
        
        
        Button btn = new Button();
        
        //////////////11111111111111111
        ///////1111111111111111
        
        dwTable = new TableView();
        
        
        
        
        
        
        
        
        /////////////////////////
        //////////////////////////
        
        
        
        
        
        Group root = new Group();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("dsfddfsfdsds");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    void loadTabs(){
        tabPane = new TabPane();
        tabPane.setPrefWidth(600);
        tabPane.getTabs().addAll(new Tab("1"),
                                 new Tab("2"),
                                 new Tab("3"),
                                 new Tab("4"),
                                 new Tab("5"));
        for(Tab tab : tabPane.getTabs()){
            tab.setClosable(false);
            tab.setContent(new Group());
        }
        
        
    }
    
    
    
    
}
