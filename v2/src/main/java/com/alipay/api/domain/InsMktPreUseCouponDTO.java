package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销预核销权益
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class InsMktPreUseCouponDTO extends AlipayObject {

	private static final long serialVersionUID = 3297746155458276154L;

	/**
	 * 资产Id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 权益id
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益值
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * 是否支持预核销
	 */
	@ApiField("pre_use")
	private Boolean preUse;

	/**
	 * 预核销失败原因
	 */
	@ApiField("reason")
	private String reason;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getCouponId() {
		return this.couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCouponType() {
		return this.couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getCouponValue() {
		return this.couponValue;
	}
	public void setCouponValue(String couponValue) {
		this.couponValue = couponValue;
	}

	public Boolean getPreUse() {
		return this.preUse;
	}
	public void setPreUse(Boolean preUse) {
		this.preUse = preUse;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
