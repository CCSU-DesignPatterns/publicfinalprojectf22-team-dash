package graph.strategy;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class BarGraphConstructor extends ApplicationFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7154823509458825036L;

	public BarGraphConstructor(GraphProfile profile) {
		super(profile.title);
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		int rowLength = profile.twoDimData.length;
		int columnLength = profile.twoDimData[0].length;
		for(int x=0; x < rowLength; x++) {
			for(int y=0; y < columnLength; y++) {
				dataset.setValue(profile.twoDimData[x][y], profile.rowTitles[x], profile.columnTitles[y]);
			}	
		}
		JFreeChart chart = ChartFactory.createBarChart(
		profile.title,
		profile.xAxisTitle,
		profile.yAxisTitle,
		dataset,
		PlotOrientation.VERTICAL,
		true,
		true,
		false
		);
		ChartPanel chartPanel = new ChartPanel(chart, false);
		setContentPane(chartPanel);
		
	}

}
