package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满减券
 *
 * @author auto create
 * @since 1.0, 2026-10-27 15:38:24
 */
public class FixVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 1527361915557647578L;

	/**
	 * 面额，每张代金券可以抵扣的金额。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 门槛金额。该字段不填写，认为无门槛。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 门槛件数。该字段不填写，认为无门槛。取值范围：[1,9999]
	 */
	@ApiField("floor_count")
	private Long floorCount;

	/**
	 * 优惠门槛信息
	 */
	@ApiField("voucher_deduct_threshold_info")
	private VoucherDeductThresholdInfo voucherDeductThresholdInfo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public Long getFloorCount() {
		return this.floorCount;
	}
	public void setFloorCount(Long floorCount) {
		this.floorCount = floorCount;
	}

	public VoucherDeductThresholdInfo getVoucherDeductThresholdInfo() {
		return this.voucherDeductThresholdInfo;
	}
	public void setVoucherDeductThresholdInfo(VoucherDeductThresholdInfo voucherDeductThresholdInfo) {
		this.voucherDeductThresholdInfo = voucherDeductThresholdInfo;
	}

}
