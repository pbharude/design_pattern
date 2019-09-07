package com.designpattern.creation.abstractfactory.factory;

import com.designpattern.creation.abstractfactory.card.AmexGoldCreditCard;
import com.designpattern.creation.abstractfactory.card.AmexPlatinumCreditCard;
import com.designpattern.creation.abstractfactory.card.CardType;
import com.designpattern.creation.abstractfactory.card.CreditCard;
import com.designpattern.creation.abstractfactory.validator.Validator;

public class AmexCreditCardFactory extends CreditCardFactory {

	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new AmexGoldCreditCard();
		case PLATINUM:
			return new AmexPlatinumCreditCard();

		default:
			break;
		}
		return null;
	}

	public Validator getCardValidator(CardType cardType) {
		
		return null;
	}

}
