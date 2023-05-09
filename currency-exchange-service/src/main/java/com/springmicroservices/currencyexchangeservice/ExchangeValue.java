package com.springmicroservices.currencyexchangeservice;

import java.math.BigDecimal;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;  

@Entity
@Table(name = "exchange_value")
public class ExchangeValue {
	
	@Id
	public Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private int port;
	@Column(name="conversion_multiple")
	private BigDecimal conversionMultiple;
	
	public ExchangeValue() {
		
	}
	public ExchangeValue( Long id,String from, String to, BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public Long getId() {
		return id;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	
	
}
