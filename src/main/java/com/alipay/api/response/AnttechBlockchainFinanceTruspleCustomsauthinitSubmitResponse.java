package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.trusple.customsauthinit.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-13 16:56:49
 */
public class AnttechBlockchainFinanceTruspleCustomsauthinitSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5391162593948844564L;

	/** 
	 * 客户数据授权协议书编号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * Y表示需要认证，N表示不需要
	 */
	@ApiField("auth_required")
	private String authRequired;

	/** 
	 * 报关数据认证起始日期(不包含此日期)，格式为：yyyymmdd
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 组织机构代码
	 */
	@ApiField("org_code")
	private String orgCode;

	/** 
	 * 报关数据认证起始日期(包含此日期)，格式为：yyyymmdd
	 */
	@ApiField("start_date")
	private String startDate;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAuthRequired(String authRequired) {
		this.authRequired = authRequired;
	}
	public String getAuthRequired( ) {
		return this.authRequired;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate( ) {
		return this.endDate;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgCode( ) {
		return this.orgCode;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate( ) {
		return this.startDate;
	}

}
