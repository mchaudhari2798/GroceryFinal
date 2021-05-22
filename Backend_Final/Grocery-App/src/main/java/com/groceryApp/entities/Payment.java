package com.groceryApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Card_id;
	private String typeOfCard; 
	private long card_No;
	private String cardHolderName; 
	private String cardValidity;
	private int cvv;
	
	public Payment() {
	
	}

	
	public Payment(String typeOfCard, long card_id, long card_No, String cardHolderName, String cardValidity, int cvv) {
		super();
		this.typeOfCard = typeOfCard;
		Card_id = card_id;
		this.card_No = card_No;
		this.cardHolderName = cardHolderName;
		this.cardValidity = cardValidity;
		this.cvv = cvv;
	}


	public String getTypeOfCard() {
		return typeOfCard;
	}


	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}


	public long getCard_id() {
		return Card_id;
	}


	public void setCard_id(long card_id) {
		Card_id = card_id;
	}


	public long getCard_No() {
		return card_No;
	}


	public void setCard_No(long card_No) {
		this.card_No = card_No;
	}


	public String getCardHolderName() {
		return cardHolderName;
	}


	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}


	public String getCardValidity() {
		return cardValidity;
	}


	public void setCardValidity(String cardValidity) {
		this.cardValidity = cardValidity;
	}


	public int getCvv() {
		return cvv;
	}


	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

		
}
