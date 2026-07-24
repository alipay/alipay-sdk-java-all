package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfleads.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-02 15:47:54
 */
public class AnttechOceanbaseObglobalSfleadsModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7733464512878829132L;

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
