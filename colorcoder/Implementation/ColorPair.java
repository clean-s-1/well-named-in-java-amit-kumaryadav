package colorcoder.Implementation;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;

    public ColorPair(MajorColor major, MinorColor minor) {
        majorColor = major;
        minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    String ToString() {
        return MajorColor.values()[majorColor.getIndex()] + " " + MinorColor.values()[minorColor.getIndex()];
    }
}
