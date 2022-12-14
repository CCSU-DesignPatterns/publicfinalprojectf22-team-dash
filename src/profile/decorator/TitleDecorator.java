package profile.decorator;

import graph.strategy.GraphProfile;

public class TitleDecorator extends ProfileDecorator{
	protected String title;

	public TitleDecorator(String newTitle, GraphProfile graphProfile) {
		super(graphProfile);
		this.title = newTitle;
	}

	@Override
	public String getTitle() {
		return title;
	}

}
