package fr.iutvalence.info.dut.m3105.preamble;

public class GreenState implements StateTrafficSignal {
	
	private int stateRemainingTime;
	
	public GreenState() {
		this.stateRemainingTime = 10;
	}

	@Override
	public int getRemainingTime(TrafficSignal context){	
		return this.stateRemainingTime;
	}
	
	@Override
	public void pressButton(TrafficSignal context){
		if (this.stateRemainingTime > 2)
			this.stateRemainingTime = 2;			
	}
	
	@Override
	public void switchState(TrafficSignal context) {
		context.switchToState(TrafficSignalState.GREEN/*new OrangeState()*/);
	}
	
}
