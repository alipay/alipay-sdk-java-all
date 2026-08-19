package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行机票订单数据同步-优惠项目信息
 *
 * @author auto create
 * @since 1.0, 2026-08-07 13:52:36
 */
public class TrafficAirticketOrderDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 2837341641896464734L;

	/**
	 * 优惠项目价格，币种：人民币，单位：元
	 */
	@ApiField("discount_price")
	private String discountPrice;

	/**
	 * 优惠项目描述
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 优惠项目id，商户侧定义的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 优惠项目名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 优惠项目来源，用于区分是 商家优惠 和 支付宝优惠
	 */
	@ApiField("item_source")
	private String itemSource;

	public String getDiscountPrice() {
		return this.discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemSource() {
		return this.itemSource;
	}
	public void setItemSource(String itemSource) {
		this.itemSource = itemSource;
	}

}
