package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营SaaS平台发送短信验证码
 *
 * @author auto create
 * @since 1.0, 2023-11-03 15:12:20
 */
public class DatadigitalFincloudFinsaasSmsCodeSendModel extends AlipayObject {

	private static final long serialVersionUID = 1849884178318196328L;

	/**
	 * 手机号密文，SM4加密
	 */
	@ApiField("phone_num_encrypt")
	private String phoneNumEncrypt;

	/**
	 * 短信发送场景
	 */
	@ApiField("scene")
	private String scene;

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

}
