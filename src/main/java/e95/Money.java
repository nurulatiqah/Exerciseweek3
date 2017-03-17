package e95;

public class Money {

	private final int euros;
	private final int cents;

	/**
	 * @param euros
	 * @param cents
	 */
	public Money(int euros, int cents) {

		if (cents > 99) {
			euros += cents / 100;
			cents %= 100;
		}

		this.euros = euros;
		this.cents = cents;
	}

	public int euros() {
		return euros;
	}

	public int cents() {
		return cents;
	}

	/**
	 * returns a new Money object that has a value equal to the sum of the
	 * object for which the method was called and the object given as parameter.
	 * 
	 * @param added
	 * @return newMoney
	 */
	public Money plus(Money added) {
		int euro = euros + added.euros;
		int cent = cents + added.cents;
		return new Money(euro, cent);

	}

	/**
	 * @param compared
	 * @return returns true if the object for which the method was called is
	 *         less valuable than the object given as parameter.
	 */
	public boolean less(Money compared) {
		if (this.euros < compared.euros) {// test if less valuable
			return true;
		} else if (this.euros == compared.euros && this.cents < compared.cents) {// test for euro and cent																																							// cent
			return true;
		}
		return false;
	}

	public String toString() {
		String zero = "";
		if (cents <= 10) {
			zero = "0";
		}

		return euros + "." + zero + cents + "e";
	}

	/**
	 * @param decremented
	 * @return 0 if negative
	 * returns a new Money object that has a value equal to the 
	 * object for which the method was called minus the object given 
	 * as parameter
	 */
	public Money minus(Money decremented) {
		if (less(decremented)) { //call method less
			int euro = 0;
			int cent = 0;
			return new Money(euro, cent);
		} else {
			int euro = this.euros - decremented.euros;
			int cent = this.cents - decremented.cents;
			//when cents smaller than decremented cents,euro--
			//0<50, 10-3 = 7, 7-1 = 6. 100-50 = 50
			if (this.cents < decremented.cents) {
				euro--;
				cent = 100 - decremented.cents;
			}
			return new Money(euro, cent);
		}
	}
}
