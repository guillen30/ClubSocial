package main;

public class date {
	private final String ddd = "dias";
	private final String mmm = "mes";
	private final String yyyy = "year";
	
	

	public String getDdd() {
		return ddd;
	}



	public String getMmm() {
		return mmm;
	}



	public String getYyyy() {
		return yyyy;
	}



	@Override
	public String toString() {
		return "date [ddd=" + ddd + ", mmm=" + mmm + ", yyyy=" + yyyy + "]";
	}

}
