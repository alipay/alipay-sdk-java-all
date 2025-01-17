package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 半份签人工审核结果查询
 *
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:27
 */
public class AlipayBossProdAntlescenterPartcontractreviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6198529617444595912L;

	/**
	 * 审核类型
	 */
	@ApiField("audit_type")
	private String auditType;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	public String getAuditType() {
		return this.auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

}
