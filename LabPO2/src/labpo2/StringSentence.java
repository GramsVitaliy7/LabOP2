/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo2;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author VITGR
 */
public class StringSentence {

    String value;

    StringSentence(String value) {
        this.value = value;
    }

    public String convertToEncryptedString() {
        char[] charArray = value.toCharArray();
        String encryptedString = "";

        for (int i = 0; i < value.length(); i++) {
            if ((charArray[i] >= 'a' && charArray[i] <= 'z')
                    || (charArray[i] >= 'A' && charArray[i] <= 'Z')
                    || (charArray[i] >= 'a' && charArray[i] <= 'я')
                    || (charArray[i] >= 'А' && charArray[i] <= 'Я')) {
                if (charArray[i] == 'z' || charArray[i] == 'Z') {
                    encryptedString += (char) (charArray[i] - 26);
                } else if (charArray[i] == 'я' || charArray[i] == 'Я') {
                    encryptedString += (char) (charArray[i] - 33);
                } else {
                    encryptedString += (char) (charArray[i] + 1);
                }
            }
        }
        return encryptedString;
    }
}
