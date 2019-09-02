/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicTest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class arrayValue {
    public static void main(String[] args) {
        ArrayList<String> kita = new ArrayList<>(Arrays.asList("kita", "semua", "bisa", "berjuang"));
         
        ArrayList<String> bisa = new ArrayList<>(Arrays.asList("kita", "bisa", "menolong", "sesama", "manusia"));
         
        kita.retainAll(bisa);
         
        System.out.println(kita);
    }
}
