package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动打卡白名单类型列表查询
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:27:49
 */
public class AlipayCommerceEducateSportsWhitetypeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5665719271263989491L;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

}
