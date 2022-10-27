# publicfinalprojectf22-team-dash

## First Pattern Available For Use:
## Data Graphing - Strategy Pattern

## Before use:

You must add the library files associated with JFreeChart. 
	1. Right click on the project folder in the project explorer
	2. Select "Properties"
	3. Under "Libraries" Tab, click on "Classpath"
	4. On the right side of the window, click "Add External JARs..."
	5. Add all .jar files in the /jar folder

## Sample use:

### Create a Pie Chart
```
public static void main(String[] args) {
  String pieTitle = "Activities";
  String[] categories = {"Sleeping", "School", "Playing", "TV", "Music"};
  int[] data = {5,4,2,2,1};
  boolean showDataLabels = true;
  GraphProfile pieProfile = new GraphProfile(
      pieTitle, 
      categories, 
      data, 
      showDataLabels);
  GraphContext pieContext = new GraphContext(new PieChartGraph());
  pieContext.executeStrategy(pieProfile);
  }
```
  ### Create a Bar Graph
```
  public static void main(String[] args) {
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
  barContext.executeStrategy(barProfile);}
```
  ### Create a Line Graph
```
  public static void main(String[] args) {
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
  lineContext.executeStrategy(lineProfile);}
```
