package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业抬头删除
 *
 * @author auto create
 * @since 1.0, 2025-06-03 10:19:36
 */
public class AlipayCommerceEcEmployerTitleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6776888818271751715L;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 抬头ID
	 */
	@ApiField("title_id")
	private String titleId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getTitleId() {
		return this.titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

}
