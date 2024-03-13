package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用数据产品企业四要素匹配核验
 *
 * @author auto create
 * @since 1.0, 2024-01-11 14:02:50
 */
public class ZhimaCreditEpDataproductFourelementMatchModel extends AlipayObject {

	private static final long serialVersionUID = 6248765378891173769L;

	/**
	 * 企业统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 企业名称
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
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 企业注册号
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
