package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组织机构四要素核验
 *
 * @author auto create
 * @since 1.0, 2024-02-29 15:18:55
 */
public class ZhimaCreditEpOrgfourelementsMatchModel extends AlipayObject {

	private static final long serialVersionUID = 1857689627132311957L;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 机构名称
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 法人证件号
	 */
	@ApiField("fr_cert_no")
	private String frCertNo;

	/**
	 * 法人姓名
	 */
	@ApiField("fr_name")
	private String frName;

	/**
	 * 组织机构代码
	 */
	@ApiField("org_no")
	private String orgNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 机构注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getFrCertNo() {
		return this.frCertNo;
	}
	public void setFrCertNo(String frCertNo) {
		this.frCertNo = frCertNo;
	}

	public String getFrName() {
		return this.frName;
	}
	public void setFrName(String frName) {
		this.frName = frName;
	}

	public String getOrgNo() {
		return this.orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

}
