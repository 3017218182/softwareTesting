package classes.tju.stu.lab1;

public class Money {
	boolean calculate (int total) {
		if (total < 0) {
			return false;
		}
		else {
			if (total > 50) {
				total -= 50;
			}
			if (total > 20) {
				total -= 20;
			}
			if (total > 10) {
				total -= 10;
			}
			if (total > 5) {
				total -= 5;
			}
			if (total > 5) {
				total -= 5;
			}
			return total<=3;
		}
	}

}
