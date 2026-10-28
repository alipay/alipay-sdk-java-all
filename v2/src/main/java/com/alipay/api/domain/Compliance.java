package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风控结果
 *
 * @author auto create
 * @since 1.0, 2026-10-19 19:42:55
 */
public class Compliance extends AlipayObject {

	private static final long serialVersionUID = 6899199752129922951L;

	/**
	 * 检查结果，枚举参考 com.alipay.igtransferprod.common.service.facade.enums.ComplianceCheckStatus
	 */
	@ApiField("compliance_check_status")
	private String complianceCheckStatus;

	/**
	 * 风控详情code，枚举参考 com.alipay.igtransferprod.common.service.facade.enums.ComplianceDetailEnum
	 */
	@ApiField("compliance_detail_code")
	private String complianceDetailCode;

	/**
	 * 风控详情msg，枚举参考 com.alipay.igtransferprod.common.service.facade.enums.ComplianceDetailEnum
	 */
	@ApiField("compliance_detail_msg")
	private String complianceDetailMsg;

	/**
	 * 举证类型，枚举参考 com.alipay.igtransferprod.common.service.facade.enums.EvidenceType
	 */
	@ApiField("evidence_type")
	private String evidenceType;

	public String getComplianceCheckStatus() {
		return this.complianceCheckStatus;
	}
	public void setComplianceCheckStatus(String complianceCheckStatus) {
		this.complianceCheckStatus = complianceCheckStatus;
	}

	public String getComplianceDetailCode() {
		return this.complianceDetailCode;
	}
	public void setComplianceDetailCode(String complianceDetailCode) {
		this.complianceDetailCode = complianceDetailCode;
	}

	public String getComplianceDetailMsg() {
		return this.complianceDetailMsg;
	}
	public void setComplianceDetailMsg(String complianceDetailMsg) {
		this.complianceDetailMsg = complianceDetailMsg;
	}

	public String getEvidenceType() {
		return this.evidenceType;
	}
	public void setEvidenceType(String evidenceType) {
		this.evidenceType = evidenceType;
	}

}
