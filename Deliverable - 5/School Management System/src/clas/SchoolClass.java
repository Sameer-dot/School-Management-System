package clas;

public class SchoolClass implements Class{
	private String name;
	private int roomNo;
	
	public SchoolClass(String name, int roomNo) {
		setName(name);
		setRoomNo(roomNo);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int getRoomNo() {
		return roomNo;
	}
	
	@Override
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
}
