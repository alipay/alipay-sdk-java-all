package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用印状态查询接口
 *
 * @author auto create
 * @since 1.0, 2025-03-13 10:49:22
 */
public class AlipayFincoreComplianceSignStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4267287931961314591L;

	/**
	 * 业务单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 用印工单文件编号
	 */
	@ApiField("file_code")
	private String fileCode;

	/**
	 * 系统来源
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getFileCode() {
		return this.fileCode;
	}
	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

}
