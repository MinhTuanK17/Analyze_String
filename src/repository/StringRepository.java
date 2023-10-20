/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.StringAccess;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MINH TUAN
 */
public class StringRepository implements IStringRepository {
    
    @Override
    public HashMap<String, ArrayList<Integer>> getNumber(String input) {
        return StringAccess.Instance().getNumber(input);
    }
    
    @Override
    public HashMap<String, StringBuilder> getCharacter(String input) {
        return StringAccess.Instance().getCharacter(input);
    }
    
}
