package com.example.fis_escuela_salfa;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;

public class HelloApplication extends Application {

    private Scene escena;
    private VBox vBox;
    private HBox hBoxEscuela,hBoxNombres, hBoxlbls;
    private Button btnInicio;
    private File file, filecss, fAutoI, fEscuela, fChecador;
    private Image imgInterruptor, imgAutoI, imgEscuela, imgChecador;
    private Label lblAutoI, lblEscuela, lblNombres, lblChecador, lblCarretera;
    private ImageView view, imgVEscuela, imgVChecador;
    private Label lbl1, lbl2, lbl3, lbl4, lbl5;

    @Override
    public void start(Stage stage){
        crearUI();
        stage.setScene(escena);
        stage.setTitle("Emulador Escuela Sprint1 ALFA");
        stage.show();
    }

    private void crearUI() {
        vBox = new VBox();
        btnInicio = new Button();
        lblAutoI = new Label();
        hBoxEscuela = new HBox();
        lblEscuela = new Label();
        lblNombres = new Label();
        hBoxNombres = new HBox();
        lblChecador = new Label();
        lblCarretera = new Label();
        lbl1 = new Label();
        lbl2 = new Label();
        lbl3 = new Label();
        lbl4 = new Label();
        lbl5 = new Label();
        lbl1.setId("lblCochces");
        lbl2.setId("lblCochces");
        lbl3.setId("lblCochces");
        lbl4.setId("lblCochces");
        lbl5.setId("lblCochces");
        hBoxlbls = new HBox();

        //Boton Encender
        fEscuela = new File("src/main/java/com/example/fis_escuela_salfa/images/apagar.png");
        imgInterruptor = new Image(fEscuela.toURI().toString());
        view = new ImageView(imgInterruptor);
        view.setFitHeight(80);
        view.setFitWidth(80);
        btnInicio.setGraphic(view);

        //AutoInicial
        fAutoI = new File("src/main/java/com/example/fis_escuela_salfa/images/auto.gif");
        imgAutoI = new Image(fAutoI.toURI().toString());
        ImageView viewAuto = new ImageView(imgAutoI);
        viewAuto.setFitHeight(150);
        viewAuto.setFitWidth(150);
        lbl1.setGraphic(viewAuto);

        //NOMBRES
        lblNombres.setPadding(new Insets(10));
        lblNombres.setStyle("-fx-border-color: black;-fx-background-color:#EC7063;");
        lblNombres.setMinHeight(80);
        lblNombres.setMinWidth(220);

        //Escuela
        file = new File("src/main/java/com/example/fis_escuela_salfa/images/escuela.png");
        imgEscuela = new Image(file.toURI().toString());
        imgVEscuela = new ImageView(imgEscuela);
        imgVEscuela.setFitHeight(200);
        imgVEscuela.setFitWidth(200);
        lblEscuela.setGraphic(imgVEscuela);

        //Checador
        fChecador = new File("src/main/java/com/example/fis_escuela_salfa/images/checador.jpg");
        imgChecador = new Image(fChecador.toURI().toString());
        imgVChecador = new ImageView(imgChecador);
        imgVChecador.setFitHeight(110);
        imgVChecador.setFitWidth(60);
        lblChecador.setGraphic(imgVChecador);
        lblChecador.setPadding(new Insets(0, 100, 0, 0));

        //Carretera
        lblCarretera.setMinHeight(10);
        lblCarretera.setMinWidth(940);
        lblCarretera.setStyle("-fx-background-color:#5499C7;");

        btnInicio.setOnAction(event ->{
            file = new File("src/main/java/com/example/fis_escuela_salfa/images/encender.png");
            imgInterruptor = new Image(file.toURI().toString());
            view = new ImageView(imgInterruptor);
            btnInicio.setGraphic(view);
            view.setFitHeight(80);
            view.setFitWidth(80);
            btnInicio.setId("BotonPagado");
        });

        hBoxEscuela.getChildren().addAll(lblChecador,lblEscuela);
        hBoxEscuela.setPadding(new Insets(0, 190, 0, 0));
        hBoxNombres.getChildren().addAll(lblNombres);
        hBoxNombres.setPadding(new Insets(0, 180, 0, 0));
        hBoxEscuela.setAlignment(Pos.BOTTOM_RIGHT);
        hBoxNombres.setAlignment(Pos.BOTTOM_RIGHT);
        hBoxlbls.getChildren().addAll(lbl1,lbl2,lbl3,lbl4,lbl5);
        hBoxlbls.setSpacing(20);

        lbl1.setMinWidth(160);
        lbl1.setMinHeight(160);
        lbl2.setMinWidth(160);
        lbl2.setMinHeight(160);
        lbl3.setMinWidth(160);
        lbl3.setMinHeight(160);
        lbl4.setMinWidth(160);
        lbl4.setMinHeight(160);
        lbl5.setMinWidth(160);
        lbl5.setMinHeight(160);

        btnInicio.setId("BotonEncendido");
        btnInicio.setMaxHeight(50);
        btnInicio.setMinHeight(50);
        vBox.setPadding(new Insets(20));
        vBox.getChildren().addAll(btnInicio,hBoxNombres,hBoxEscuela,hBoxlbls,lblCarretera);
        escena = new Scene(vBox,1000,550);
        filecss = new File("src/main/java/com/example/fis_escuela_salfa/css/style/style.css");
        escena.getStylesheets().add(filecss.toURI().toString());
    }

    public static void main(String[] args) {
        launch();
    }
}