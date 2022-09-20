package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店插件服务订单查询
 *
 * @author auto create
 * @since 1.0, 2020-03-13 16:20:17
 */
public class AntMerchantOrderStoreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2254969597113658436L;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 外部业务号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 插件业务场景code，预约为ShopService
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 线上店的ID
	 */
	@ApiField("store_open_id")
	private String storeOpenId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStoreOpenId() {
		return this.storeOpenId;
	}
	public void setStoreOpenId(String storeOpenId) {
		this.storeOpenId = storeOpenId;
	}

}
