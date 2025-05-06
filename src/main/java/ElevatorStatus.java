public enum ElevatorStatus {
	UP("UP"), DOWN("DOWN"), STOP("STOP");

private String status;

	ElevatorStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
