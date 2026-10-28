package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.enterprisecertify.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-22 18:32:58
 */
public class AlipayTradeSaasEnterprisecertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6614176269794168539L;

	/** 
	 * 认证时间
	 */
	@ApiField("certify_end_time")
	private String certifyEndTime;

	/** 
	 * 平台企业认证单号
	 */
	@ApiField("certify_order_no")
	private String certifyOrderNo;

	/** 
	 * 统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/** 
	 * 认证企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/** 
	 * 法人身份证尾号
	 */
	@ApiField("legal_representative_id_no_postfix")
	private String legalRepresentativeIdNoPostfix;

	/** 
	 * 法人姓名
	 */
	@ApiField("legal_representative_name")
	private String legalRepresentativeName;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 认证状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 根据本地状态即时映射的安全描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public void setCertifyEndTime(String certifyEndTime) {
		this.certifyEndTime = certifyEndTime;
	}
	public String getCertifyEndTime( ) {
		return this.certifyEndTime;
	}

	public void setCertifyOrderNo(String certifyOrderNo) {
		this.certifyOrderNo = certifyOrderNo;
	}
	public String getCertifyOrderNo( ) {
		return this.certifyOrderNo;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}
	public String getCreditCode( ) {
		return this.creditCode;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getEnterpriseName( ) {
		return this.enterpriseName;
	}

	public void setLegalRepresentativeIdNoPostfix(String legalRepresentativeIdNoPostfix) {
		this.legalRepresentativeIdNoPostfix = legalRepresentativeIdNoPostfix;
	}
	public String getLegalRepresentativeIdNoPostfix( ) {
		return this.legalRepresentativeIdNoPostfix;
	}

	public void setLegalRepresentativeName(String legalRepresentativeName) {
		this.legalRepresentativeName = legalRepresentativeName;
	}
	public String getLegalRepresentativeName( ) {
		return this.legalRepresentativeName;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getStatusDesc( ) {
		return this.statusDesc;
	}

}
