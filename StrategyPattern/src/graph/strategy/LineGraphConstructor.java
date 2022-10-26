package graph.strategy;

import java.awt.Color;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RectangleInsets;

public class LineGraphConstructor extends ApplicationFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8426823621865158906L;

	public LineGraphConstructor(GraphProfile profile) {
	super(profile.title);
	XYSeriesCollection dataset = new XYSeriesCollection();
	int rowLength = profile.threeDimData.length;
	int xyPairLength = profile.threeDimData[0].length;
	for(int x=0; x < rowLength; x++) {
		XYSeries newseries = new XYSeries(profile.rowTitles[x]);
		for(int y=0; y < xyPairLength; y++) {
			newseries.add(profile.threeDimData[x][y][0], profile.threeDimData[x][y][1]);
		}
		dataset.addSeries(newseries);
	}
	
	JFreeChart chart = ChartFactory.createXYLineChart(
	profile.title,
	profile.xAxisTitle,
	profile.yAxisTitle,
	dataset,
	PlotOrientation.VERTICAL,
	true,
	true,
	false
	);
	
	chart.setBackgroundPaint(Color.white);
	XYPlot plot = (XYPlot) chart.getPlot();
	plot.setBackgroundPaint(Color.lightGray);
	plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
	plot.setDomainGridlinePaint(Color.white);
	plot.setRangeGridlinePaint(Color.white);
	NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
	rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
	ChartPanel chartPanel = new ChartPanel(chart);
	setContentPane(chartPanel);
	}
}