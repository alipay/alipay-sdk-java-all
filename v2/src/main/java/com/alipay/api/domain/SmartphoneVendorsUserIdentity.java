package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机厂商用户唯一标识
 *
 * @author auto create
 * @since 1.0, 2026-07-06 17:31:59
 */
public class SmartphoneVendorsUserIdentity extends AlipayObject {

	private static final long serialVersionUID = 8143537221823295812L;

	/**
	 * 手机厂商用户标识
	 */
	@ApiField("user_identification")
	private String userIdentification;

	/**
	 * 用于区分传入用户身份标识类型
	 */
	@ApiField("vendor_id_type")
	private String vendorIdType;

	public String getUserIdentification() {
		return this.userIdentification;
	}
	public void setUserIdentification(String userIdentification) {
		this.userIdentification = userIdentification;
	}

	public String getVendorIdType() {
		return this.vendorIdType;
	}
	public void setVendorIdType(String vendorIdType) {
		this.vendorIdType = vendorIdType;
	}

}
