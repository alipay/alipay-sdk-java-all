package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报案人信息
 *
 * @author auto create
 * @since 1.0, 2018-04-12 16:01:02
 */
public class Informant extends AlipayObject {

	private static final long serialVersionUID = 5391785178511213987L;

	/**
	 * 姓名，须与证件上名称一致
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 报案人证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，特殊可选，该字段需和证件号、名称同时有值或同时为空
枚举：
IDENTITY_CARD：身份证

备注：目前仅支持身份证类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
