package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		int newAmount = this.amount;
		newAmount += money.amount;
		Money newMoney = new Money(newAmount);
		return newMoney;
	}
	
	public Money minus(Money money) {
		int newAmount = this.amount;
		newAmount -= money.amount;
		Money newMoney = new Money(newAmount);
		
		return newMoney;
	}

	public Money multiply(Money money) {
		int newAmount = this.amount;
		newAmount *= money.amount;
		Money newMoney = new Money(newAmount);
		
		return newMoney;
	}

	public Money devide(Money money) {
		
		int newAmount = this.amount;
		newAmount /= money.amount;
		Money newMoney = new Money(newAmount);
		return newMoney;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
	
}