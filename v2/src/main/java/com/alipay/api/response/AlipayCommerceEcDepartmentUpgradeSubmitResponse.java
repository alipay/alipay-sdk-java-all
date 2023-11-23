package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.department.upgrade.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-01 10:31:49
 */
public class AlipayCommerceEcDepartmentUpgradeSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7223541746113389939L;

	/** 
	 * 部门提交升级后的工单id
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 子企业签约因公付链接
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
