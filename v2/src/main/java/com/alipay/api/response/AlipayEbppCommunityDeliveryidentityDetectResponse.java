package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.deliveryidentity.detect response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-15 10:02:13
 */
public class AlipayEbppCommunityDeliveryidentityDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 3734711363253563192L;

	/** 
	 * 在该小区是否有单
	 */
	@ApiField("detect_result")
	private Boolean detectResult;

	public void setDetectResult(Boolean detectResult) {
		this.detectResult = detectResult;
	}
	public Boolean getDetectResult( ) {
		return this.detectResult;
	}

}
