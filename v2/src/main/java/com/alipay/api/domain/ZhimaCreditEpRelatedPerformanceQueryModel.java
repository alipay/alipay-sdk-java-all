package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业法定代表人核验服务
 *
 * @author auto create
 * @since 1.0, 2024-04-08 17:20:17
 */
public class ZhimaCreditEpRelatedPerformanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7393838367252277217L;

	/**
	 * 企业标识（统一信用代码/注册号/企业名）
	 */
	@ApiField("company_key")
	private String companyKey;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 人员证件号
	 */
	@ApiField("ry_cert_no")
	private String ryCertNo;

	/**
	 * 人员姓名
	 */
	@ApiField("ry_name")
	private String ryName;

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

	public String getRyCertNo() {
		return this.ryCertNo;
	}
	public void setRyCertNo(String ryCertNo) {
		this.ryCertNo = ryCertNo;
	}

	public String getRyName() {
		return this.ryName;
	}
	public void setRyName(String ryName) {
		this.ryName = ryName;
	}

}
