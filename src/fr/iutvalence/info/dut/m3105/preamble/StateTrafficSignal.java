package fr.iutvalence.info.dut.m3105.preamble;

public interface StateTrafficSignal {
	
	int getRemainingTime(TrafficSignal context);
	
	void pressButton(TrafficSignal context);
	
	void switchState(TrafficSignal context);
	
	
}
