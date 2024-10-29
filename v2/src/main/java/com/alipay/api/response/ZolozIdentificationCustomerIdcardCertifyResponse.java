package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertAuditResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.idcard.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:12
 */
public class ZolozIdentificationCustomerIdcardCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1447683449221634852L;

	/** 
	 * 证件宝审核结果
	 */
	@ApiListField("cert_audit_result")
	@ApiField("cert_audit_result")
	private List<CertAuditResult> certAuditResult;

	/** 
	 * 业务校验是否通过
	 */
	@ApiField("passed")
	private Boolean passed;

	/** 
	 * 全流程上下文唯一id
	 */
	@ApiField("token")
	private String token;

	public void setCertAuditResult(List<CertAuditResult> certAuditResult) {
		this.certAuditResult = certAuditResult;
	}
	public List<CertAuditResult> getCertAuditResult( ) {
		return this.certAuditResult;
	}

	public void setPassed(Boolean passed) {
		this.passed = passed;
	}
	public Boolean getPassed( ) {
		return this.passed;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
