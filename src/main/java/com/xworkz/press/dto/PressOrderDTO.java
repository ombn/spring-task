package com.xworkz.press.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({@NamedQuery(query = "select order from PressOrderDTO order where order.orderFrom=:from",name = "fetchByOrderFrom")})
public class PressOrderDTO {

	@Id
	private long id;
	private String orderFrom;
	private long phoneNo;
	private String cardType;
	private int noOfCopies;
	private String content;

	public String getOrderFrom() {
		return orderFrom;
	}

	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "PressOrderDTO [orderFrom=" + orderFrom + ", phoneNo=" + phoneNo + ", cardType=" + cardType
				+ ", noOfCopies=" + noOfCopies + ", content=" + content + "]";
	}

}
