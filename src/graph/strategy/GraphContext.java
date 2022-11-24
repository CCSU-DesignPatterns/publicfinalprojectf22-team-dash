package graph.strategy;

import javafx.scene.chart.*;

/**
 * Context class used for implementation of Strategy Pattern
 * @param name The name of the account. Checking and Savings indicated here for BankAccount class.
 * @author Steven Walker
 *
 */
public class GraphContext {
	private GraphStrategy strategy;
	
	public GraphContext(GraphStrategy strategy) {
		this.strategy = strategy;
	}
	
	public Chart executeStrategy(GraphProfile profile){
		return(strategy.createGraph(profile));
	}
}
