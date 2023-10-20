/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MINH TUAN
 */
public interface IStringRepository {

    HashMap<String, ArrayList<Integer>> getNumber(String input);

    HashMap<String, StringBuilder> getCharacter(String input);
}
