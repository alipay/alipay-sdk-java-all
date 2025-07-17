package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业法定代表人核验服务
 *
 * @author auto create
 * @since 1.0, 2024-12-13 10:54:41
 */
public class ZhimaCreditEpRelatedPerformanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2545764271321786655L;

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
	 * 自然人证件号（身份证号含护照等其他证件）SHA256加密的密文
	 */
	@ApiField("ry_cert_no_sha_256")
	private String ryCertNoSha256;

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

	public String getRyCertNoSha256() {
		return this.ryCertNoSha256;
	}
	public void setRyCertNoSha256(String ryCertNoSha256) {
		this.ryCertNoSha256 = ryCertNoSha256;
	}

	public String getRyName() {
		return this.ryName;
	}
	public void setRyName(String ryName) {
		this.ryName = ryName;
	}

}
