package com.example.ukesoppgaverspringbasic;



import java.util.Arrays;

public class Temp {
    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};
    private String måneden;
    int månedteller=0;

    public void måneder (int månedteller, String måneden){
        switch (månedteller){
        case 0:
            måneden="Januar";
            break;
        case 1:
            måneden="Februar";
            break;
        case 2:
            måneden="Mars";
            break;
        case 3:
            måneden="April";
            break;
        case 4:
            måneden="mai";
            break;
        case 5:
            måneden="juni";
            break;
        case 6:
            måneden="juli";
            break;
        case 7:
            måneden="august";
            break;
        case 8:
            måneden="september";
            break;
        case 9:
            måneden="oktober";
            break;
        case 10:
            måneden="november";
            break;
        case 11:
            måneden="desember";
            break;
    }
    String ut="snitten var " + tempArray[månedteller] + "grader celcius i " + måneden;
    }

    public void setMåneden(String måneden) {
        this.måneden = måneden;
    }

    public String getMåneden() {
        return måneden;
    }


    public Integer[] getTempArray() {
        return tempArray;
    }

    public void finnsnitt(Integer[] tempArray){

    }

}
