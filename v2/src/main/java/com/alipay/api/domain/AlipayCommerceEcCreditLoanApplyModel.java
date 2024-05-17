package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业授信借款申请
 *
 * @author auto create
 * @since 1.0, 2024-04-25 15:52:10
 */
public class AlipayCommerceEcCreditLoanApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2733365338833722517L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 授信渠道编码
	 */
	@ApiField("credit_channel_code")
	private String creditChannelCode;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 借贷申请金额，单位元
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 外部业务申请单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getCreditChannelCode() {
		return this.creditChannelCode;
	}
	public void setCreditChannelCode(String creditChannelCode) {
		this.creditChannelCode = creditChannelCode;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
