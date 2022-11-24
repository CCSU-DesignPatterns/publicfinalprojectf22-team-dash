package profile.decorator;

import graph.strategy.GraphProfile;

public abstract class ProfileDecorator extends GraphProfile {
	protected final GraphProfile decoratedProfile;
	
	public ProfileDecorator(GraphProfile decoratedProfile) {
	    this.decoratedProfile = decoratedProfile;
	  }

	@Override
	public String getTitle() {
		return decoratedProfile.getTitle();
	}

	@Override
	public String[] getRowTitles() {
		return decoratedProfile.getRowTitles();
	}

	@Override
	public String[] getColumnTitles() {
		return decoratedProfile.getColumnTitles();
	}

	@Override
	public String[] getCategoryTitles() {
		return decoratedProfile.getCategoryTitles();
	}

	@Override
	public int[] getOneDimData() {
		return decoratedProfile.getOneDimData();
	}

	@Override
	public int[][] getTwoDimData() {
		return decoratedProfile.getTwoDimData();
	}

	@Override
	public int[][][] getThreeDimData() {
		return decoratedProfile.getThreeDimData();
	}

	@Override
	public String getxAxisTitle() {
		return decoratedProfile.getxAxisTitle();
	}

	@Override
	public String getyAxisTitle() {
		return decoratedProfile.getyAxisTitle();
	}
	
}