package com.moby.videopackage;

/**
 * info class about plane descriptions
 */
public class Plane {

	private int iconID;
	private String condition;

	public Plane(int iconID, String condition) {
		super();
		this.iconID = iconID;
		this.condition = condition;
	}

	public int getIconID() {
		return iconID;
	}

	public String getCondition() {
		return condition;
	}
}
