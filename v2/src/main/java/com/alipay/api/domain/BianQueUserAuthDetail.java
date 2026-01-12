package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于返回用户信息（姓名、证件号码、证件类型、手机号）
 *
 * @author auto create
 * @since 1.0, 2025-11-17 16:02:47
 */
public class BianQueUserAuthDetail extends AlipayObject {

	private static final long serialVersionUID = 2359121233291134863L;

	/**
	 * 用户证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户电话号码
	 */
	@ApiField("phone_number")
	private String phoneNumber;

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

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
