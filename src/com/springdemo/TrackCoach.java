package com.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it:" +fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff(){
		System.out.println("Trackcoach: inside method domystartupstuff");
	}

	//add a destroy method
	public void doMyStartupStuffYoYo(){
		System.out.println("Trackcoach: inside method domystartupstuffyoyo");
	}
	
	

}
