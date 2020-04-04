package iransystem;

import java.util.HashMap;
import java.util.Map;

public class IranSystemCharTable {
    private Map<Integer, FarsiLetter> charTable = new HashMap<>();

    public IranSystemCharTable() {
        charTable.put(140, FarsiLetter.ALF_MAD);
        charTable.put(141, FarsiLetter.ALF_MAD);
        charTable.put(144, FarsiLetter.ALF);
        charTable.put(145, FarsiLetter.ALF);
        charTable.put(199, FarsiLetter.ALF); //
        charTable.put(146, FarsiLetter.BEE);
        charTable.put(147, FarsiLetter.BEE);
        charTable.put(200, FarsiLetter.BEE); //
        charTable.put(148, FarsiLetter.PEE);
        charTable.put(149, FarsiLetter.PEE);
        charTable.put(150, FarsiLetter.TEE);
        charTable.put(151, FarsiLetter.TEE);
        charTable.put(202, FarsiLetter.TEE); //
        charTable.put(152, FarsiLetter.THE);
        charTable.put(153, FarsiLetter.THE);
        charTable.put(203, FarsiLetter.THE); //
        charTable.put(154, FarsiLetter.JEE);
        charTable.put(155, FarsiLetter.JEE);
        charTable.put(204, FarsiLetter.JEE); //
        charTable.put(156, FarsiLetter.CHE);
        charTable.put(157, FarsiLetter.CHE);
        charTable.put(158, FarsiLetter.HHE);
        charTable.put(159, FarsiLetter.HHE);
        charTable.put(205, FarsiLetter.HHE); //
        charTable.put(160, FarsiLetter.KHE);
        charTable.put(161, FarsiLetter.KHE);
        charTable.put(206, FarsiLetter.KHE); //
        charTable.put(162, FarsiLetter.DAL);
        charTable.put(207, FarsiLetter.DAL); //
        charTable.put(163, FarsiLetter.ZAL);
        charTable.put(208, FarsiLetter.ZAL); //
        charTable.put(164, FarsiLetter.REE);
        charTable.put(209, FarsiLetter.REE); //
        charTable.put(165, FarsiLetter.ZEE);
        charTable.put(210, FarsiLetter.ZEE); //
        charTable.put(166, FarsiLetter.JHE);
        charTable.put(167, FarsiLetter.SIN);
        charTable.put(168, FarsiLetter.SIN);
        charTable.put(211, FarsiLetter.SIN); //
        charTable.put(169, FarsiLetter.SHN);
        charTable.put(170, FarsiLetter.SHN);
        charTable.put(212, FarsiLetter.SHN); //
        charTable.put(171, FarsiLetter.SAD);
        charTable.put(172, FarsiLetter.SAD);
        charTable.put(213, FarsiLetter.SAD); //
        charTable.put(173, FarsiLetter.ZAD);
        charTable.put(174, FarsiLetter.ZAD);
        charTable.put(214, FarsiLetter.ZAD); //
        charTable.put(175, FarsiLetter.TAA);
        charTable.put(176, FarsiLetter.TAA);
        charTable.put(216, FarsiLetter.TAA);
        charTable.put(224, FarsiLetter.ZAA);
        charTable.put(225, FarsiLetter.AIN);
        charTable.put(226, FarsiLetter.AIN);
        charTable.put(227, FarsiLetter.AIN);
        charTable.put(228, FarsiLetter.AIN);
        charTable.put(229, FarsiLetter.GHN);
        charTable.put(230, FarsiLetter.GHN);
        charTable.put(231, FarsiLetter.GHN);
        charTable.put(232, FarsiLetter.GHN);
        charTable.put(233, FarsiLetter.FEE);
        charTable.put(234, FarsiLetter.FEE);
        charTable.put(235, FarsiLetter.GHE);
        charTable.put(236, FarsiLetter.GHE);
        charTable.put(237, FarsiLetter.KAF);
        charTable.put(238, FarsiLetter.KAF);
        charTable.put(239, FarsiLetter.GAF);
        charTable.put(240, FarsiLetter.GAF);
        charTable.put(241, FarsiLetter.LAM);
        charTable.put(243, FarsiLetter.LAM);
        charTable.put(244, FarsiLetter.MIM);
        charTable.put(245, FarsiLetter.MIM);
        charTable.put(246, FarsiLetter.NON);
        charTable.put(247, FarsiLetter.NON);
        charTable.put(248, FarsiLetter.WAW);
        charTable.put(249, FarsiLetter.HEE);
        charTable.put(250, FarsiLetter.HEE);
        charTable.put(251, FarsiLetter.HEE);
        charTable.put(252, FarsiLetter.YEE);
        charTable.put(253, FarsiLetter.YEE);
        charTable.put(254, FarsiLetter.YEE);

        charTable.put(242, FarsiLetter.LAM_ALF);
    }

    public boolean isEmpty(char aChar) {
        return aChar == 0x20 || aChar == 0x0A || aChar == 0x0D;
    }

    public FarsiLetter get(Integer code) {
        return charTable.get(code);
    }
}