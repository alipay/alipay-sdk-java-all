package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.anchor.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:12:36
 */
public class AlipayMerchantAnchorInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1681799841883244433L;

	/** 
	 * 主播ID+唯一+天猫好房带货+根据uid获取
	 */
	@ApiField("anchor_id")
	private String anchorId;

	public void setAnchorId(String anchorId) {
		this.anchorId = anchorId;
	}
	public String getAnchorId( ) {
		return this.anchorId;
	}

}
