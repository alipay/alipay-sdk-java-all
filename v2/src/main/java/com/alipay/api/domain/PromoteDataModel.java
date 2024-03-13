package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广数据结构
 *
 * @author auto create
 * @since 1.0, 2017-02-16 20:40:10
 */
public class PromoteDataModel extends AlipayObject {

	private static final long serialVersionUID = 8367834371747441844L;

	/**
	 * 核销数
	 */
	@ApiField("checked_voucher_num")
	private Long checkedVoucherNum;

	/**
	 * 领券数
	 */
	@ApiField("claim_voucher_num")
	private Long claimVoucherNum;

	/**
	 * 分佣金额
	 */
	@ApiField("commission_amount")
	private String commissionAmount;

	public Long getCheckedVoucherNum() {
		return this.checkedVoucherNum;
	}
	public void setCheckedVoucherNum(Long checkedVoucherNum) {
		this.checkedVoucherNum = checkedVoucherNum;
	}

	public Long getClaimVoucherNum() {
		return this.claimVoucherNum;
	}
	public void setClaimVoucherNum(Long claimVoucherNum) {
		this.claimVoucherNum = claimVoucherNum;
	}

	public String getCommissionAmount() {
		return this.commissionAmount;
	}
	public void setCommissionAmount(String commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

}
