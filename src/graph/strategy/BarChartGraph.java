package graph.strategy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * The strategy used for creating a Bar Graph
 * @see GraphStrategy
 * @author Steven Walker
 *
 */
public class BarChartGraph implements GraphStrategy {
	@Override
	public Chart createGraph(GraphProfile profile) {
		//Defining the x axis               
        CategoryAxis xAxis = new CategoryAxis();   
        ObservableList<String> rowCategories = FXCollections.observableArrayList();
		for(int x=0; x < profile.getColumnTitles().length; x++) {
			rowCategories.add(profile.getColumnTitles()[x]);}      
        xAxis.setCategories(rowCategories); 
        xAxis.setLabel(profile.getxAxisTitle());  

        //Defining the y axis 
        NumberAxis yAxis = new NumberAxis(); 
        yAxis.setLabel(profile.getyAxisTitle());
        BarChart<?, ?> barChart = new BarChart(xAxis, yAxis);  
        barChart.setTitle(profile.getTitle());
        ObservableList barChartData = FXCollections.observableArrayList();
        for(int x=0; x < profile.getRowTitles().length; x++) {
        	XYChart.Series<String, Number> series = new XYChart.Series<>(); 
        	series.setName(profile.getRowTitles()[x]);
        	for(int y=0; y < profile.getColumnTitles().length; y++) {
        		series.getData().add(new XYChart.Data<>(profile.getColumnTitles()[y], profile.getTwoDimData()[x][y])); 
        	}
        	barChartData.add(series);
        }
        barChart.setData(barChartData);
        
        return barChart;
	}

}

	


