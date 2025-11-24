package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询审批单详情
 *
 * @author auto create
 * @since 1.0, 2025-08-06 11:03:35
 */
public class AlipayCommerceEcApprovalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8791834841756535693L;

	/**
	 * 企业码申请单单唯一ID
	 */
	@ApiField("approval_id")
	private String approvalId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部平台申请单id
	 */
	@ApiField("platform_approval_id")
	private String platformApprovalId;

	public String getApprovalId() {
		return this.approvalId;
	}
	public void setApprovalId(String approvalId) {
		this.approvalId = approvalId;
	}

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
