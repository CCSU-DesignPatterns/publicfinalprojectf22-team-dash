package graph.strategy;
/**
* Strategy for drawing a Line Graph
* @author Steven Walker
*/
public class LineChartGraph implements GraphStrategy {

	@Override
	public void createGraph(GraphProfile profile) {
		LineGraphConstructor lineGraph = new LineGraphConstructor(profile);
		lineGraph.pack();
		lineGraph.setVisible(true);

	}

}
