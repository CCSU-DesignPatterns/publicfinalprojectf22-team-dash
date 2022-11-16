# publicfinalprojectf22-team-dash

## Dashboard
![alt text](https://github.com/CCSU-DesignPatterns/publicfinalprojectf22-team-dash/blob/main/StrategyPattern/img/DashEx.png?raw=true)
## Before use:

You must add the library files associated with JavaFX. 
	1. Right click on the project folder in the project explorer
	2. Select "Properties"
	3. Under "Libraries" Tab, click on "Classpath"
	4. On the right side of the window, click "Add External JARs..."
	5. Add all .jar files in the /jar folder

## Sample use:

### Create a Pie Chart
```
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
  }
```
### Create a Bar Graph
```
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
barContext.executeStrategy(barProfile);
```
### Create a Line Graph
```
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
```
### Add a Photo
```
Image image = new Image(new FileInputStream("<FILEPATH>.png"));
ImageView imageView = new ImageView(image);
```
### Create the Dashboard
```
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
```
