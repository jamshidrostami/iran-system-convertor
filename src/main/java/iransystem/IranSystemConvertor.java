package iransystem;

public class IranSystemConvertor {

    private FarsiCharTable farsiTable;
    private IranSystemCharTable iranSystemTable;

    public IranSystemConvertor() {
        farsiTable = new FarsiCharTable();
        iranSystemTable = new IranSystemCharTable();
    }

    public String convert(String input) {
        StringBuilder chunk = new StringBuilder();
        Direction direction = Direction.RTL;

        char[] chars = new StringBuilder()
                .append(input)
                .reverse()
                .toString()
                .toCharArray();
        StringBuilder out = new StringBuilder();
        FarsiCharacter pre = null;
        FarsiCharacter current;
        SimpleIranSystem ch;
        for (int i = 0; i < chars.length; i++) {
            ch = new SimpleIranSystem(direction, chars[i]);
            switch (ch.getType()) {
                case NewLine:
                    reset(out, chunk, ch.getCh());
                    direction = ch.getDirection();
                    break;
                case Normal:
                    this.add(out, chunk, ch.getCh(), direction, ch.getDirection());
                    direction = ch.getDirection();
                    break;
                case FarsiNumber:
                    this.add(out, chunk, farsiTable.get(ch.getCh()), direction, Direction.LTR);
                    direction = ch.getDirection();
                    break;
                case FarsiLetter:
                    FarsiLetter letter = iranSystemTable.get((int) chars[i]);
                    if (letter != null) {
                        current = farsiTable.get(letter);
                        SimpleIranSystem prev = null;
                        if (i > 0) {
                            prev = new SimpleIranSystem(direction, chars[i - 1]);
                        }
                        SimpleIranSystem next = null;
                        if (i == chars.length - 1) {
                            next = new SimpleIranSystem(direction, chars[i + 1]);
                        }
                        this.add(out, chunk
                                , current.selectChar(prev == null || iranSystemTable.isEmpty(prev.getCh()) || direction == Direction.LTR || prev.getDirection() == Direction.LTR
                                        , next == null || iranSystemTable.isEmpty(next.getCh()) || direction == Direction.LTR || next.getDirection() == Direction.LTR
                                        , pre)
                                , direction, Direction.RTL);
                        pre = current;
                    } else {
                        System.out.println((int) chars[i]);
                    }
                    direction = ch.getDirection();
                    break;
            }
        }
        if (chunk.length() > 0) {
            out.append(chunk.toString());
        }
        return out.toString();
    }

    private void add(StringBuilder out, StringBuilder chunk, char ch, Direction pre, Direction current) {
        if (current == pre) {
            this.add(chunk, ch, current);
        } else {
            out.append(chunk.toString());
            chunk.setLength(0);
            this.add(chunk, ch, current);
        }
    }

    private void add(StringBuilder chunk, char ch, Direction direction) {
        if (direction == Direction.RTL) {
            chunk.append(ch);
        } else {
            chunk.insert(0, ch);
        }
    }

    private void reset(StringBuilder out, StringBuilder chunk, char ch) {
        chunk.append(ch);
        out.append(chunk.toString());
        chunk.setLength(0);
    }
}