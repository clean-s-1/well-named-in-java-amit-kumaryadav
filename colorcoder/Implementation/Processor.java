package colorcoder.Implementation;

import java.util.InputMismatchException;
import java.util.Optional;

public class Processor {

    final static int NUMBER_OF_MAJOR_COLORS = MajorColor.values().length;
    final static int NUMBER_OF_MINOR_COLORS = MinorColor.values().length;
    public static final String INPUT_CHECK_CONST = "color not found, Please check the input!!";

    public ColorPair getColorFromPairNumber(int pairNumber) {

        int zeroBasedPairNumber = pairNumber - 1;
        Optional<MajorColor> majorColor = IndexUtil.get(MajorColor.class, zeroBasedPairNumber / NUMBER_OF_MAJOR_COLORS);
        if (!majorColor.isPresent()) throw new InputMismatchException("Major " + INPUT_CHECK_CONST);
        Optional<MinorColor> minorColor = IndexUtil.get(MinorColor.class, zeroBasedPairNumber % NUMBER_OF_MINOR_COLORS);
        
        if (!minorColor.isPresent()) throw new InputMismatchException("Minor " + INPUT_CHECK_CONST);
        return new ColorPair(majorColor.get(), minorColor.get());
    }

    public int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
    }
}
