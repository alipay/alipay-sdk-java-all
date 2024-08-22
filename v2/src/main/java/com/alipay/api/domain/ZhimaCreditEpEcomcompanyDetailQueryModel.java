package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商企业明细数据查询
 *
 * @author auto create
 * @since 1.0, 2024-08-12 15:01:25
 */
public class ZhimaCreditEpEcomcompanyDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8526735374425717112L;

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
