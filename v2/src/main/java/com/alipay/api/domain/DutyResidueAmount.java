package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商保支付-查询用户保单信息-责任剩余保额
 *
 * @author auto create
 * @since 1.0, 2025-03-05 11:30:46
 */
public class DutyResidueAmount extends AlipayObject {

	private static final long serialVersionUID = 7373156133118329464L;

	/**
	 * 理赔责任编码
	 */
	@ApiField("claim_duty_code")
	private String claimDutyCode;

	/**
	 * 理赔责任名称
	 */
	@ApiField("claim_duty_name")
	private String claimDutyName;

	/**
	 * 单位：元 保留俩位小数
	 */
	@ApiField("duty_deductible_excess")
	private String dutyDeductibleExcess;

	/**
	 * 责任剩余保额，单位：元，保留俩位小数
	 */
	@ApiField("duty_residue_amount")
	private String dutyResidueAmount;

	public String getClaimDutyCode() {
		return this.claimDutyCode;
	}
	public void setClaimDutyCode(String claimDutyCode) {
		this.claimDutyCode = claimDutyCode;
	}

	public String getClaimDutyName() {
		return this.claimDutyName;
	}
	public void setClaimDutyName(String claimDutyName) {
		this.claimDutyName = claimDutyName;
	}

	public String getDutyDeductibleExcess() {
		return this.dutyDeductibleExcess;
	}
	public void setDutyDeductibleExcess(String dutyDeductibleExcess) {
		this.dutyDeductibleExcess = dutyDeductibleExcess;
	}

	public String getDutyResidueAmount() {
		return this.dutyResidueAmount;
	}
	public void setDutyResidueAmount(String dutyResidueAmount) {
		this.dutyResidueAmount = dutyResidueAmount;
	}

}
