package domain;



public class City {
	private String ptt;
	private String name;
	public City(String ptt, String name) {
		super();
		this.ptt = ptt;
		this.name = name;
	}
	public City() {
		super();
	}
	
	public City(String ptt) {
		super();
		this.ptt = ptt;
	}
	public String getPtt() {
		return ptt;
	}
	public void setPtt(String ptt) {
		this.ptt = ptt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ptt == null) ? 0 : ptt.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (ptt == null) {
			if (other.ptt != null)
				return false;
		} else if (!ptt.equals(other.ptt))
			return false;
		return true;
	}

}
