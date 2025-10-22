package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益商品积分支付
 *
 * @author auto create
 * @since 1.0, 2025-06-23 15:47:49
 */
public class AlipayCommerceMedicalBenefitPointPayModel extends AlipayObject {

	private static final long serialVersionUID = 2113683554293146478L;

	/**
	 * 业务标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 单品购买数量
	 */
	@ApiField("buy_quantity")
	private Long buyQuantity;

	/**
	 * 虎鲸商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 渠道信息
	 */
	@ApiField("kz_info")
	private String kzInfo;

	/**
	 * 医疗商品ID
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
	 * 虎鲸SKUID
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

	public Long getBuyQuantity() {
		return this.buyQuantity;
	}
	public void setBuyQuantity(Long buyQuantity) {
		this.buyQuantity = buyQuantity;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getKzInfo() {
		return this.kzInfo;
	}
	public void setKzInfo(String kzInfo) {
		this.kzInfo = kzInfo;
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
