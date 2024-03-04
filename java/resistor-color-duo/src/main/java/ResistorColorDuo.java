class ResistorColorDuo {

    private static final String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet"
            , "grey", "white"};

    private int colorCode(String color) {
        for (int i = 0; i < colors.length; i++) {
            if(colors[i] == color) {
                return i;
            }
        }
        return -1;
    }

    public int value(String[] bands) {
        return colorCode(bands[0]) * 10 + colorCode(bands[1]);
    }
}
