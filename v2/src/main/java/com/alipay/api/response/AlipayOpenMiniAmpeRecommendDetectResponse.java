package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.recommend.detect response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:28:14
 */
public class AlipayOpenMiniAmpeRecommendDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 8417179475857551921L;

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
