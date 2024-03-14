import java.util.Scanner;

public class Mars {
    private static final float EARTH_AITANOV = 9.81f;
    private static final float MARS_AITANOV = 3.86f;

    public static void main(final String[] args) {
        Scanner scannerAitanov = new Scanner(System.in);
        System.out.println("Enter your weight on Earth:");
        float weightEarthAitanov = scannerAitanov.nextFloat();

        // Calculating weight on Mars
        double weightMarsAitanov = weightEarthAitanov * MARS_AITANOV / EARTH_AITANOV;
        System.out.format("Your weight on Mars would be equal to %.4f%n", weightMarsAitanov);

        // Converting weight to integer
        int weightMarsIntAitanov = (int) weightMarsAitanov;
        System.out.println("Converting the weight to int: " + weightMarsIntAitanov);

        // Converting integer to char (possible data loss warning)
        char weightMarsCharAitanov = (char) (weightMarsIntAitanov + '0');
        System.out.println("Converting the int to char, warning possible data loss because int can contain more than one digit: " + weightMarsCharAitanov);

        // Performing math operation on char and assigning to int
        int adjustedWeightAitanov = weightMarsCharAitanov - '0' + 5;
        System.out.println("Performing math operation on char and assigning to int: " + adjustedWeightAitanov);
    }
}
