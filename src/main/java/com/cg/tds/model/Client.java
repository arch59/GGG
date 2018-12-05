package com.cg.tds.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "tdsdetail")
public class Client {
	@Id
	@Field(value = "_id")
	private String uniqueId;
	@Field(value = "deductor_name")
	private String deductorName;
	@Field(value = "deductor_pan")
	private String deductorPan;
	@Field(value = "tds_deposited")
	private String tdsDeposited;

	public Client() {
		super();
	}

	public Client(String uniqueId, String deductorName, String deductorPan,
			String tdsDeposited) {
		super();
		this.uniqueId = uniqueId;
		this.deductorName = deductorName;
		this.deductorPan = deductorPan;
		this.tdsDeposited = tdsDeposited;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getDeductorName() {
		return deductorName;
	}

	public void setDeductorName(String deductorName) {
		this.deductorName = deductorName;
	}

	public String getDeductorPan() {
		return deductorPan;
	}

	public void setDeductorPan(String deductorPan) {
		this.deductorPan = deductorPan;
	}

	public String getTdsDeposited() {
		return tdsDeposited;
	}

	public void setTdsDeposited(String tdsDeposited) {
		this.tdsDeposited = tdsDeposited;
	}

	@Override
	public String toString() {
		return "Client [uniqueId=" + uniqueId + ", deductorName="
				+ deductorName + ", deductorPan=" + deductorPan
				+ ", tdsDeposited=" + tdsDeposited + "]";
	}
}