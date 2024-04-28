package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv删除店铺自定义展示内容的接口
 *
 * @author auto create
 * @since 1.0, 2022-10-11 12:00:07
 */
public class KoubeiMarketingCampaignOpenDeliveryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1842497527544238119L;

	/**
	 * 要删除店铺页投放内容的类型。目前支持的类型有：1. gift_card
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 商户的PID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 要删除内容投放的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
