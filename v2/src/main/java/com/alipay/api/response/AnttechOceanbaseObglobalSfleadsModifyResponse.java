package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfleads.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-22 17:07:56
 */
public class AnttechOceanbaseObglobalSfleadsModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7146651526619424122L;

	/** 
	 * 商机id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
