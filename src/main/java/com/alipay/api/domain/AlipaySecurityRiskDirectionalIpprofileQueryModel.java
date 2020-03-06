package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * “蚁盾”智能IP检测服务（定向接口）
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:07:03
 */
public class AlipaySecurityRiskDirectionalIpprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5837676452361633227L;

	/**
	 * 身份证号码，非必填参数，用于查询"身份证持有人使用当前IP的概率"属性
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * IP地址，IP检测服务接口主键，必填
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/**
	 * 手机号码，非必填参数,用于用户更多维度的识别，如"手机号持有人使用当前IP的概率"属性等
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
