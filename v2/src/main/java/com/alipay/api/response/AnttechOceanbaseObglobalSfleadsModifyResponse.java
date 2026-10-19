package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfleads.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-14 18:17:59
 */
public class AnttechOceanbaseObglobalSfleadsModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4483967357545645487L;

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
