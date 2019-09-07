/**
 * 
 */
package com.designpattern.creation.abstractfactory.card;

/**
 * @author pratimesh
 *
 */
public abstract class CreditCard {
	private String cardNo;
	
	private Integer cvc;

	/**
	 * @return the cvc
	 */
	public Integer getCvc() {
		return cvc;
	}

	/**
	 * @param cvc the cvc to set
	 */
	public void setCvc(Integer cvc) {
		this.cvc = cvc;
	}

	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

}
