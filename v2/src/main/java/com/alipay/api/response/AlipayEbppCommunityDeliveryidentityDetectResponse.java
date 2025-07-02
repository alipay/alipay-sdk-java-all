package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.deliveryidentity.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-24 20:22:26
 */
public class AlipayEbppCommunityDeliveryidentityDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7482581625139985781L;

	/** 
	 * 在该小区是否有单
	 */
	@ApiField("detect_result")
	private Boolean detectResult;

	/** 
	 * 骑手所属平台
	 */
	@ApiField("platform")
	private String platform;

	public void setDetectResult(Boolean detectResult) {
		this.detectResult = detectResult;
	}
	public Boolean getDetectResult( ) {
		return this.detectResult;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getPlatform( ) {
		return this.platform;
	}

}
