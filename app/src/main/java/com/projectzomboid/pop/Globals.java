package com.projectzomboid.pop;

public final class Globals {
	
	private static Globals INSTANCE;
	
	public static Globals getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Globals();
		}
		return INSTANCE;
	}
	
	private float densityX;
	private float densityY;
	
	private Globals() {
		
	}
	
	public float getDensityX() {
		return densityX;
	}
	
	public void setDensityX(float densityX) {
		this.densityX = densityX;
	}
	
	public float getDensityY() {
		return densityY;
	}
	
	public void setDensityY(float densityY) {
		this.densityY = densityY;
	}
	
}
