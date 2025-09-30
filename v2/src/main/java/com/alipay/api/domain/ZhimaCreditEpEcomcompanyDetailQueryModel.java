package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商企业明细数据查询
 *
 * @author auto create
 * @since 1.0, 2025-02-20 15:11:21
 */
public class ZhimaCreditEpEcomcompanyDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7833969228756341324L;

	/**
	 * 授权编号
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * 企业查询key：社会统一信用代码、注册号、企业名入参，建议优先使用统代
	 */
	@ApiField("company_key")
	private String companyKey;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAuthId() {
		return this.authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getCompanyKey() {
		return this.companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
