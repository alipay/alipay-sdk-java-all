package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工卡租赁协议信息
 *
 * @author auto create
 * @since 1.0, 2024-08-19 11:20:19
 */
public class RentServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 3898587355275231821L;

	/**
	 * 资方信息
	 */
	@ApiField("capital_principal")
	private ParticipantInfoDTO capitalPrincipal;

	/**
	 * 邀请方
	 */
	@ApiField("invite_principal")
	private ParticipantInfoDTO invitePrincipal;

	/**
	 * 租金，单位：元
	 */
	@ApiField("repayment_amount")
	private String repaymentAmount;

	/**
	 * 还款截止时间
	 */
	@ApiField("repayment_end_time")
	private String repaymentEndTime;

	/**
	 * 扣款周期次数（期）
	 */
	@ApiField("repayment_period")
	private String repaymentPeriod;

	/**
	 * 扣款周期类型
	 */
	@ApiField("repayment_period_type")
	private String repaymentPeriodType;

	public ParticipantInfoDTO getCapitalPrincipal() {
		return this.capitalPrincipal;
	}
	public void setCapitalPrincipal(ParticipantInfoDTO capitalPrincipal) {
		this.capitalPrincipal = capitalPrincipal;
	}

	public ParticipantInfoDTO getInvitePrincipal() {
		return this.invitePrincipal;
	}
	public void setInvitePrincipal(ParticipantInfoDTO invitePrincipal) {
		this.invitePrincipal = invitePrincipal;
	}

	public String getRepaymentAmount() {
		return this.repaymentAmount;
	}
	public void setRepaymentAmount(String repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}

	public String getRepaymentEndTime() {
		return this.repaymentEndTime;
	}
	public void setRepaymentEndTime(String repaymentEndTime) {
		this.repaymentEndTime = repaymentEndTime;
	}

	public String getRepaymentPeriod() {
		return this.repaymentPeriod;
	}
	public void setRepaymentPeriod(String repaymentPeriod) {
		this.repaymentPeriod = repaymentPeriod;
	}

	public String getRepaymentPeriodType() {
		return this.repaymentPeriodType;
	}
	public void setRepaymentPeriodType(String repaymentPeriodType) {
		this.repaymentPeriodType = repaymentPeriodType;
	}

}
