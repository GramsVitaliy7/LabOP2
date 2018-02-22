/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author VITGR
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String encoding = System.getProperty("console.encoding", "Cp1251");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, encoding));
        StringSentence sentence = new StringSentence(br.readLine());
        String newString = sentence.convertToEncryptedString();
        System.out.println(newString);
    }

}
