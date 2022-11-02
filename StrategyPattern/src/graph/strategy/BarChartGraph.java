package graph.strategy;

/**
 * The strategy used for creating a Bar Graph
 * @see GraphStrategy
 * @author Steven Walker
 *
 */
public class BarChartGraph implements GraphStrategy {
	@Override
	public void createGraph(GraphProfile profile) {
		BarGraphConstructor frame = new BarGraphConstructor(profile);
		frame.pack();
		frame.setVisible(true);
	}

}

	


