package org.johncollin.catacombcrawlers.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.johncollin.catacombcrawlers.CatacombCrawlers;

import java.awt.*;

public class DesktopLauncher {
	
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		//When Gdx.app.exit(); is called, make sure the program doesn't force close. It closes correctly.
		config.forceExit = false;
		
		//Standard Screen Dimensions Variables Setup.
		config.fullscreen = true;
		config.width = Toolkit.getDefaultToolkit().getScreenSize().width;
		config.height = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		//Start the Game.
		new LwjglApplication(new CatacombCrawlers(), config);
	}
	
}
