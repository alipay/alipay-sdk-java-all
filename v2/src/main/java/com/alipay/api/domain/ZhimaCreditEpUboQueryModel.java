package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受益所有人信息查询服务
 *
 * @author auto create
 * @since 1.0, 2026-10-28 11:07:58
 */
public class ZhimaCreditEpUboQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7414783536497481184L;

	/**
	 * 可以是统代、公司名称、注册号中的任一
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
