package exam.ExamSort;

public class StringCalculator {
	public static int add(final String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",|\n");
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				// Check if negative. Can't convert because length could be too large.
				if (number.trim().charAt(0) == '-') {
					throw new IllegalArgumentException("Invalid Argument, Negative");
				}
				if (number.trim().length() > 3) {
					continue;
				}
				int curInt = Integer.parseInt(number.trim());
				returnValue += curInt;
			}
		}
		return returnValue;
	}
}
