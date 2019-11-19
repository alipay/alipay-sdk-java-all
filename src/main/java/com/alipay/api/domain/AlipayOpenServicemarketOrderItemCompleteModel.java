package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商完成订单内单个明细实施操作
 *
 * @author auto create
 * @since 1.0, 2019-07-30 18:08:00
 */
public class AlipayOpenServicemarketOrderItemCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 2449662315476264225L;

	/**
	 * 订购服务插件订单号
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 商家订购服务选择的某一小程序的APPID，如果该订单为蚂蚁服务市场发布的小程序插件服务所产生的订单，则此字段必填
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 商家订购服务选择的某一门店的ID，如果该订单为口碑服务市场发布的服务所产生的订单，则此字段必填
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
