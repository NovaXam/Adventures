import processing.core.PFont;

import java.util.ArrayList;
import java.util.Scanner;

public class FrontScreen {

    public void buildUserScreen() {
        //UI user screen using processing
    };

    public String [] handleUserInput(String params) {

        String[] input = params.split("\n");
        return input;

    };

    //User input logic from https://processing.org/discourse/beta/num_1257609804.html
    //need to be additionally investigated
//    PFont font;
//    int num = 0;
//
//    void setup(){
//        size(500,500);
//        font = createFont("Arial",22);
//        textFont(font);
//    }
//
//    void draw(){
//        background(255);
//        println(num);
//        if(num==0){
//            fill(0);
//            text("Please press a number between 1-9",80,100);
//        }else{
//
//            fill(255,0,0);
//            for(int i = 0; i<num; i++)
//                rect(100+i*12,100,10,10);
//            fill(0);
//            text("This is Number "+num,100,180);
//
//        }
//    }
//
//    void keyPressed(){
//        int keyNum = Character.getNumericValue(key);
//        if(keyNum<=9 && keyNum>0)num = keyNum;
//    }
}
