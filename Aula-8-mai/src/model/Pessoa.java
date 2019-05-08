package model;

public abstract class Pessoa {
	private String end;

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	
	public abstract void falar();
}
