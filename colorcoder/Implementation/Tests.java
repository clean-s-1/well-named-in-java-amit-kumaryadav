package colorcoder.Implementation;

public class Tests {

    public void numberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {

        ColorPair colorPair = new Processor().getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert (colorPair.getMajor() == expectedMajor);
        assert (colorPair.getMinor() == expectedMinor);
    }

    public void pairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
        int pairNumber = new Processor().getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert (pairNumber == expectedPairNumber);
    }
}
