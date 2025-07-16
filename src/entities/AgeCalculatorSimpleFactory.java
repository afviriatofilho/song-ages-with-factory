package entities;

public class AgeCalculatorSimpleFactory {
	public AgeCalculatorSimpleFactory() {
	}
	
	public static AgeCalculator create(char unit) {
		switch (unit) {
		case ('d'):
			return new AgeCalculatorDays();
		case ('m'):
			return new AgeCalculatorMonths();
		case ('y'):
			return new AgeCalculatorYears();
		default:
			return new AgeCalculatorYears();
		}
	}
}
