package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字商圈订单核销接口
 *
 * @author auto create
 * @since 1.0, 2023-03-03 15:18:06
 */
public class AlipayOpenIotmbsDistrictorderVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3514192388586278468L;

	/**
	 * order_id：待核销的订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * store_id：核销门店的id
	 */
	@ApiField("store_id")
	private String storeId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
