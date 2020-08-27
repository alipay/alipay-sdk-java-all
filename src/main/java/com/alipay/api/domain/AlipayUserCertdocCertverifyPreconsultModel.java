package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实名证件信息比对验证预咨询
 *
 * @author auto create
 * @since 1.0, 2020-08-17 10:17:09
 */
public class AlipayUserCertdocCertverifyPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 6697597671116814412L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，例如：
IDENTITY_CARD — 身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 拓展字段,JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 登录名
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名
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
