package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员权益券列表
 *
 * @author auto create
 * @since 1.0, 2025-07-03 13:46:08
 */
public class VoucherList extends AlipayObject {

	private static final long serialVersionUID = 7187267522699364142L;

	/**
	 * 券模版id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 券状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券金额
	 */
	@ApiField("voucher_amount")
	private String voucherAmount;

	/**
	 * 券的实例id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoucherAmount() {
		return this.voucherAmount;
	}
	public void setVoucherAmount(String voucherAmount) {
		this.voucherAmount = voucherAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
