package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益商品积分退款
 *
 * @author auto create
 * @since 1.0, 2025-06-23 15:47:47
 */
public class AlipayCommerceMedicalBenefitPointRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2729813271589444932L;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 虎鲸商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 医疗商品id
	 */
	@ApiField("med_benefit_id")
	private String medBenefitId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 虎鲸skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMedBenefitId() {
		return this.medBenefitId;
	}
	public void setMedBenefitId(String medBenefitId) {
		this.medBenefitId = medBenefitId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
