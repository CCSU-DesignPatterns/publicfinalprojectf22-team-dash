package graph.strategy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.*;

/**
* Strategy for drawing a pie chart
* @author Steven Walker
*/
public class PieChartGraph implements GraphStrategy {

	@Override
	public Chart createGraph(GraphProfile profile) {
		//DefaultPieDataset dataset = new DefaultPieDataset();
		ObservableList pieChartData = FXCollections.observableArrayList();
		for(int x=0; x < profile.getOneDimData().length; x++) {
			pieChartData.add(new PieChart.Data(profile.getCategoryTitles()[x], profile.getOneDimData()[x]));
			//dataset.setValue(profile.categoryTitles[x], profile.oneDimData[x]);
		}
		PieChart pieChart = new PieChart(pieChartData);
		pieChart.setTitle(profile.getTitle());
		return pieChart;
		
	}

}
