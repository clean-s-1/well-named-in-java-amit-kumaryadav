package colorcoder;

import colorcoder.Implementation.MajorColor;
import colorcoder.Implementation.ManualPrinter;
import colorcoder.Implementation.MinorColor;
import colorcoder.Implementation.Tests;

public class Main {

    public static void main(String[] args) {
        ManualPrinter manualPrinter = new ManualPrinter();
        manualPrinter.printManual();

        Tests tests = new Tests();

        tests.numberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        tests.numberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

        tests.pairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        tests.pairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
