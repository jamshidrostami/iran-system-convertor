package iransystem;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IranSystem {
    public static void main(String[] args) {
        String hex = "81828384202096A8970A2320F5FEF791F59320F9F791A120A4A2";
        String str = Arrays
                .stream(hex.split("(?<=\\G..)"))
                .map(s -> Character.toString((char) Integer.parseInt(s, 16)))
                .collect(Collectors.joining());

        IranSystemConvertor c = new IranSystemConvertor();
        System.out.println(c.convert(str));
    }
}