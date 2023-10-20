
import common.Library;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import repository.StringRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MINH TUAN
 */
public class Main {

    static Library l = new Library();

    public static void main(String[] args) {

        System.out.println("======== Analysis String program =======");
        StringRepository sr = new StringRepository();
        String input = l.getString("Input String: ");
        HashMap<String, ArrayList<Integer>> hNumber = sr.getNumber(input);
        HashMap<String, StringBuilder> hCharac = sr.getCharacter(input);

        System.out.println("------- Result Analysis --------");

        Set<String> setNum = hNumber.keySet();
        for (String key : setNum) {
            System.out.println(key + ": " + hNumber.get(key));
        }

        Set<String> setCharac = hCharac.keySet();
        for (String key : setCharac) {
            System.out.println(key + ": " + hCharac.get(key));
        }
    }
}
