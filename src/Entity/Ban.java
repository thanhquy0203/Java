package Entity;

import java.util.Objects;

public class Ban {
	private String maBan;
	private String tinhTrang;
	
	public Ban() {
		// TODO Auto-generated constructor stub
	}
	
	public Ban(String maBan) {
		super();
		this.maBan= maBan;
	}

	public Ban(String maBan, String tinhTrang) {
		super();
		this.maBan = maBan;
		this.tinhTrang = tinhTrang;
	}

	public String getMaBan() {
		return maBan;
	}

	public void setMaBan(String maBan) {
		this.maBan = maBan;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maBan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Ban other = (Ban) obj;
		return Objects.equals(maBan, other.maBan);
	}
}
