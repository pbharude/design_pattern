package com.designpattern.creation.abstractfactory.factory;

import com.designpattern.creation.abstractfactory.card.CardType;
import com.designpattern.creation.abstractfactory.card.CreditCard;
import com.designpattern.creation.abstractfactory.validator.Validator;

public abstract class CreditCardFactory {
	public static CreditCardFactory getCreditCardFactory(int score) {
		if(score>600) {
			return new AmexCreditCardFactory();
		}else {
			return new VisaCreditCardFactory();
		}
	}
	public abstract CreditCard getCreditCard(CardType cardType);
	public abstract Validator getCardValidator(CardType cardType);
}
