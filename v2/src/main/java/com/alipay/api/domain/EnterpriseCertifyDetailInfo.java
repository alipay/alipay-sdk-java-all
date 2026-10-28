package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业四要素人脸认证详情
 *
 * @author auto create
 * @since 1.0, 2026-10-21 20:43:47
 */
public class EnterpriseCertifyDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2754183593674286567L;

	/**
	 * 认证完成时间
	 */
	@ApiField("certify_end_time")
	private String certifyEndTime;

	/**
	 * 企业认证单号
	 */
	@ApiField("certify_order_no")
	private String certifyOrderNo;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 企业名称
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
	 * 客户请求号，外部请求幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 认证状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 认证状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public String getCertifyEndTime() {
		return this.certifyEndTime;
	}
	public void setCertifyEndTime(String certifyEndTime) {
		this.certifyEndTime = certifyEndTime;
	}

	public String getCertifyOrderNo() {
		return this.certifyOrderNo;
	}
	public void setCertifyOrderNo(String certifyOrderNo) {
		this.certifyOrderNo = certifyOrderNo;
	}

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getLegalRepresentativeIdNoPostfix() {
		return this.legalRepresentativeIdNoPostfix;
	}
	public void setLegalRepresentativeIdNoPostfix(String legalRepresentativeIdNoPostfix) {
		this.legalRepresentativeIdNoPostfix = legalRepresentativeIdNoPostfix;
	}

	public String getLegalRepresentativeName() {
		return this.legalRepresentativeName;
	}
	public void setLegalRepresentativeName(String legalRepresentativeName) {
		this.legalRepresentativeName = legalRepresentativeName;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
