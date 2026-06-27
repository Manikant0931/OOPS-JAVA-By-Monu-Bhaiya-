package final_dance_IN_OOPS;

import java.util.Comparator;

import final_dance_IN_OOPS.Cars;

public class CarCompareterSpeed implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o1.speed - o2.speed;
	}

}
