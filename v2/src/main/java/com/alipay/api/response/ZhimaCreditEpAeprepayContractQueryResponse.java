package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.aeprepay.contract.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-16 19:16:41
 */
public class ZhimaCreditEpAeprepayContractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6716516592243527557L;

	/** 
	 * 是否准入
	 */
	@ApiField("admitted")
	private Boolean admitted;

	/** 
	 * 授信额度=盖帽，币种最小单位-分
	 */
	@ApiField("credit_limit_amount")
	private Long creditLimitAmount;

	/** 
	 * 授信额度币种
	 */
	@ApiField("credit_limit_currency")
	private String creditLimitCurrency;

	/** 
	 * 不准入原因
	 */
	@ApiField("denied_reason")
	private String deniedReason;

	/** 
	 * 可贷金额=(盖帽-占用)，
币种最小单位-分
	 */
	@ApiField("loanable_amount")
	private Long loanableAmount;

	/** 
	 * 可贷金额币种
	 */
	@ApiField("loanable_currency")
	private String loanableCurrency;

	/** 
	 * 是否签约
	 */
	@ApiField("signed")
	private Boolean signed;

	/** 
	 * 是否解约
	 */
	@ApiField("unsigned")
	private Boolean unsigned;

	/** 
	 * 解约时间
	 */
	@ApiField("unsigned_date")
	private Date unsignedDate;

	public void setAdmitted(Boolean admitted) {
		this.admitted = admitted;
	}
	public Boolean getAdmitted( ) {
		return this.admitted;
	}

	public void setCreditLimitAmount(Long creditLimitAmount) {
		this.creditLimitAmount = creditLimitAmount;
	}
	public Long getCreditLimitAmount( ) {
		return this.creditLimitAmount;
	}

	public void setCreditLimitCurrency(String creditLimitCurrency) {
		this.creditLimitCurrency = creditLimitCurrency;
	}
	public String getCreditLimitCurrency( ) {
		return this.creditLimitCurrency;
	}

	public void setDeniedReason(String deniedReason) {
		this.deniedReason = deniedReason;
	}
	public String getDeniedReason( ) {
		return this.deniedReason;
	}

	public void setLoanableAmount(Long loanableAmount) {
		this.loanableAmount = loanableAmount;
	}
	public Long getLoanableAmount( ) {
		return this.loanableAmount;
	}

	public void setLoanableCurrency(String loanableCurrency) {
		this.loanableCurrency = loanableCurrency;
	}
	public String getLoanableCurrency( ) {
		return this.loanableCurrency;
	}

	public void setSigned(Boolean signed) {
		this.signed = signed;
	}
	public Boolean getSigned( ) {
		return this.signed;
	}

	public void setUnsigned(Boolean unsigned) {
		this.unsigned = unsigned;
	}
	public Boolean getUnsigned( ) {
		return this.unsigned;
	}

	public void setUnsignedDate(Date unsignedDate) {
		this.unsignedDate = unsignedDate;
	}
	public Date getUnsignedDate( ) {
		return this.unsignedDate;
	}

}
