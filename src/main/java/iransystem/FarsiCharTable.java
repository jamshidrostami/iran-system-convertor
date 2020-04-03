package iransystem;

import java.util.HashMap;
import java.util.Map;

public class FarsiCharTable {
    private Map<FarsiLetter, FarsiCharacter> charTable = new HashMap<>();
    private Character[] numberTable = {'\u06F0', '\u06F1', '\u06F2', '\u06F3', '\u06F4', '\u06F5', '\u06F6', '\u06F7', '\u06F8', '\u06F9'};

    public FarsiCharTable() {
        charTable.put(FarsiLetter.ALF_MAD, new FarsiCharacter(FarsiLetter.ALF_MAD, '\u0622', null, null, null));
        charTable.put(FarsiLetter.ALF, new FarsiCharacter(FarsiLetter.ALF, '\u0627', '\u0627', '\ufe8e', '\ufe8e'));
        charTable.put(FarsiLetter.BEE, new FarsiCharacter(FarsiLetter.BEE, '\u0628', '\ufe91', '\ufe92', '\ufe90'));
        charTable.put(FarsiLetter.PEE, new FarsiCharacter(FarsiLetter.PEE, '\u0622', '\ufb58', '\ufb59', '\ufb57'));
        charTable.put(FarsiLetter.TEE, new FarsiCharacter(FarsiLetter.TEE, '\u062A', '\ufe97', '\ufe98', '\ufe96'));
        charTable.put(FarsiLetter.THE, new FarsiCharacter(FarsiLetter.THE, '\u062B', '\ufe9b', '\ufe9c', '\ufe9a'));
        charTable.put(FarsiLetter.JEE, new FarsiCharacter(FarsiLetter.JEE, '\u062C', '\ufe9f', '\ufea0', '\ufe9e'));
        charTable.put(FarsiLetter.CHE, new FarsiCharacter(FarsiLetter.CHE, '\u0686', '\ufb7c', '\ufb7d', '\ufb7b'));
        charTable.put(FarsiLetter.HHE, new FarsiCharacter(FarsiLetter.HHE, '\u062D', '\ufea3', '\ufea4', '\ufea2'));
        charTable.put(FarsiLetter.KHE, new FarsiCharacter(FarsiLetter.KHE, '\u062E', '\ufea7', '\ufea8', '\ufea6'));
        charTable.put(FarsiLetter.DAL, new FarsiCharacter(FarsiLetter.DAL, '\u062F', '\u062F', '\ufeaa', '\ufeaa'));
        charTable.put(FarsiLetter.ZAL, new FarsiCharacter(FarsiLetter.ZAL, '\u0630', '\u0630', '\ufeac', '\ufeac'));
        charTable.put(FarsiLetter.REE, new FarsiCharacter(FarsiLetter.REE, '\u0631', '\u0631', '\ufeae', '\ufeae'));
        charTable.put(FarsiLetter.ZEE, new FarsiCharacter(FarsiLetter.ZEE, '\u0632', '\u0632', '\ufeb0', '\ufeb0'));
        charTable.put(FarsiLetter.JHE, new FarsiCharacter(FarsiLetter.JHE, '\u0698', '\u0698', '\ufb8b', '\ufb8b'));
        charTable.put(FarsiLetter.SIN, new FarsiCharacter(FarsiLetter.SIN, '\u0633', '\ufeb3', '\ufeb4', '\ufeb2'));
        charTable.put(FarsiLetter.SHN, new FarsiCharacter(FarsiLetter.SHN, '\u0634', '\ufeb7', '\ufeb8', '\ufeb6'));
        charTable.put(FarsiLetter.SAD, new FarsiCharacter(FarsiLetter.SAD, '\u0635', '\ufebb', '\ufebc', '\ufeba'));
        charTable.put(FarsiLetter.ZAD, new FarsiCharacter(FarsiLetter.ZAD, '\u0636', '\ufebf', '\ufec0', '\ufebe'));
        charTable.put(FarsiLetter.TAA, new FarsiCharacter(FarsiLetter.TAA, '\u0637', '\ufec3', '\ufec4', '\ufec2'));
        charTable.put(FarsiLetter.ZAA, new FarsiCharacter(FarsiLetter.ZAA, '\u0638', '\ufec7', '\ufec8', '\ufec6'));
        charTable.put(FarsiLetter.AIN, new FarsiCharacter(FarsiLetter.AIN, '\u0639', '\ufecb', '\ufecc', '\ufeca'));
        charTable.put(FarsiLetter.GHN, new FarsiCharacter(FarsiLetter.GHN, '\u063A', '\ufecf', '\ufed0', '\ufece'));
        charTable.put(FarsiLetter.FEE, new FarsiCharacter(FarsiLetter.FEE, '\u0641', '\ufed3', '\ufed4', '\ufed2'));
        charTable.put(FarsiLetter.GHE, new FarsiCharacter(FarsiLetter.GHE, '\u0642', '\ufed7', '\ufed8', '\ufed6'));
        charTable.put(FarsiLetter.KAF, new FarsiCharacter(FarsiLetter.KAF, '\u0643', '\ufedb', '\ufedc', '\ufeda'));
        charTable.put(FarsiLetter.GAF, new FarsiCharacter(FarsiLetter.GAF, '\u06AF', '\ufb94', '\ufb95', '\ufb93'));
        charTable.put(FarsiLetter.LAM, new FarsiCharacter(FarsiLetter.LAM, '\u0644', '\ufedf', '\ufee0', '\ufede'));
        charTable.put(FarsiLetter.MIM, new FarsiCharacter(FarsiLetter.MIM, '\u0645', '\ufee3', '\ufee4', '\ufee2'));
        charTable.put(FarsiLetter.NON, new FarsiCharacter(FarsiLetter.NON, '\u0646', '\ufee7', '\ufee8', '\ufee6'));
        charTable.put(FarsiLetter.WAW, new FarsiCharacter(FarsiLetter.WAW, '\u0648', '\u0648', '\ufeee', '\ufeee'));
        charTable.put(FarsiLetter.HEE, new FarsiCharacter(FarsiLetter.HEE, '\u0647', '\ufeeb', '\ufeec', '\ufeea'));
        charTable.put(FarsiLetter.YEE, new FarsiCharacter(FarsiLetter.YEE, '\u06cc', '\ufef3', '\ufef4', '\ufef2'));
    }

    public FarsiCharacter get(FarsiLetter letter) {
        return charTable.get(letter);
    }

    public Character get(int code) {
        return numberTable[code - 0x80];
    }
}