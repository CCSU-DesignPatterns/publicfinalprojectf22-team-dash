package graph.strategy;

public class LineChartGraph implements GraphStrategy {

	@Override
	public void createGraph(GraphProfile profile) {
		LineGraphConstructor lineGraph = new LineGraphConstructor(profile);
		lineGraph.pack();
		lineGraph.setVisible(true);

	}

}
