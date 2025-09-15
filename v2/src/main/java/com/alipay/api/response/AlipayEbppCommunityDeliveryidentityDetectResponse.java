package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.deliveryidentity.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 11:17:35
 */
public class AlipayEbppCommunityDeliveryidentityDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 4116751327652917816L;

	/** 
	 * 在该小区是否有单
	 */
	@ApiField("detect_result")
	private Boolean detectResult;

	/** 
	 * 与平台方合作，通过个人手机号或者身份信息，查询个人是否为该平台骑手身份以及在指定区域和时间范围内是否有订单。
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
