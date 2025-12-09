package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算信息列表
 *
 * @author auto create
 * @since 1.0, 2025-06-24 19:18:35
 */
public class SeltInfoList extends AlipayObject {

	private static final long serialVersionUID = 2471853538314425777L;

	/**
	 * 商保码理赔?额
单位：元
保留俩位?数
	 */
	@ApiField("advance_pay")
	private String advancePay;

	/**
	 * 报销金额
	 */
	@ApiField("claim_amount")
	private String claimAmount;

	/**
	 * 理赔详情URL
	 */
	@ApiField("claim_detail")
	private String claimDetail;

	/**
	 * 理赔状态描述，理赔失败时原因描述
	 */
	@ApiField("claim_status_desc")
	private String claimStatusDesc;

	/**
	 * 还款资金对方账号，保司还款的2088或医院2088或银行卡号
	 */
	@ApiField("fund_opst_ac_nbr")
	private String fundOpstAcNbr;

	/**
	 * 还款资金对方帐号类型，01：银行账户；02：支付宝；03：网商二类户
	 */
	@ApiField("fund_opst_ac_type")
	private String fundOpstAcType;

	/**
	 * 还款资金对方机构
	 */
	@ApiField("fund_opst_org_nm")
	private String fundOpstOrgNm;

	/**
	 * 个?理赔?额
单位：元
保留俩位?数
	 */
	@ApiField("personal_pay")
	private String personalPay;

	/**
	 * 打款时间，YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("repay_time")
	private Date repayTime;

	/**
	 * 结算单编号
	 */
	@ApiField("selt_id")
	private String seltId;

	/**
	 * 还款资金流水号，用来和支付宝账户资金流水进行对账
	 */
	@ApiField("withdraw_no")
	private String withdrawNo;

	public String getAdvancePay() {
		return this.advancePay;
	}
	public void setAdvancePay(String advancePay) {
		this.advancePay = advancePay;
	}

	public String getClaimAmount() {
		return this.claimAmount;
	}
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getClaimDetail() {
		return this.claimDetail;
	}
	public void setClaimDetail(String claimDetail) {
		this.claimDetail = claimDetail;
	}

	public String getClaimStatusDesc() {
		return this.claimStatusDesc;
	}
	public void setClaimStatusDesc(String claimStatusDesc) {
		this.claimStatusDesc = claimStatusDesc;
	}

	public String getFundOpstAcNbr() {
		return this.fundOpstAcNbr;
	}
	public void setFundOpstAcNbr(String fundOpstAcNbr) {
		this.fundOpstAcNbr = fundOpstAcNbr;
	}

	public String getFundOpstAcType() {
		return this.fundOpstAcType;
	}
	public void setFundOpstAcType(String fundOpstAcType) {
		this.fundOpstAcType = fundOpstAcType;
	}

	public String getFundOpstOrgNm() {
		return this.fundOpstOrgNm;
	}
	public void setFundOpstOrgNm(String fundOpstOrgNm) {
		this.fundOpstOrgNm = fundOpstOrgNm;
	}

	public String getPersonalPay() {
		return this.personalPay;
	}
	public void setPersonalPay(String personalPay) {
		this.personalPay = personalPay;
	}

	public Date getRepayTime() {
		return this.repayTime;
	}
	public void setRepayTime(Date repayTime) {
		this.repayTime = repayTime;
	}

	public String getSeltId() {
		return this.seltId;
	}
	public void setSeltId(String seltId) {
		this.seltId = seltId;
	}

	public String getWithdrawNo() {
		return this.withdrawNo;
	}
	public void setWithdrawNo(String withdrawNo) {
		this.withdrawNo = withdrawNo;
	}

}
