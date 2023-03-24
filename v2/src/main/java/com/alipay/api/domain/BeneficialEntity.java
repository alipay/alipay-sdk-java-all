package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受益/实控的实体，可能是公司或者个人
 *
 * @author auto create
 * @since 1.0, 2021-04-13 11:07:22
 */
public class BeneficialEntity extends AlipayObject {

	private static final long serialVersionUID = 6267676847459145384L;

	/**
	 * 证件有效期开始日,格式（yyyy-MM-dd）
	 */
	@ApiField("cert_effective_date")
	private String certEffectiveDate;

	/**
	 * 证件有效期到期日,格式（yyyy-MM-dd）,其中long 长期
	 */
	@ApiField("cert_expiration_date")
	private String certExpirationDate;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，RESIDENT-居民身份证，NATIONAL_LEGAL-全国法人营业执照，NATIONAL_LEGAL_MERGE-全国法人营业执照-多证合一
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 实体名称
	 */
	@ApiField("name")
	private String name;

	public String getCertEffectiveDate() {
		return this.certEffectiveDate;
	}
	public void setCertEffectiveDate(String certEffectiveDate) {
		this.certEffectiveDate = certEffectiveDate;
	}

	public String getCertExpirationDate() {
		return this.certExpirationDate;
	}
	public void setCertExpirationDate(String certExpirationDate) {
		this.certExpirationDate = certExpirationDate;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
