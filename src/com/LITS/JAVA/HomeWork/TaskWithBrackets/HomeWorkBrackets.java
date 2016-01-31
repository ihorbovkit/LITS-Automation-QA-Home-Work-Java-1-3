package com.LITS.JAVA.HomeWork.TaskWithBrackets;

public class HomeWorkBrackets {

	public static void main(String[] args) {
/* Провірити правильність написання дужок в стрічці*/
		
		String s = ")(a2 + 13) * (bx)";
		int bracketsOpen = 0;
		int bracketsClose = 0;
		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				bracketsOpen++;
				counter++;
			}
			else if (s.charAt(i) == ')') {
				if (counter == 0) {
					// counter++;
					bracketsClose++;
					System.out
							.println("In sentence "
									+ s
									+ " close bracket don't have open bracket on position "
									+ (i + 1));

				} else {
					bracketsClose++;
					counter--;
				}
			}

		}

		if (counter == 0 && bracketsOpen == bracketsClose) {
			System.out.println("Brackets placed correct.");
		}
		if (bracketsOpen != bracketsClose) {
			System.out.println("Number of brackets are not equal. There are "
					+ bracketsOpen + " open brackets and " + bracketsClose
					+ " close brackets");
		}
		if (counter != 0 || bracketsOpen != bracketsClose) {
			System.out.println("Brackets placed incorect.");
		}
	}

}
