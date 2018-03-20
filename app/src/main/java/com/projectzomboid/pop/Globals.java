package com.projectzomboid.pop;
import java.io.File;
import java.io.IOException;

public final class Globals {
	
	public static final float DEFAULT_DENSITY = 160;
	
	public static final int DEFAULT_WIDTH = 640;
	public static final int DEFAULT_HEIGHT = 480;
	
	public static final String DEFAULT_HOME_DIRECTORY;
	
	private static Globals INSTANCE;
	
	static {
		File homeDirectory = new File(new File(System.getProperty("user.home")), "pz-pop");
		if(!homeDirectory.exists()) {
			try {
				homeDirectory.mkdirs();
			} catch(Exception ex) {
				
			}
		}
		DEFAULT_HOME_DIRECTORY = homeDirectory.getAbsolutePath();
		
	}
	
	public static Globals getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Globals();
		}
		return INSTANCE;
	}
	
	public static String getFileSeparator() {
		return System.getProperty("file.separator");
	}
	
	private float densityX;
	private float densityY;
	
	private int displayWidth;
	private int displayHeight;
	
	private String homeDirectory;
	
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
	
	public int getDisplayWidth() {
		return displayWidth;
	}
	
	public void setDisplayWidth(int displayWidth) {
		this.displayWidth = displayWidth;
	}

	public int getDisplayHeight() {
		return displayHeight;
	}

	public void setDisplayHeight(int displayHeight) {
		this.displayHeight = displayHeight;
	}
	
	public String getHomeDirectory() {
		return homeDirectory;
	}
	
	public void setHomeDirectory(String homeDirectory) {
		File directory = new File(homeDirectory);
		if(directory.exists() && directory.canRead() && directory.canWrite()) {
			this.homeDirectory = homeDirectory;
		}
	}
	
	private static void createHomeDirectory(final String homeDirectory) {
		
	}
	
	private static File makeDirectory(String path) {
		return makeDirectory(null, path);
	}
	
	private static File makeDirectory(File parent, String path) {
		String fileSeparator = getFileSeparator();
		if(!path.endsWith(fileSeparator)) {
			path = path + fileSeparator;
		}
		File file = parent == null ? new File(path) : new File(parent, path);
		if(!file.exists()) {
			file.mkdirs();
		}
		return file;
	}
	
}
