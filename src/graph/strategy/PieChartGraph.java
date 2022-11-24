package graph.strategy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.*;
import javafx.scene.chart.PieChart.Data;

/**
* Strategy for drawing a pie chart
* @author Steven Walker
*/
public class PieChartGraph implements GraphStrategy {

	@Override
	public Chart createGraph(GraphProfile profile) {
		ObservableList<Data> pieChartData = FXCollections.observableArrayList();
		for(int x=0; x < profile.getOneDimData().length; x++) {
			pieChartData.add(new PieChart.Data(profile.getCategoryTitles()[x], profile.getOneDimData()[x]));
		}
		PieChart pieChart = new PieChart(pieChartData);
		pieChart.setTitle(profile.getTitle());
		return pieChart;
		
	}

}
