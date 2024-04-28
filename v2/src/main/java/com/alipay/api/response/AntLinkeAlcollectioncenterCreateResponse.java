package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.linke.alcollectioncenter.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-15 16:14:52
 */
public class AntLinkeAlcollectioncenterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3876575659822664579L;

	/** 
	 * 案件id
	 */
	@ApiField("affair_id")
	private String affairId;

	public void setAffairId(String affairId) {
		this.affairId = affairId;
	}
	public String getAffairId( ) {
		return this.affairId;
	}

}
