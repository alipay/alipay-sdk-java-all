package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业认证记录
 *
 * @author auto create
 * @since 1.0, 2023-06-07 19:31:21
 */
public class AlipayCommerceEcEnterpriseAuthapplyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6654832733585473499L;

	/**
	 * 企业认证申请记录ID
	 */
	@ApiField("auth_apply_id")
	private String authApplyId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getAuthApplyId() {
		return this.authApplyId;
	}
	public void setAuthApplyId(String authApplyId) {
		this.authApplyId = authApplyId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
