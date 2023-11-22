package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营SaaS平台校验短信验证码
 *
 * @author auto create
 * @since 1.0, 2023-11-03 13:40:59
 */
public class DatadigitalFincloudFinsaasSmsCodeVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7838177949984253168L;

	/**
	 * 手机号加密字段
	 */
	@ApiField("phone_num_encrypt")
	private String phoneNumEncrypt;

	/**
	 * 场景信息
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 手机验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	public String getPhoneNumEncrypt() {
		return this.phoneNumEncrypt;
	}
	public void setPhoneNumEncrypt(String phoneNumEncrypt) {
		this.phoneNumEncrypt = phoneNumEncrypt;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

}
