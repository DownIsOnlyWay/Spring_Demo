package com.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no arg Constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach: inside setter method - set FortuneService");
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        System.out.println("CricketCoach: inside setter method - set emailAddress");
    }

    public void setTeam(String team) {
        this.team = team;
        System.out.println("CricketCoach: inside setter method - set team");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }


    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 50mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
