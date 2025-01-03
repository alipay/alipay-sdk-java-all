package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.iotfm.checkbind.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-30 12:02:55
 */
public class AlipayCommerceMedicalIotfmCheckbindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3323946889335396743L;

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
