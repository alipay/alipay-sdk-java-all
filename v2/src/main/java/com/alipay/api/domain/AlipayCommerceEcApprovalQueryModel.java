package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询审批单详情
 *
 * @author auto create
 * @since 1.0, 2023-02-06 11:16:15
 */
public class AlipayCommerceEcApprovalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4569579646451387584L;

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
