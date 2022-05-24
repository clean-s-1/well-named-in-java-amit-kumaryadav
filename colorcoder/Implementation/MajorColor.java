package colorcoder.Implementation;

public enum MajorColor implements Index<Integer> {
    WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);
    private int index;

    MajorColor(int index) {
        this.index = index;
    }

    public Integer getIndex() {
        return index;
    }
}
