package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.iotfm.checkbind.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-24 14:01:47
 */
public class AlipayCommerceMedicalIotfmCheckbindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1755837557343551623L;

	/** 
	 * 主账户是否有绑定亲情账户
	 */
	@ApiField("has_bind_fm")
	private Boolean hasBindFm;

	public void setHasBindFm(Boolean hasBindFm) {
		this.hasBindFm = hasBindFm;
	}
	public Boolean getHasBindFm( ) {
		return this.hasBindFm;
	}

}
