package iransystem;

public class FarsiCharacter {
    private FarsiLetter letter;
    private FarsiLetterMode mode;
    private char individual;
    private char start;
    private char middle;
    private char end;

    public FarsiCharacter(FarsiLetter letter, char individual, Character start, Character middle, Character end) {
        this.letter = letter;
        this.individual = individual;
        this.start = start == null ? individual : start;
        this.middle = middle == null ? individual : middle;
        this.end = end == null ? individual : end;
    }

    public char selectChar(boolean beforeSpace, boolean afterSpace, FarsiCharacter pre) {
        mode = (beforeSpace || this.isSeparate(pre)) ? afterSpace ? FarsiLetterMode.Individual : (individual == start ? FarsiLetterMode.Individual : FarsiLetterMode.Start) : afterSpace ? FarsiLetterMode.End : (middle == end) ? FarsiLetterMode.End : FarsiLetterMode.Middle;
        switch (mode) {
            case Individual:
                return individual;
            case Start:
                return start;
            case Middle:
                return middle;
            case End:
                return end;
            default:
                throw new IllegalArgumentException("wrong mode");
        }
    }

    public boolean isSeparate(FarsiCharacter pre) {
        return pre == null || pre.mode == FarsiLetterMode.Individual || pre.mode == FarsiLetterMode.End;
    }
}