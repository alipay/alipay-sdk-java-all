package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * offer
 *
 * @author auto create
 * @since 1.0, 2022-06-27 19:37:20
 */
public class SourceOffer extends AlipayObject {

	private static final long serialVersionUID = 4854174694229727611L;

	/**
	 * offerId，根据offer类型对应不同ID。目前支持小程序APPID、营销活动活动编码ID
	 */
	@ApiField("offer_id")
	private String offerId;

	/**
	 * offer类型。目前仅支持小程序（mini_app/service）、营销活动（voucher）两类。
注意：小程序在发布接口请用mini_app，查询接口返回为service
	 */
	@ApiField("offer_type")
	private String offerType;

	public String getOfferId() {
		return this.offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public String getOfferType() {
		return this.offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

}
