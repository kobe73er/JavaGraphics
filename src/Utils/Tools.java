package Utils;

import java.awt.Color;
import java.util.Random;

public class Tools {
	public static Color GenerateRandomColor() {
		Random rd = new Random();
		int r = rd.nextInt(255);
		int g = rd.nextInt(255);
		int b = rd.nextInt(255);

		return new Color(r, g, b);
	}

}
