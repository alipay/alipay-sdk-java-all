package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务订单明细实施项单项取消
 *
 * @author auto create
 * @since 1.0, 2018-07-06 14:51:53
 */
public class AlipayOpenServicemarketOrderItemCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7363231892775336349L;

	/**
	 * 当前门店区域不支持实施
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 订购服务订单ID
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

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

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
