package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 复制模板版本
 *
 * @author auto create
 * @since 1.0, 2025-01-10 15:49:49
 */
public class AlipaySecurityProdTemplateVersionCopyModel extends AlipayObject {

	private static final long serialVersionUID = 3144681237842265615L;

	/**
	 * 操作人工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 模板版本唯一标识
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
