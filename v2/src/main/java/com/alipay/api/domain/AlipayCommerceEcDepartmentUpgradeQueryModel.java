package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询部门升级
 *
 * @author auto create
 * @since 1.0, 2024-01-17 14:43:11
 */
public class AlipayCommerceEcDepartmentUpgradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2752168381458734344L;

	/**
	 * 主企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 升级工单id
	 */
	@ApiField("process_id")
	private String processId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

}
