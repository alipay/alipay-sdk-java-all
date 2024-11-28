package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 折扣券详情
 *
 * @author auto create
 * @since 1.0, 2023-11-01 19:38:07
 */
public class DiscountVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 8219767771727874968L;

	/**
	 * 封顶金额。
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 折扣率。
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 门槛金额。说明：该字段可不填，认为无门槛;
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 优惠门槛信息
	 */
	@ApiField("voucher_deduct_threshold_info")
	private VoucherDeductThresholdInfo voucherDeductThresholdInfo;

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public VoucherDeductThresholdInfo getVoucherDeductThresholdInfo() {
		return this.voucherDeductThresholdInfo;
	}
	public void setVoucherDeductThresholdInfo(VoucherDeductThresholdInfo voucherDeductThresholdInfo) {
		this.voucherDeductThresholdInfo = voucherDeductThresholdInfo;
	}

}
