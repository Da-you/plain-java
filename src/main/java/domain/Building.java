package domain;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private static final int FLOOR = 25;
	private List<Elevator> elevators;

	public List<Elevator> generateElevator() {
		elevators = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Elevator elevator = new Elevator(false, ElevatorStatus.STOP, 1);
			elevators.add(elevator);
		}
		return elevators;
	}
}
