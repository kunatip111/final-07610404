package com.example.speedrecords;

public class cal {
    String disS;
    String timS;
    Double result;
    Boolean isMore=false;
    public cal(String distancee , String timee){

        this.disS = distancee;
        this.timS = timee;

        Double time = Double.parseDouble(timS);
        Double distance = Double.parseDouble(disS);

        if(time == 1){
            int a=1;
            result = (a*distance)*3.6;
        }

        else if(time != 1){
            Double aa=1/time;
            result = (aa*distance)*3.6;
        }

        if(result>80){
            isMore=true;
        }
        String re = result.toString().trim();
        final data d =new data(0 , isMore ,disS , timS , re);


    }
}
