package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-12 13:45:14
 */
public class VoucherView extends AlipayObject {

	private static final long serialVersionUID = 1735425792481636559L;

	/**
	 * 满减券优惠面额（元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 最高抵扣金额（折扣券，元）
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 折扣比例（折扣券），单位是小数
	 */
	@ApiField("discount_ratio")
	private String discountRatio;

	/**
	 * 使用门槛金额（元）
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 券有效期结束时间
	 */
	@ApiField("valid_end")
	private String validEnd;

	/**
	 * 券有效期开始时间
	 */
	@ApiField("valid_start")
	private String validStart;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券状态
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDiscountRatio() {
		return this.discountRatio;
	}
	public void setDiscountRatio(String discountRatio) {
		this.discountRatio = discountRatio;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getValidEnd() {
		return this.validEnd;
	}
	public void setValidEnd(String validEnd) {
		this.validEnd = validEnd;
	}

	public String getValidStart() {
		return this.validStart;
	}
	public void setValidStart(String validStart) {
		this.validStart = validStart;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
