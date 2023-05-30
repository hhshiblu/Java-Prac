import java.awt.Color;

public class ColorCheck {
    public static void main(String[] args) {
        int red = 193;
        int green = 255;
        int blue = 183;

        // Create a Color object with the specified RGB values
        Color color = new Color(red, green, blue);

        // Convert RGB to HSB
        float[] hsbValues = Color.RGBtoHSB(red, green, blue, null);

        // Extract HSB values
        float hue = hsbValues[0];
        float saturation = hsbValues[1];
        float brightness = hsbValues[2];

        System.out.println("Hue: " + hue);
        System.out.println("Saturation: " + saturation);
        System.out.println("Brightness: " + brightness);
    }
}
