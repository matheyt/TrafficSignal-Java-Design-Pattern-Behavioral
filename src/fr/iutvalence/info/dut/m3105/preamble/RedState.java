package fr.iutvalence.info.dut.m3105.preamble;

public class RedState implements StateTrafficSignal {

	@Override
	public void getRemainingTime(TrafficSignal context){
		
	}
	
	@Override
	public void pressButton(TrafficSignal context){
		
	}
	
	@Override
	public void switchState(TrafficSignal context) {
		context.switchToState(new GreenState());
	}

}