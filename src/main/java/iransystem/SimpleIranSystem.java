package iransystem;

public class SimpleIranSystem {
    private Direction direction;
    private char ch;
    private LetterType type;

    public SimpleIranSystem(Direction direction, char ch) {
        if (ch == 0x20) {
            this.direction = direction;
            this.ch = ' ';
            this.type = LetterType.Normal;
        } else if (ch == 0x0A) {
            this.direction = Direction.RTL;
            this.ch = '\n';
            this.type = LetterType.NewLine;
        } else if (ch == 0x0D) {
            this.direction = Direction.RTL;
            this.ch = '\r';
            this.type = LetterType.NewLine;
        } else if (ch >= 0x30 && ch <= 0x39) { /* english numbers */
            this.direction = Direction.LTR;
            this.ch = ch;
            this.type = LetterType.Normal;
        } else if (ch >= 0x80 && ch <= 0x89) { /* farsi numbers */
            this.direction = Direction.LTR;
            this.ch = ch;
            this.type = LetterType.FarsiNumber;
        } else if ((ch >= 0x21 && ch <= 0x2f) || (ch >= 0x3A && ch <= 0x40)
                || (ch >= 0x5B && ch <= 0x60) || (ch >= 0x7B && ch <= 0x7E)) { /* special characters */
            this.direction = Direction.LTR;
            this.ch = ch;
            this.type = LetterType.Normal;
        } else if ((ch >= 0x41 && ch <= 0x5A) || (ch >= 0x61 && ch <= 0x7A)) { /* english characters */
            this.direction = Direction.LTR;
            this.ch = ch;
            this.type = LetterType.Normal;
        } else {
            this.direction = Direction.RTL;
            this.ch = ch;
            this.type = LetterType.FarsiLetter;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public char getCh() {
        return ch;
    }

    public LetterType getType() {
        return type;
    }
}