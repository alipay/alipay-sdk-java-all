package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.recommend.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 23:17:40
 */
public class AlipayOpenMiniAmpeRecommendDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 8286923532589858386L;

	/** 
	 * true:有效
false: 无效
	 */
	@ApiField("valid")
	private Boolean valid;

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public Boolean getValid( ) {
		return this.valid;
	}

}
