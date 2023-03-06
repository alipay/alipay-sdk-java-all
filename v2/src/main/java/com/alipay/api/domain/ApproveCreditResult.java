package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审批通过后返回的授信信息
 *
 * @author auto create
 * @since 1.0, 2017-05-31 13:44:00
 */
public class ApproveCreditResult extends AlipayObject {

	private static final long serialVersionUID = 4157728632983341835L;

	/**
	 * 费用列表，每个费用对象代码一个收费项； 若费用列表为空或空集合，表示不存在费用定价
	 */
	@ApiListField("charge_info_list")
	@ApiField("loan_charge_info")
	private List<LoanChargeInfo> chargeInfoList;

	/**
	 * 授信金额
	 */
	@ApiField("credit_amt")
	private String creditAmt;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 授信期限长度，包含单位(年、月、日)
	 */
	@ApiField("credit_term")
	private String creditTerm;

	/**
	 * 授信有效截止日期(日期精度为天,包含截止日)
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 利率
	 */
	@ApiListField("instal_int_rate")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> instalIntRate;

	/**
	 * 贷款期限长度，包含单位(年、月、日)
	 */
	@ApiField("loan_term")
	private String loanTerm;

	/**
	 * 还款方式。若为分段还款，则存储的为分段还款方式的分段值。否则，该list仅含一个元素，为当前的还款方式
	 */
	@ApiListField("repay_modes")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> repayModes;

	/**
	 * 授信有效起始日期(日期精度为天,包含起始日)
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 授信状态
	 */
	@ApiField("status")
	private String status;

	public List<LoanChargeInfo> getChargeInfoList() {
		return this.chargeInfoList;
	}
	public void setChargeInfoList(List<LoanChargeInfo> chargeInfoList) {
		this.chargeInfoList = chargeInfoList;
	}

	public String getCreditAmt() {
		return this.creditAmt;
	}
	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}

	public String getCreditNo() {
		return this.creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public String getCreditTerm() {
		return this.creditTerm;
	}
	public void setCreditTerm(String creditTerm) {
		this.creditTerm = creditTerm;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public List<InstallmentMetaInfo> getInstalIntRate() {
		return this.instalIntRate;
	}
	public void setInstalIntRate(List<InstallmentMetaInfo> instalIntRate) {
		this.instalIntRate = instalIntRate;
	}

	public String getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

	public List<InstallmentMetaInfo> getRepayModes() {
		return this.repayModes;
	}
	public void setRepayModes(List<InstallmentMetaInfo> repayModes) {
		this.repayModes = repayModes;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
