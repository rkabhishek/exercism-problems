class TwelveDays {
    private final String VERSE_SEPARATOR = "\n\n";

    private final String lyrics = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.";

    private String[] verseList;

    public TwelveDays(){
        verseList = lyrics.split(VERSE_SEPARATOR);
    }

    public String verse(int verseNumber) {
        return verseList[verseNumber - 1]  + "\n";
    }

    public String verses(int startVerse, int endVerse) {
        String result = "";
        for (int i = startVerse; i < endVerse; i++) {
            result += verseList[i - 1] + VERSE_SEPARATOR;
        }

        result += verseList[endVerse - 1] + "\n";
        return result;
    }
    
    public String sing() {
        return verses(1, verseList.length);
    }
}
