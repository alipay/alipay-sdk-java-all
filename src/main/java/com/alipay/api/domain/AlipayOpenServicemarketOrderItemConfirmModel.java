package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代商家确认完成
 *
 * @author auto create
 * @since 1.0, 2019-07-30 18:08:12
 */
public class AlipayOpenServicemarketOrderItemConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4572298595646463425L;

	/**
	 * 商品订单ID
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
