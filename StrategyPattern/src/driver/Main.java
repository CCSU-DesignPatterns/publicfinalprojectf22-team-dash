package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import graph.strategy.BarChartGraph;
import graph.strategy.GraphContext;
import graph.strategy.GraphProfile;
import graph.strategy.LineChartGraph;
import graph.strategy.PieChartGraph;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import profile.decorator.TitleDecorator;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;
import javafx.scene.Node;


public class Main extends Application{
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException, InterruptedException {
		String pieTitle = "Activities";
		String[] categories = {"Sleeping", "School", "Playing", "TV", "Music"};
		int[] data = {5,4,2,2,1};
		GraphProfile pieProfile = new GraphProfile(
				pieTitle, 
				categories, 
				data);
		GraphContext pieContext = new GraphContext(new PieChartGraph());
		GraphProfile newPieProfile = new TitleDecorator("New Activities", pieProfile);
		PieChart pieChart = (PieChart) pieContext.executeStrategy(newPieProfile);
		//PieChart pieChart = (PieChart) pieContext.executeStrategy(pieProfile);
		
		String barTitle = "Hours Teachers Spend Teaching";
		String[] pieRowTitles = {"Primary", "Lower Secondary", "Upper Secondary"};
		String[] columnTitles = {"Japan", "Spain", "Iceland", "USA"};
		int[][] twoDimData = {{600,650,580,740},{650,750,600,1000},{700,900,910,1180}};
		String barXAxisTitle = "Country";
		String barYAxisTitle = "Number of Hours";
		GraphProfile barProfile = new GraphProfile(
				barTitle, 
				pieRowTitles, 
				columnTitles, 
				twoDimData, 
				barXAxisTitle, 
				barYAxisTitle);
		GraphContext barContext = new GraphContext(new BarChartGraph());
		GraphProfile newBarProfile = new TitleDecorator("New Hours Teachers Spend Teaching", barProfile);
		BarChart barChart = (BarChart) barContext.executeStrategy(newBarProfile);
		//BarChart barChart = (BarChart) barContext.executeStrategy(barProfile);
		
		String lineTitle = "Example Line Graph";
		String[] lineRowTitles = {"Data 1", "Data 2", "Data 3"};
		int [][][] threeDimData = {{{1,1},{2,4},{3,3},{4,5},{5,5},{6,7},{7,7},{8,8}},
									{{1,5},{2,7},{3,6},{4,8},{5,4},{6,4},{7,2},{8,1}},
									{{3,4},{4,3},{5,2},{6,3},{7,6},{8,3},{9,4},{10,3}}};
		String lineXAxisTitle = "X Axis Values";
		String lineYAxisTitle = "Y Axis Values";
		GraphProfile lineProfile = new GraphProfile(
				lineTitle, 
				lineRowTitles, 
				threeDimData, 
				lineXAxisTitle, 
				lineYAxisTitle);
		GraphContext lineContext = new GraphContext(new LineChartGraph());
		GraphProfile newLineProfile = new TitleDecorator("New Example Line Graph", lineProfile);
		Chart lineChart = lineContext.executeStrategy(newLineProfile);
		//Chart lineChart = lineContext.executeStrategy(lineProfile);
		
		Image image = new Image(new FileInputStream("F:\\School\\Grad\\1_Fall_2022\\505_Design_Patterns\\FinalProjectGIT\\PRIVATE\\privatefinalprojectf22-team-dash\\StrategyPattern\\img\\myccsu.png"));
		ImageView imageView = new ImageView(image);
		
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setMargin(pieChart, new Insets(20,20,20,20));
		hbox.setMargin(barChart, new Insets(20,20,20,20));
		hbox.setMargin(lineChart, new Insets(20,20,20,20));
		hbox.getChildren().addAll(pieChart, barChart, lineChart);
		VBox vboxmain = new VBox();
		Label title = new Label("Dashboard Team");
		title.setTextFill(Color.color(0, 0, 1));
		title.setFont(new Font("Arial", 50));
		HBox imageTitle = new HBox();
		imageTitle.getChildren().addAll(imageView, title);
		imageTitle.setMargin(title, new Insets(60, 60, 60, 60));
		imageTitle.setMargin(imageView, new Insets(10, 10, 10, 10));
		vboxmain.getChildren().addAll(imageTitle, hbox);
		Scene scene = new Scene(vboxmain);
		stage.setTitle("Dashboard Example");
		stage.setScene(scene);
		stage.show();
		
		
	}
}
