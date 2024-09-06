package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容所带的服务
 *
 * @author auto create
 * @since 1.0, 2024-08-19 14:02:53
 */
public class SourceOffer extends AlipayObject {

	private static final long serialVersionUID = 7717511877998717245L;

	/**
	 * offerId，根据offer类型对应不同ID。支持小程序的APPID/小程序服务的服务编码/优惠券的活动ID
	 */
	@ApiField("offer_id")
	private String offerId;

	/**
	 * offer类型。目前仅支持小程序（mini_app/service）、小程序服务（subservice）、营销活动（voucher）、商品(goods)、小游戏(game)。
注意：其中“小程序”offer类型，在发布接口请用mini_app，查询接口返回为service
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
