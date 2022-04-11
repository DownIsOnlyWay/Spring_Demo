package com.springdemo;

public class TrackCoach implements Coach {


    @Override
    public String getDailyWorkOut() {
        return "Run 5k steps";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
