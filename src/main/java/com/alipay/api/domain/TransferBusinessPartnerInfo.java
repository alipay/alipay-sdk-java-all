package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息
 *
 * @author auto create
 * @since 1.0, 2021-07-28 12:10:21
 */
public class TransferBusinessPartnerInfo extends AlipayObject {

	private static final long serialVersionUID = 5859629869246311118L;

	/**
	 * 企业本地名称
	 */
	@ApiField("business_local_name")
	private String businessLocalName;

	/**
	 * 企业名称
	 */
	@ApiField("business_name")
	private String businessName;

	/**
	 * logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * logo类型
	 */
	@ApiField("logo_type")
	private String logoType;

	/**
	 * mcc
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 地址
	 */
	@ApiField("operation_address")
	private TransferAddressInfo operationAddress;

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

	public TransferAddressInfo getOperationAddress() {
		return this.operationAddress;
	}
	public void setOperationAddress(TransferAddressInfo operationAddress) {
		this.operationAddress = operationAddress;
	}

}
