package com.projectzomboid.pop;

import com.jme3.app.SimpleApplication;
import de.lessvoid.nifty.Nifty;
import com.jme3.niftygui.NiftyJmeDisplay;
import com.jme3.asset.AssetLocator;

public class PZPop extends SimpleApplication {
	
	private Nifty nifty;
	
	@Override
	public void simpleInitApp() {
		flyCam.setEnabled(false);
		
		initNifty();
	}
	
	private void initNifty() {
		int niftyWidth = Globals.getInstance().getDisplayWidth();
		int niftyHeight = Globals.getInstance().getDisplayHeight();
		
		float niftyWidthScale = Globals.DEFAULT_DENSITY / Globals.getInstance().getDensityX();
		float niftyHeightScale = Globals.DEFAULT_DENSITY / Globals.getInstance().getDensityY();
		
		NiftyJmeDisplay niftyJmeDisplay = new NiftyJmeDisplay(assetManager, inputManager, audioRenderer, guiViewPort);
		nifty = niftyJmeDisplay.getNifty();
		nifty.enableAutoScaling(((int)(niftyWidth * niftyWidthScale)), ((int)(niftyHeight * niftyHeightScale)));
		nifty.fromXml("Interface/TitleScreens.xml", "menu");
		guiViewPort.addProcessor(niftyJmeDisplay);
	}
	
}
