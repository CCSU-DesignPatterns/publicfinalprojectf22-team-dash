package graph.strategy;

/**
 * Graph Profile holds parameters used to define elements of the graph to be drawn.
 * @param title The title of the chart
 * @param rowTitles The titles along the rows of input data
 * @param columnTitles The titles along the columns of input data
 * @param categoryTitles The titles of categories for pie charts
 * @param oneDimData The input data used for 1 dimensional data i.e. pie charts
 * @param twoDimData The input data used for 2 dimensional data i.e. bar graphs
 * @param threeDimData The input data used for 3 dimensional data i.e. line charts. In this case, 3 dimensional refers to a 2-D data table containing [x,y] pairs.
 * @param xAxisTitle The titles along the X-Axis
 * @param yAxisTitle The titles along the Y-Axis
 * @param showLabels A boolean to determine whether or not to display data labels on charts
 * @author Steven Walker
 *
 */
public class GraphProfile {
	public String title;
	protected String[] rowTitles;
	protected String[] columnTitles;
	protected String[] categoryTitles;
	protected int[] oneDimData;
	protected int[][] twoDimData;
	protected int[][][] threeDimData;
	protected String xAxisTitle;
	protected String yAxisTitle;
	
	/**
	* Constructor for GraphProfile with arguments to support a pie chart
	*/
	public GraphProfile(String title, String[] titles, int[] data) {
		this.title = title;
		this.categoryTitles = titles;
		this.oneDimData = data;
	}
	
	/**
	* Constructor for GraphProfile with arguments to support a bar graph
	*/
	public GraphProfile(String title, String[] rowTitles, String[] columnTitles, int[][] twoDimData, String xAxisTitle, String yAxisTitle) {
		this.title = title;
		this.rowTitles = rowTitles;
		this.columnTitles = columnTitles;
		this.twoDimData = twoDimData;
		this.xAxisTitle = xAxisTitle;
		this.yAxisTitle = yAxisTitle;
	}
	
	/**
	* Constructor for GraphProfile with arguments to support a line chart
	*/
	public GraphProfile(String title, String[] rowTitles, int[][][] threeDimData, String xAxisTitle, String yAxisTitle) {
		this.title = title;
		this.rowTitles = rowTitles;
		this.threeDimData = threeDimData;
		this.xAxisTitle = xAxisTitle;
		this.yAxisTitle = yAxisTitle;
	}
	
	public GraphProfile() {
		this.title = null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getRowTitles() {
		return rowTitles;
	}

	public void setRowTitles(String[] rowTitles) {
		this.rowTitles = rowTitles;
	}

	public String[] getColumnTitles() {
		return columnTitles;
	}

	public void setColumnTitles(String[] columnTitles) {
		this.columnTitles = columnTitles;
	}

	public String[] getCategoryTitles() {
		return categoryTitles;
	}

	public void setCategoryTitles(String[] categoryTitles) {
		this.categoryTitles = categoryTitles;
	}

	public int[] getOneDimData() {
		return oneDimData;
	}

	public void setOneDimData(int[] oneDimData) {
		this.oneDimData = oneDimData;
	}

	public int[][] getTwoDimData() {
		return twoDimData;
	}

	public void setTwoDimData(int[][] twoDimData) {
		this.twoDimData = twoDimData;
	}

	public int[][][] getThreeDimData() {
		return threeDimData;
	}

	public void setThreeDimData(int[][][] threeDimData) {
		this.threeDimData = threeDimData;
	}

	public String getxAxisTitle() {
		return xAxisTitle;
	}

	public void setxAxisTitle(String xAxisTitle) {
		this.xAxisTitle = xAxisTitle;
	}

	public String getyAxisTitle() {
		return yAxisTitle;
	}

	public void setyAxisTitle(String yAxisTitle) {
		this.yAxisTitle = yAxisTitle;
	}
	
	
}