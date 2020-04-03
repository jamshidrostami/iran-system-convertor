package iransystem;

public class IranSystemConvertor {

    private FarsiCharTable farsiTable;
    private IranSystemCharTable iranSystemTable;

    public IranSystemConvertor() {
        farsiTable = new FarsiCharTable();
        iranSystemTable = new IranSystemCharTable();
    }

    public String convert(String input) {
        char[] chars = new StringBuilder()
                .append(input)
                .reverse()
                .toString()
                .toCharArray();
        StringBuilder out = new StringBuilder();
        FarsiCharacter pre = null;
        FarsiCharacter current;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0x20) {
                out.append(' ');
            } else if (chars[i] == 0x0A) {
                out.append('\n');
            } else if (chars[i] == 0x0D) {
                out.append('\r');
            } else if (chars[i] >= 0x30 && chars[i] <= 0x39) { /* english numbers */
                out.append(chars[i]);
            } else if (chars[i] >= 0x80 && chars[i] <= 0x89) { /* farsi numbers */
                out.append(farsiTable.get(chars[i]));
            } else if ((chars[i] >= 0x21 && chars[i] <= 0x2f) || (chars[i] >= 0x3A && chars[i] <= 0x40)
                    || (chars[i] >= 0x5B && chars[i] <= 0x60) || (chars[i] >= 0x7B && chars[i] <= 0x7E)) { /* special characters */
                out.append(chars[i]);
            } else if ((chars[i] >= 0x41 && chars[i] <= 0x5A) || (chars[i] >= 0x61 && chars[i] <= 0x7A)) { /* english characters */
                out.append(chars[i]);
            } else {
                FarsiLetter letter = iranSystemTable.get((int) chars[i]);
                if (letter != null) {
                    current = farsiTable.get(letter);
                    out.append(current.selectChar(i == 0 || iranSystemTable.isEmpty(chars[i - 1])
                            , i == chars.length - 1 || iranSystemTable.isEmpty(chars[i + 1])
                            , pre));
                    pre = current;
                }
            }
        }
        return out.toString();
    }
}