package graph.strategy;

public class GraphContext {
	private GraphStrategy strategy;
	
	public GraphContext(GraphStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void executeStrategy(GraphProfile profile){
		strategy.createGraph(profile);
	}
}
