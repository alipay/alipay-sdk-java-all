package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 特价券详情
 *
 * @author auto create
 * @since 1.0, 2023-03-30 16:17:29
 */
public class SpecialVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6134385698795729423L;

	/**
	 * 门槛金额。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 特价，即：原价-特价=优惠金额。
	 */
	@ApiField("special_amount")
	private String specialAmount;

	/**
	 * 优惠门槛信息
	 */
	@ApiField("voucher_deduct_threshold_info")
	private VoucherDeductThresholdInfo voucherDeductThresholdInfo;

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getSpecialAmount() {
		return this.specialAmount;
	}
	public void setSpecialAmount(String specialAmount) {
		this.specialAmount = specialAmount;
	}

	public VoucherDeductThresholdInfo getVoucherDeductThresholdInfo() {
		return this.voucherDeductThresholdInfo;
	}
	public void setVoucherDeductThresholdInfo(VoucherDeductThresholdInfo voucherDeductThresholdInfo) {
		this.voucherDeductThresholdInfo = voucherDeductThresholdInfo;
	}

}
