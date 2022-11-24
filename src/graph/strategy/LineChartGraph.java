package graph.strategy;

import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
* Strategy for drawing a Line Graph
* @author Steven Walker
*/
public class LineChartGraph implements GraphStrategy {

	@Override
	public Chart createGraph(GraphProfile profile) {
		//Defining X axis  
        NumberAxis xAxis = new NumberAxis(); 
        xAxis.setLabel(profile.getxAxisTitle()); 
                
        //Defining y axis 
        NumberAxis yAxis = new NumberAxis(); 
        yAxis.setLabel(profile.getyAxisTitle());
        
        LineChart lineChart = new LineChart(xAxis, yAxis);
                
        for(int x=0; x < profile.getThreeDimData().length; x++) {
        	XYChart.Series series = new XYChart.Series(); 
        	series.setName(profile.getRowTitles()[x]);
	        for(int y=0; y < profile.getThreeDimData()[x].length; y++) {
	        	series.getData().add(new XYChart.Data(profile.getThreeDimData()[x][y][0], profile.getThreeDimData()[x][y][1]));		        
	        }
	        lineChart.getData().add(series);
        }
	    lineChart.setTitle(profile.getTitle());
        
        return lineChart;

	}

}
