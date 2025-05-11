package domain;

import static domain.ElevatorStatus.*;

public class Elevator {

	private static final int MAX_WEIGHT = 1000;

	private boolean isOpen;

	private ElevatorStatus status;

	private int current_floor;

	private Elevator() {
	}

	public Elevator(boolean isOpen, ElevatorStatus status, int current_floor) {
		this.isOpen = isOpen;
		this.status = status;
		this.current_floor = current_floor;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public ElevatorStatus getStatus() {
		return status;
	}

	public int getCurrent_floor() {
		return current_floor;
	}

}
