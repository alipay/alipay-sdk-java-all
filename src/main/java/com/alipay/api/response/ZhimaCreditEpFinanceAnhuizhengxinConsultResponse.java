package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.finance.anhuizhengxin.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-08 10:54:15
 */
public class ZhimaCreditEpFinanceAnhuizhengxinConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1692195919945118625L;

	/** 
	 * 是否准入
	 */
	@ApiField("apply_admit")
	private String applyAdmit;

	/** 
	 * 建议额度
	 */
	@ApiField("credit_amt")
	private String creditAmt;

	/** 
	 * 事件请求id
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 企业证件号
	 */
	@ApiField("org_cert_no")
	private String orgCertNo;

	/** 
	 * 枚举值，{"uc_code": 统一社会信用代码，"reg_no":工商注册号, "org_code":组织机构代码}
	 */
	@ApiField("org_cert_type")
	private String orgCertType;

	/** 
	 * 企业名
	 */
	@ApiField("org_name")
	private String orgName;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 芝麻企业信用评级
枚举值，{"AAA":[1700,2000],"AA":[1650,1700),"A":[1600,1650),"BBB":[1550,1600),"BB：[1500,1550),"B":[1450,1500),"CCC":[1400,1450),"CC":[1350,1400),"C":[1300,1350),"D":[1000,1300)}
	 */
	@ApiField("zm_credit_rank")
	private String zmCreditRank;

	public void setApplyAdmit(String applyAdmit) {
		this.applyAdmit = applyAdmit;
	}
	public String getApplyAdmit( ) {
		return this.applyAdmit;
	}

	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}
	public String getCreditAmt( ) {
		return this.creditAmt;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setOrgCertNo(String orgCertNo) {
		this.orgCertNo = orgCertNo;
	}
	public String getOrgCertNo( ) {
		return this.orgCertNo;
	}

	public void setOrgCertType(String orgCertType) {
		this.orgCertType = orgCertType;
	}
	public String getOrgCertType( ) {
		return this.orgCertType;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgName( ) {
		return this.orgName;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setZmCreditRank(String zmCreditRank) {
		this.zmCreditRank = zmCreditRank;
	}
	public String getZmCreditRank( ) {
		return this.zmCreditRank;
	}

}
