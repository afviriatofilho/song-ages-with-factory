package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeCalculatorDays implements AgeCalculator {
	public AgeCalculatorDays() {
	}
	
	public Long age(Song s) {
		return ChronoUnit.DAYS.between(s.getReleaseDate(), LocalDate.now());
	}
	
	public String getUnit() {
		return "days";
	}
}
