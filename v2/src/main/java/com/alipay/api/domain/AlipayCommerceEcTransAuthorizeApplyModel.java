package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账签约申请
 *
 * @author auto create
 * @since 1.0, 2023-09-25 17:38:30
 */
public class AlipayCommerceEcTransAuthorizeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8448733791277263414L;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
