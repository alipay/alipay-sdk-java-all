package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户身份参数
 *
 * @author auto create
 * @since 1.0, 2021-10-14 10:55:37
 */
public class MerchantIdentityParams extends AlipayObject {

	private static final long serialVersionUID = 2639128968564138226L;

	/**
	 * 证件号码，必填，填写需要验证的证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，必填，当前支持身份证，必须传入IDENTITY_CARD
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 商户支付宝收款账号
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 商户收款账号类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 收款账号真实姓名，必填，填写需要验证的真实姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 间连场景填写商户收单smid
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 间联商户smid进件的sourcePid。如果该字段非空，优先以该字段做smid的水平鉴权；如果该字段为空，则以接口调用方PID做smid的水平鉴权。
	 */
	@ApiField("smid_source_pid")
	private String smidSourcePid;

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

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSmidSourcePid() {
		return this.smidSourcePid;
	}
	public void setSmidSourcePid(String smidSourcePid) {
		this.smidSourcePid = smidSourcePid;
	}

}
