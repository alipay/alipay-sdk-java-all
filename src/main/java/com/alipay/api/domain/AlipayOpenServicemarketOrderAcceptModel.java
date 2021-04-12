package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商接单操作
 *
 * @author auto create
 * @since 1.0, 2021-03-17 16:29:34
 */
public class AlipayOpenServicemarketOrderAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 5354774393342886526L;

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
