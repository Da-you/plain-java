package domain;

public class Users {

	private String name;

	private int weight;

	private int destination_floor;

	private boolean isBoarding;

	private int current_floor;

	private Users() {
	}

	public Users(String name, int weight, int destination_floor, int current_floor) {
		this.name = name;
		this.weight = weight;
		this.destination_floor = destination_floor;
		this.isBoarding = false;
		this.current_floor = current_floor;
	}

	public boolean updateBoardingStatus(Users user) {
		if (!user.getStatus()) {
			user.isBoarding = true;
		} else {
			user.isBoarding = false;
		}
		return user.getStatus();
	}

	public boolean getStatus() {
		return isBoarding;
	}

	public int getCurrent_floor() {
		return current_floor;
	}

	public String getName() {
		return name;
	}

	public void moveFloor(int floor) {
		if (this.getCurrent_floor() == floor) {
			throw new IllegalArgumentException("현재 층과 동일한 층으로는 이동이 불가 합니다.");
		} else if (floor > this.getCurrent_floor() && floor < 26) {
			System.out.println("위로 이동합니다.");
		} else if (floor < this.getCurrent_floor() && floor > 0) {
			System.out.println("아래로 이동합니다.");
		}
	}
}
