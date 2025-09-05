package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.community.deliveryrecentorder.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 11:17:35
 */
public class AlipayEbppIndustryCommunityDeliveryrecentorderDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 2116773166236381831L;

	/** 
	 * 与平台方合作，通过个人手机号或者身份信息，查询个人是否为该平台骑手身份以及在指定区域和时间范围内是否有订单。
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
