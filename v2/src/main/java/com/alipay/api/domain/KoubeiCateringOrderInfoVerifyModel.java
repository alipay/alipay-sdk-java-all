package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单核销
 *
 * @author auto create
 * @since 1.0, 2021-12-21 19:41:43
 */
public class KoubeiCateringOrderInfoVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6533759549152361641L;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 用户核销码中的核销数值串
	 */
	@ApiField("verify_order_id")
	private String verifyOrderId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getVerifyOrderId() {
		return this.verifyOrderId;
	}
	public void setVerifyOrderId(String verifyOrderId) {
		this.verifyOrderId = verifyOrderId;
	}

}
