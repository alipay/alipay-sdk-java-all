package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业SPU品类查询服务专用版
 *
 * @author auto create
 * @since 1.0, 2024-10-23 16:27:17
 */
public class ZhimaCreditEpSpuinfoSpecificQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6417218859279786796L;

	/**
	 * 社会统一信用代码、注册号、企业名可任选一个入参，建议优先使用统代
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
