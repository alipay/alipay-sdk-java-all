package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:17
 */
public class ActivityBean extends AlipayObject {

	private static final long serialVersionUID = 3132754492729361389L;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 价格，单位：元
	 */
	@ApiField("amt")
	private String amt;

	/**
	 * 折扣skuId
	 */
	@ApiField("discount_sku_id")
	private String discountSkuId;

	/**
	 * ID值
	 */
	@ApiField("id_value")
	private String idValue;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 原始skuId
	 */
	@ApiField("origin_sku_id")
	private String originSkuId;

	/**
	 * 展示价格，单位：元
	 */
	@ApiField("show_amt")
	private String showAmt;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAmt() {
		return this.amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getDiscountSkuId() {
		return this.discountSkuId;
	}
	public void setDiscountSkuId(String discountSkuId) {
		this.discountSkuId = discountSkuId;
	}

	public String getIdValue() {
		return this.idValue;
	}
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOriginSkuId() {
		return this.originSkuId;
	}
	public void setOriginSkuId(String originSkuId) {
		this.originSkuId = originSkuId;
	}

	public String getShowAmt() {
		return this.showAmt;
	}
	public void setShowAmt(String showAmt) {
		this.showAmt = showAmt;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
