package sk.majba.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import sk.majba.MeceASandale;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Mece a Sandale";
		config.width = 800;
		config.vSyncEnabled = true;
		config.height = 480;
		new LwjglApplication(new MeceASandale(), config);
	}
}
