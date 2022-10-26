package graph.strategy;

public class BarChartGraph implements GraphStrategy {
	@Override
	public void createGraph(GraphProfile profile) {
		BarGraphConstructor frame = new BarGraphConstructor(profile);
		frame.pack();
		frame.setVisible(true);
	}

}

	


