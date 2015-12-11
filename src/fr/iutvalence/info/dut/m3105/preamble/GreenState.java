package fr.iutvalence.info.dut.m3105.preamble;

public class GreenState implements StateTrafficSignal {
	
	private int stateRemainingTime;
	
	public GreenState() {
		this.stateRemainingTime = 10;
	}

	@Override
	public int getRemainingTime(TrafficSignal context){
		
		return 0;
	}
	
	@Override
	public void pressButton(TrafficSignal context){
		if ()
			
	}
	
	@Override
	public void switchState(TrafficSignal context) {
		context.switchToState(TrafficSignalState.GREEN/*new OrangeState()*/);
	}
	
}
