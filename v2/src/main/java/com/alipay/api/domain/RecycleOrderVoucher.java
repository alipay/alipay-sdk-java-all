package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收订单可用券
 *
 * @author auto create
 * @since 1.0, 2026-05-21 17:48:31
 */
public class RecycleOrderVoucher extends AlipayObject {

	private static final long serialVersionUID = 4685491872689349182L;

	/**
	 * 券封顶金额
	 */
	@ApiField("voucher_ceiling_amount")
	private String voucherCeilingAmount;

	/**
	 * 券过期时间
	 */
	@ApiField("voucher_expire_time")
	private String voucherExpireTime;

	/**
	 * 券门槛金额
	 */
	@ApiField("voucher_floor_amount")
	private String voucherFloorAmount;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券领取时间
	 */
	@ApiField("voucher_receive_time")
	private String voucherReceiveTime;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getVoucherCeilingAmount() {
		return this.voucherCeilingAmount;
	}
	public void setVoucherCeilingAmount(String voucherCeilingAmount) {
		this.voucherCeilingAmount = voucherCeilingAmount;
	}

	public String getVoucherExpireTime() {
		return this.voucherExpireTime;
	}
	public void setVoucherExpireTime(String voucherExpireTime) {
		this.voucherExpireTime = voucherExpireTime;
	}

	public String getVoucherFloorAmount() {
		return this.voucherFloorAmount;
	}
	public void setVoucherFloorAmount(String voucherFloorAmount) {
		this.voucherFloorAmount = voucherFloorAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherReceiveTime() {
		return this.voucherReceiveTime;
	}
	public void setVoucherReceiveTime(String voucherReceiveTime) {
		this.voucherReceiveTime = voucherReceiveTime;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
