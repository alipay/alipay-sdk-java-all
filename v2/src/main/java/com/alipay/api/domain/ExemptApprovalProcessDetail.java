package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 豁免申请流程
 *
 * @author auto create
 * @since 1.0, 2023-03-21 17:44:59
 */
public class ExemptApprovalProcessDetail extends AlipayObject {

	private static final long serialVersionUID = 8844937783388346621L;

	/**
	 * 豁免申请流程状态
	 */
	@ApiField("exempt_approval_process_state")
	private String exemptApprovalProcessState;

	/**
	 * 豁免申请流程链接
	 */
	@ApiField("exempt_approval_process_url")
	private String exemptApprovalProcessUrl;

	public String getExemptApprovalProcessState() {
		return this.exemptApprovalProcessState;
	}
	public void setExemptApprovalProcessState(String exemptApprovalProcessState) {
		this.exemptApprovalProcessState = exemptApprovalProcessState;
	}

	public String getExemptApprovalProcessUrl() {
		return this.exemptApprovalProcessUrl;
	}
	public void setExemptApprovalProcessUrl(String exemptApprovalProcessUrl) {
		this.exemptApprovalProcessUrl = exemptApprovalProcessUrl;
	}

}
