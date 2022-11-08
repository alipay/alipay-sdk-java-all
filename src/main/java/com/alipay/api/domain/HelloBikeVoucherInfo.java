package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券信息
 *
 * @author auto create
 * @since 1.0, 2022-03-22 13:19:15
 */
public class HelloBikeVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 3314971696355564283L;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 券价格
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 券剩余有效期
	 */
	@ApiField("valid_time")
	private Long validTime;

	/**
	 * 券描述
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券状态
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getValidTime() {
		return this.validTime;
	}
	public void setValidTime(Long validTime) {
		this.validTime = validTime;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

}
