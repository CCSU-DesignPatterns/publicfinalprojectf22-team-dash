# Team Dash - Build a dashboard out of your data

![alt text](https://github.com/CCSU-DesignPatterns/publicfinalprojectf22-team-dash/blob/6b1d8e51648ffa957bd8eb6ca99cb70ac9a0dcca/img/DashEx.png?raw=true)

## Before use:

You must add the library files associated with JavaFX. 
	1. Right click on the project folder in the project explorer
	2. Select "Properties"
	3. Under "Libraries" Tab, click on "Modulepath"
	4. On the right side of the window, click "Add External JARs..."
	5. Add all .jar files in the /jar folder
	6. Update the run configuration to include the following in VM Arguments. Note the path needs to be updated:
		--module-path path\to\your\jars\folder --add-modules javafx.controls,javafx.fxml

## Sample use:

'''
import java.io.IOException;
import graph.strategy.GraphProfile;
import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException, InterruptedException {
		//Create a Pie Chart Profile
		String pieTitle = "Activities";
		String[] categories = {"Sleeping", "School", "Playing", "TV", "Music"};
		int[] data = {5,4,2,2,1};
		GraphProfile pieProfile = new GraphProfile(
				pieTitle, 
				categories, 
				data);
		
		//Create a Bar Chart Profile
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
		
		//Create a Line Chart Profile
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
		
		//Select a path to a photo for the title bar, or set imagePath to "None"
		String imagePath = "F:\\School\\Grad\\1_Fall_2022\\505_Design_Patterns\\FinalProjectGIT\\"
				+ "PRIVATE\\privatefinalprojectf22-team-dash\\img\\myccsu.png";
		//String imagePath = "None";
		
		//Setup a list of calls to add elements of the Dashboard. Add Title First. Charts will be drawn in order
		HBox[] elementQueue = {	driver.Domain.createTitle("Dashboard Team", imagePath),
								driver.Domain.addPieChart(pieProfile),
		                       	driver.Domain.addBarChart(barProfile),
		                    	driver.Domain.addLineChart(lineProfile),
		                    	driver.Domain.addBarChart(barProfile),
		                    	driver.Domain.addLineChart(lineProfile),
								driver.Domain.addPieChart(pieProfile)};
		                    	
		//Publish the Dashboard
		driver.Domain.publishDashboard(elementQueue, stage);
	}
}
'''