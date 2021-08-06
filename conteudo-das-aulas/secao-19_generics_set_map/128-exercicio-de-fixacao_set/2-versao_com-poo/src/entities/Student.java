package entities;

import java.util.Objects;

public class Student {

	private Integer usercode;

	public Student(Integer usercode) {
		this.usercode = usercode;
	}

	public Integer getUsercode() {
		return usercode;
	}

	public void setUsercode(Integer usercode) {
		this.usercode = usercode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usercode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(usercode, other.usercode);
	}
}
