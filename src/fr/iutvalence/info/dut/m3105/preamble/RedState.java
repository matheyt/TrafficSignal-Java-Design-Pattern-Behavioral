package fr.iutvalence.info.dut.m3105.preamble;

public class RedState implements StateTrafficSignal {

private int stateRemainingTime;
	
	public RedState() {
		this.stateRemainingTime = 10;
	}

	@Override
	public int getRemainingTime(TrafficSignal context){	
		return this.stateRemainingTime;
	}
	
	@Override
	public void pressButton(TrafficSignal context){
		
	}
	
	@Override
	public void switchState(TrafficSignal context) {
		context.switchToState(TrafficSignalState.GREEN);
	}

}
