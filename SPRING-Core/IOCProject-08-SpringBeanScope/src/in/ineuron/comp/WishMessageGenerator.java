package in.ineuron.comp;

import java.util.Date;

//Target class(userDefined=>WishMessageGenerator)
public class WishMessageGenerator {

	// Defendant class(PreDefined=> java.util.Date)
	private Date date;

	public WishMessageGenerator() {
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}
