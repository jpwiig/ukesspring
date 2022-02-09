package com.example.ukesoppgaverspringbasic;


public class Temp {
    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};
    private String maaneden;
    int maanedteller=0;

    public String maaneder (int månedteller){
        switch (månedteller){
        case 0:
            maaneden="Januar";
            break;
        case 1:
            maaneden="Februar";
            break;
        case 2:
            maaneden="Mars";
            break;
        case 3:
            maaneden="April";
            break;
        case 4:
            maaneden="mai";
            break;
        case 5:
            maaneden="juni";
            break;
        case 6:
            maaneden="juli";
            break;
        case 7:
            maaneden="august";
            break;
        case 8:
            maaneden="september";
            break;
        case 9:
            maaneden="oktober";
            break;
        case 10:
            maaneden="november";
            break;
        case 11:
            maaneden="desember";
            break;
    }
    String ut="snitten var " + tempArray[månedteller] + "grader celcius i " + maaneden;
        return ut;
    }

    public void setMåneden(String måneden) {
        this.maaneden = måneden;
    }

    public String getMåneden() {
        return maaneden;
    }


    public Integer[] getTempArray() {
        return tempArray;
    }

    public void finnsnitt(Integer[] tempArray){

    }

}
