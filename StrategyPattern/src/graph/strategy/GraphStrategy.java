package graph.strategy;

import javafx.scene.chart.Chart;

/**
* Interface to implement strategies for plotting graphs
* @author Steven Walker
*/
public interface GraphStrategy {
	abstract Chart createGraph(GraphProfile profile);
}
