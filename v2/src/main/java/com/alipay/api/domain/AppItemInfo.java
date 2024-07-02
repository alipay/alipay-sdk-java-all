package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动核销小程序商品详情
 *
 * @author auto create
 * @since 1.0, 2023-07-17 18:00:12
 */
public class AppItemInfo extends AlipayObject {

	private static final long serialVersionUID = 8757146172552571252L;

	/**
	 * 小程序商品-支付宝内部商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品可用类型
	 */
	@ApiField("item_use_type")
	private String itemUseType;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 外部商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemUseType() {
		return this.itemUseType;
	}
	public void setItemUseType(String itemUseType) {
		this.itemUseType = itemUseType;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}
