package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class AI {
	
	public static BufferedImage[] images = new BufferedImage[200];
	public static float[] coefs;
	
	public static void init() {
		
		String[] s = new String[100];
		
		for (int i = 0; i < images.length; i++)
			try {
				images[i] = ImageIO.read(new File(s[i]));
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void process() {
		
	}
	
	public static void learn(BufferedImage image) {
		
	}
	
}
