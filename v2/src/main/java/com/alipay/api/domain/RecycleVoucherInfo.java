package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券信息
 *
 * @author auto create
 * @since 1.0, 2025-11-13 14:22:41
 */
public class RecycleVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 1852718323983291172L;

	/**
	 * 券金额
	 */
	@ApiField("voucher_amount")
	private String voucherAmount;

	/**
	 * 券过期时间
	 */
	@ApiField("voucher_expire_time")
	private String voucherExpireTime;

	/**
	 * 券唯一ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券领取时间
	 */
	@ApiField("voucher_receive_time")
	private String voucherReceiveTime;

	/**
	 * PRE_RECEIVED 预领取 UNRECEIVED未领取 RECEIVED已领取 USED已核销 EXPIRED已过期
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	public String getVoucherAmount() {
		return this.voucherAmount;
	}
	public void setVoucherAmount(String voucherAmount) {
		this.voucherAmount = voucherAmount;
	}

	public String getVoucherExpireTime() {
		return this.voucherExpireTime;
	}
	public void setVoucherExpireTime(String voucherExpireTime) {
		this.voucherExpireTime = voucherExpireTime;
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

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

}
