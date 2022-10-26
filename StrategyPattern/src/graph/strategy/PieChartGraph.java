package graph.strategy;

import java.text.DecimalFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class PieChartGraph implements GraphStrategy {

	@Override
	public void createGraph(GraphProfile profile) {
		DefaultPieDataset dataset = new DefaultPieDataset();
		int dataLength = profile.oneDimData.length;
		for(int x=0; x < dataLength; x++) {
			dataset.setValue(profile.categoryTitles[x], profile.oneDimData[x]);
		}
		//dataset.setValue("Category 1", 43.2);
		//dataset.setValue("Category 2", 27.9);
		//dataset.setValue("Category 3", 79.5);
		// create a chart...
		JFreeChart chart = ChartFactory.createPieChart(
		profile.title,
		dataset,
		true, // legend?
		true, // tooltips?
		false // URLs?
		);
		// create and display a frame...
		ChartFrame frame = new ChartFrame(profile.title, chart);
		frame.pack();
		frame.setVisible(true);
		if (profile.showLabels) {
		PiePlot plot = (PiePlot) chart.getPlot();
		PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator(
		"{0} = {2}", new DecimalFormat("0"), new DecimalFormat("0.00%"));
		plot.setLabelGenerator(generator);
		}
	}

}
