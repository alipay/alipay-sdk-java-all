package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商接单操作
 *
 * @author auto create
 * @since 1.0, 2021-08-10 10:36:57
 */
public class AlipayOpenServicemarketOrderAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 1577222722432184859L;

	/**
	 * 服务商品订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

}
