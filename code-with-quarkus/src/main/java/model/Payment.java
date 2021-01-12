package model;


public class Payment {
	private int id;
	private String cid;
	private String mid;
	private int amount;

	public Payment(int id, String cid, String mid, int amount) {
		this.id=id;
		this.cid = cid;
		this.mid = mid;
		this.amount = amount;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getAllPayment() {
		return "return all payment data";
	}
	
	

}
