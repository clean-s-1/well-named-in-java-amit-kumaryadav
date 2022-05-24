package colorcoder.Implementation;

public enum MinorColor implements Index<Integer> {
    BLUE(0), ORANGE(1), GREEN(2), BROWN(3), SLATE(4);
    private int index;

    MinorColor(int index) {
        this.index = index;
    }

    public Integer getIndex() {
        return index;
    }
}
