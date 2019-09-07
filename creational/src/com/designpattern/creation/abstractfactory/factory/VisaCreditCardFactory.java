package com.designpattern.creation.abstractfactory.factory;

import com.designpattern.creation.abstractfactory.card.CardType;
import com.designpattern.creation.abstractfactory.card.CreditCard;
import com.designpattern.creation.abstractfactory.card.VisaGoldCreditCard;
import com.designpattern.creation.abstractfactory.card.VisaPlatinumCreditCard;
import com.designpattern.creation.abstractfactory.validator.Validator;

public class VisaCreditCardFactory extends CreditCardFactory {

	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldCreditCard();

		case PLATINUM:
			return new VisaPlatinumCreditCard();
		default:
			return null;
		}
	}

	public Validator getCardValidator(CardType cardType) {
		// TODO Auto-generated method stub
		return null;
	}

}
