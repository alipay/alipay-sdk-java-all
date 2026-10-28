package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销详情
 *
 * @author auto create
 * @since 1.0, 2026-10-19 19:42:55
 */
public class Promo extends AlipayObject {

	private static final long serialVersionUID = 7829223557259591197L;

	/**
	 * 营销描述文案
	 */
	@ApiField("description")
	private String description;

	/**
	 * 折扣结算金额（含币种 currency 与数值 value）
	 */
	@ApiField("discount_amount")
	private Moneyq discountAmount;

	/**
	 * 营销描述文案
	 */
	@ApiField("discount_rate")
	private String discountRate;

	/**
	 * 活动/权益生效时间（ISO 8601格式，如 2026-06-11T12:00:00+08:00）
	 */
	@ApiField("effective_time")
	private String effectiveTime;

	/**
	 * 活动/权益过期时间（ISO 8601格式，如 2026-06-11T12:00:00+08:00）
	 */
	@ApiField("expiry_time")
	private String expiryTime;

	/**
	 * 营销活动/权益唯一标识
	 */
	@ApiField("promo_id")
	private String promoId;

	/**
	 * 营销咨询请求唯一标识，须关联 igtp_promo_consult_record
	 */
	@ApiField("promo_request_id")
	private String promoRequestId;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Moneyq getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(Moneyq discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getExpiryTime() {
		return this.expiryTime;
	}
	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public String getPromoRequestId() {
		return this.promoRequestId;
	}
	public void setPromoRequestId(String promoRequestId) {
		this.promoRequestId = promoRequestId;
	}

}
