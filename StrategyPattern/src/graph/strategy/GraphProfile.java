package graph.strategy;

public class GraphProfile {
	protected String title;
	protected int rows;
	protected int columns;
	protected String[] rowTitles;
	protected String[] columnTitles;
	protected String[] categoryTitles;
	protected int[] oneDimData;
	protected int[][] twoDimData;
	protected int[][][] threeDimData;
	protected String xAxisTitle;
	protected String yAxisTitle;
	protected boolean showLabels;
	
	public GraphProfile(String title) {
		this.title = title;
	}

	public GraphProfile(String title, String[] titles, int[] data, boolean showLabels) {
		this.title = title;
		this.categoryTitles = titles;
		this.oneDimData = data;
		this.showLabels = showLabels;
	}
	
	public GraphProfile(String title, String[] rowTitles, String[] columnTitles, int[][] twoDimData, String xAxisTitle, String yAxisTitle) {
		this.title = title;
		this.rowTitles = rowTitles;
		this.columnTitles = columnTitles;
		this.twoDimData = twoDimData;
		this.xAxisTitle = xAxisTitle;
		this.yAxisTitle = yAxisTitle;
	}
	
	public GraphProfile(String title, String[] rowTitles, int[][][] threeDimData, String xAxisTitle, String yAxisTitle) {
		this.title = title;
		this.rowTitles = rowTitles;
		this.threeDimData = threeDimData;
		this.xAxisTitle = xAxisTitle;
		this.yAxisTitle = yAxisTitle;
	}
}