package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.copy response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-20 16:44:03
 */
public class AntMerchantExpandIndirectZftCopyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7153888918241586842L;

	/** 
	 * 迁移后的直付通二级商户smid
	 */
	@ApiField("smid_new")
	private String smidNew;

	public void setSmidNew(String smidNew) {
		this.smidNew = smidNew;
	}
	public String getSmidNew( ) {
		return this.smidNew;
	}

}
