package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import graph.strategy.BarChartGraph;
import graph.strategy.GraphContext;
import graph.strategy.GraphProfile;
import graph.strategy.LineChartGraph;
import graph.strategy.PieChartGraph;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.Chart;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Domain {
	
	public static boolean titleFlag = false;
	
	public static HBox createTitle(String titleString, String imagePath) throws FileNotFoundException, IOException, InterruptedException {
		HBox imageTitle = new HBox();
		if (imagePath != "None"){
			Image image = new Image(new FileInputStream(imagePath));
			ImageView imageView = new ImageView(image);
			HBox.setMargin(imageView, new Insets(10, 10, 10, 10));
			imageTitle.getChildren().add(imageView);
		}
		Label title = new Label(titleString);
		title.setTextFill(Color.color(0, 0, 1));
		title.setFont(new Font("Arial", 50));
		HBox.setMargin(title, new Insets(60, 60, 60, 60));	
		imageTitle.getChildren().add(title);
		titleFlag = true;
		return imageTitle;
	}
	
	public static HBox addPieChart(GraphProfile profile) {
		GraphContext pieContext = new GraphContext(new PieChartGraph());
		Chart pieChart = pieContext.executeStrategy(profile);
		HBox chartBox = new HBox();
		HBox.setMargin(pieChart, new Insets(1,1,1,1));
		chartBox.getChildren().add(pieChart);
		return chartBox;
	}
	
	public static HBox addBarChart(GraphProfile profile) {
		GraphContext barContext = new GraphContext(new BarChartGraph());
		Chart barChart = barContext.executeStrategy(profile);
		HBox chartBox = new HBox();
		HBox.setMargin(barChart, new Insets(1,1,1,1));
		chartBox.getChildren().add(barChart);
		return chartBox;
	}
	
	public static HBox addLineChart(GraphProfile profile) {
		GraphContext lineContext = new GraphContext(new LineChartGraph());
		Chart lineChart = lineContext.executeStrategy(profile);
		HBox chartBox = new HBox();
		HBox.setMargin(lineChart, new Insets(1,1,1,1));
		chartBox.getChildren().add(lineChart);
		return chartBox;
	}
	
	public static void publishDashboard(HBox[] queue, Stage stage) {
		VBox vboxmain = new VBox();
		int n = queue.length;
		int remaining = n;
		if (titleFlag){
			HBox[] chartQueue = new HBox[n-1];
			vboxmain.getChildren().add(queue[0]);
			for (int i = 1; i < n; i++) {
				chartQueue[i-1] = queue[i];
			}
			queue = chartQueue;
			remaining --;
		}
		
		HBox graphs = new HBox();
		int offset = 0;
		while (remaining > 0){
			for (int i = 0; (i < 3) & (remaining > 0); i++) {
				HBox.setMargin(queue[i + offset], new Insets(20, 20, 20, 20));
				graphs.getChildren().add(queue[i + offset]);
				remaining --;
			}
			vboxmain.getChildren().add(graphs);
			offset += 3;
			graphs = new HBox();
			graphs.setSpacing(10);
		}
		Scene scene = new Scene(vboxmain);
		stage.setTitle("Dashboard Viewer");
		stage.setScene(scene);
		stage.show();
	}
}