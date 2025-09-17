package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金专户开通
 *
 * @author auto create
 * @since 1.0, 2024-12-31 15:31:17
 */
public class AlipayCommerceEcTransAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5392441998221784746L;

	/**
	 * 账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 应用场景码
	 */
	@ApiField("scene")
	private String scene;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
