package colorcoder.Implementation;

public class ManualPrinter {

    public void printManual() {
        int counter = 1;
        System.out.println(" ______________________________________");
        System.out.println("|          |             |             |");
        System.out.println("| Pair no. | Major color | Minor color |");
        System.out.println(" ______________________________________");
        for (MajorColor majorColor : MajorColor.values()) {
            for (MinorColor minorColor : MinorColor.values()) {
                System.out.println("|      " + counter + "   |   " + majorColor.name() + "     |   " + minorColor.name() + "      |");
                counter++;
            }

        }
        System.out.println(" ______________________________________\n");
    }
}
