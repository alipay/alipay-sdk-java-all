package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.community.deliveryrecentorder.detect response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 19:57:21
 */
public class AlipayEbppIndustryCommunityDeliveryrecentorderDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 2355635728675649669L;

	/** 
	 * 骑手平台
	 */
	@ApiField("delivery_platform")
	private String deliveryPlatform;

	/** 
	 * 标识骑手来源
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/** 
	 * true：骑手 false: 非骑手
	 */
	@ApiField("detect_result")
	private Boolean detectResult;

	public void setDeliveryPlatform(String deliveryPlatform) {
		this.deliveryPlatform = deliveryPlatform;
	}
	public String getDeliveryPlatform( ) {
		return this.deliveryPlatform;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public String getDeliveryType( ) {
		return this.deliveryType;
	}

	public void setDetectResult(Boolean detectResult) {
		this.detectResult = detectResult;
	}
	public Boolean getDetectResult( ) {
		return this.detectResult;
	}

}
