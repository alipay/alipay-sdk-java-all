package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.linke.alcollectioncenter.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:41
 */
public class AntLinkeAlcollectioncenterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2415737449191641687L;

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
