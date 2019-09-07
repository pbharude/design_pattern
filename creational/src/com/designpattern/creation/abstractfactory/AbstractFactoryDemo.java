/**
 * 
 */
package com.designpattern.creation.abstractfactory;

import com.designpattern.creation.abstractfactory.card.CardType;
import com.designpattern.creation.abstractfactory.card.CreditCard;
import com.designpattern.creation.abstractfactory.factory.CreditCardFactory;

/**
 * @author pratimesh
 *
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardFactory cardFactory = CreditCardFactory.getCreditCardFactory(650);
		CreditCard card = cardFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card);
		
		cardFactory = CreditCardFactory.getCreditCardFactory(590);
		card = cardFactory.getCreditCard(CardType.GOLD);
		System.out.println(card);

	}

}
