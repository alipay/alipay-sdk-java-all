package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国内电商企业明细数据查询_法人入参
 *
 * @author auto create
 * @since 1.0, 2026-04-01 15:57:45
 */
public class ZhimaCreditEpEcomdetailPersonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1522972487864712126L;

	/**
	 * 授权编号
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * 法人证件号
	 */
	@ApiField("person_cert_no")
	private String personCertNo;

	/**
	 * 法人证件号md5值
	 */
	@ApiField("person_cert_no_md_5")
	private String personCertNoMd5;

	/**
	 * 法人证件号SHA256加密的密文
	 */
	@ApiField("person_cert_no_sha_256")
	private String personCertNoSha256;

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

	public String getPersonCertNo() {
		return this.personCertNo;
	}
	public void setPersonCertNo(String personCertNo) {
		this.personCertNo = personCertNo;
	}

	public String getPersonCertNoMd5() {
		return this.personCertNoMd5;
	}
	public void setPersonCertNoMd5(String personCertNoMd5) {
		this.personCertNoMd5 = personCertNoMd5;
	}

	public String getPersonCertNoSha256() {
		return this.personCertNoSha256;
	}
	public void setPersonCertNoSha256(String personCertNoSha256) {
		this.personCertNoSha256 = personCertNoSha256;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
