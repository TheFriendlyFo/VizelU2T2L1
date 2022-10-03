public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        System.out.printf("Plot one - Length: %s, Width: %s", plot1.getLength(), plot1.getWidth());
        System.out.printf("Plot two - Length: %s, Width: %s", plot2.getLength(), plot2.getWidth());
        System.out.printf("Plot three - Length: %s, Width: %s", plot3.getLength(), plot3.getWidth());

        plot1.setWidth(75);
        plot2.setWidth(75);
        plot2.setLength(75);
        plot3.setWidth(75);

        System.out.printf("Plot one - Length: %s, Width: %s", plot1.getLength(), plot1.getWidth());
        System.out.printf("Plot two - Length: %s, Width: %s", plot2.getLength(), plot2.getWidth());
        System.out.printf("Plot three - Length: %s, Width: %s", plot3.getLength(), plot3.getWidth());
    }
}
