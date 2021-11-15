package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * offer
 *
 * @author auto create
 * @since 1.0, 2021-11-15 11:09:16
 */
public class SourceOffer extends AlipayObject {

	private static final long serialVersionUID = 4182935788872733366L;

	/**
	 * offerId
	 */
	@ApiField("offer_id")
	private String offerId;

	/**
	 * offer类型。目前仅支持  mini_app ：小程序
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
