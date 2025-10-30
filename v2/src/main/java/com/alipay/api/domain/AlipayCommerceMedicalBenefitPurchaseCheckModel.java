package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益商品下单校验
 *
 * @author auto create
 * @since 1.0, 2025-06-23 15:47:46
 */
public class AlipayCommerceMedicalBenefitPurchaseCheckModel extends AlipayObject {

	private static final long serialVersionUID = 4796224843226548494L;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 虎鲸的商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 健康岛权益商品MTid
	 */
	@ApiField("med_benefit_id")
	private String medBenefitId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

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
