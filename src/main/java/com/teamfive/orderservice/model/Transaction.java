package com.teamfive.orderservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Transaction {

	@Id
	private String idTrx;
	private String skuCode;
	private Integer qty;
	private Date createdDate;
}
