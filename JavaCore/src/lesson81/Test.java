package lesson81;

import lesson81.CounterModel;
import lesson81.CounterView;

public class Test {
	public static void main(String[] args) {
		CounterModel ct = new CounterModel();
		ct.increment();
		ct.increment();
		ct.increment();
		System.out.println(ct.getValue());
		ct.decrement();
		System.out.println(ct.getValue());
		
		CounterView ctv = new CounterView();
	}
}
