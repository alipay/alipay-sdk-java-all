package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城服用户消息查询
 *
 * @author auto create
 * @since 1.0, 2024-05-29 10:48:51
 */
public class AlipayEcoCityserviceMessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1824337782447276187L;

	/**
	 * 传入值为支付宝uid； 机构配置传入类型为支付宝uid时，必填； alipay_user_id优先级高于(certificate_number/certificate_username) 和 mobile，若不为空则以alipay_user_id为准作为用户身份
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 证件号码. 机构配置用户信息为 身份证+姓名或者身份证时，且未传入 alipay_user_id时必填 该字段为敏感字段，须做md5或sm3处理后传输。示例中值的明文为310101198011110010.
	 */
	@ApiField("certificate_number")
	private String certificateNumber;

	/**
	 * 证件类型 01标识身份证
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 证件用户名字. 机构配置用户信息为证件号+证件姓名且alipay_user_id为空时必填
	 */
	@ApiField("certificate_username")
	private String certificateUsername;

	/**
	 * 加密类型：md5,sm3.
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 机构配置用户信息为 手机号时，且未传入 alipay_user_id时必填
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * certificate_type/certificate_number/用户名字) 或者 open_id 必须有一个不为空。两个都不为空则以open_id为准
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构已发送的消息唯一编号(APPID下唯一)。
	 */
	@ApiField("uuid")
	private String uuid;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateUsername() {
		return this.certificateUsername;
	}
	public void setCertificateUsername(String certificateUsername) {
		this.certificateUsername = certificateUsername;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
