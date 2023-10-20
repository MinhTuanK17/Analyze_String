/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Library;
import common.Validation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 *
 * @author MINH TUAN
 */
public class StringAccess {

    Validation vl;
    Library l;

    public StringAccess() {
        vl = new Validation();
        l = new Library();
    }

    private static StringAccess instance = null;

    public static StringAccess Instance() {
        if (instance == null)
            synchronized (StringAccess.class) {
            if (instance == null) {
                instance = new StringAccess();
            }
        }
        return instance;
    }

    public HashMap<String, ArrayList<Integer>> getNumber(String input) {
        LinkedHashMap<String, ArrayList<Integer>> result = new LinkedHashMap<>();
        result.put("Perfect Square Numbers", new ArrayList<>());
        result.put("Odd Numbers", new ArrayList<>());
        result.put("Even Numbers", new ArrayList<>());
        result.put("All Numbers", new ArrayList<>());

        String[] numbers = input.replaceAll("\\D+", ",").split(",");

        for (String num : numbers) {
            if (!num.isEmpty()) {
                int number = Integer.parseInt(num);
                if (vl.checkSquareNumber(number)) {
                    result.get("Perfect Square Numbers").add(number);
                }
                if (vl.checkOdd(number)) {
                    result.get("Odd Numbers").add(number);
                }
                if (vl.checkEven(number)) {
                    result.get("Even Numbers").add(number);
                }
                result.get("All Numbers").add(number);
            }
        }

        return result;

    }

    public HashMap<String, StringBuilder> getCharacter(String input) {
        LinkedHashMap<String, StringBuilder> result = new LinkedHashMap<>();
        result.put("Uppercase Characters", new StringBuilder());
        result.put("Lowercase Characters", new StringBuilder());
        result.put("Special Characters", new StringBuilder());
        result.put("All Characters", new StringBuilder());

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.get("All Characters").append(c);
                result.get(Character.isUpperCase(c) ? "Uppercase Characters" : "Lowercase Characters").append(c);
            } else if (!Character.isDigit(c) && !Character.isWhitespace(c)) {
                result.get("Special Characters").append(c);
                result.get("All Characters").append(c);
            }
        }
        return result;

    }
}
