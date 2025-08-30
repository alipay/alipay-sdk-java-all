package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业风险特征查询数据产品
 *
 * @author auto create
 * @since 1.0, 2025-07-23 10:04:51
 */
public class ZhimaCreditEpIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5284358277256411316L;

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
