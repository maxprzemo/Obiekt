package com.przemek.maxprzemo.obiekt;

import android.content.Intent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 * Created by maxprzemo on 06.07.15.
 */
public class MemInfo {

    public String pobierz(){
    Process process = null;
    try {
        process = Runtime.getRuntime().exec("cat /proc/meminfo");
    } catch (IOException e) {
        e.printStackTrace();
    }
    assert process != null;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    StringBuffer stringBuffer = new StringBuffer();
    String line;
    try {
        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line).append("\n");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    try {
        bufferedReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    String answer;
    answer = stringBuffer.toString();
        return answer;


}
}
