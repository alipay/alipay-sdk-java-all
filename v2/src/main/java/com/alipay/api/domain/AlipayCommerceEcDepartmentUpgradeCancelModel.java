package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消部门升级
 *
 * @author auto create
 * @since 1.0, 2024-07-22 17:44:21
 */
public class AlipayCommerceEcDepartmentUpgradeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3155193543211843922L;

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
