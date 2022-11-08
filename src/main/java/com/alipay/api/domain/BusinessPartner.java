package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构信息
 *
 * @author auto create
 * @since 1.0, 2020-06-17 18:10:30
 */
public class BusinessPartner extends AlipayObject {

	private static final long serialVersionUID = 5198557345537979697L;

	/**
	 * 机构本地名称
	 */
	@ApiField("business_local_name")
	private String businessLocalName;

	/**
	 * 商业合作伙伴别名，一般业务场景下所使用，对商户的简称、缩写或别称
	 */
	@ApiField("business_name")
	private String businessName;

	/**
	 * Business logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * logo的类型
	 */
	@ApiField("logo_type")
	private String logoType;

	/**
	 * Merchant category code
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 营业地址
	 */
	@ApiField("operation_address")
	private OperationAddress operationAddress;

	public String getBusinessLocalName() {
		return this.businessLocalName;
	}
	public void setBusinessLocalName(String businessLocalName) {
		this.businessLocalName = businessLocalName;
	}

	public String getBusinessName() {
		return this.businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogoType() {
		return this.logoType;
	}
	public void setLogoType(String logoType) {
		this.logoType = logoType;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public OperationAddress getOperationAddress() {
		return this.operationAddress;
	}
	public void setOperationAddress(OperationAddress operationAddress) {
		this.operationAddress = operationAddress;
	}

}
