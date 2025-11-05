package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤销审批单
 *
 * @author auto create
 * @since 1.0, 2025-03-25 10:54:51
 */
public class AlipayCommerceEcApprovalCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6284531397519877999L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部平台审批单id
	 */
	@ApiField("platform_approval_id")
	private String platformApprovalId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPlatformApprovalId() {
		return this.platformApprovalId;
	}
	public void setPlatformApprovalId(String platformApprovalId) {
		this.platformApprovalId = platformApprovalId;
	}

}
