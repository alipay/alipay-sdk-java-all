package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实名证件信息比对验证预咨询
 *
 * @author auto create
 * @since 1.0, 2022-10-25 20:37:13
 */
public class AlipayUserCertdocCertverifyPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 7692135219465711223L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。暂仅支持 IDENTITY_CARD （身份证）。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 拓展字段,JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 支付宝登录名
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 真实姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
