package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * “蚁盾”智能IP检测服务
 *
 * @author auto create
 * @since 1.0, 2016-07-19 19:34:28
 */
public class AlipaySecurityRiskIpprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1559724343149413752L;

	/**
	 * 身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * IP地址
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/**
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
