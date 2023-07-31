package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营SaaS平台发送短信验证码
 *
 * @author auto create
 * @since 1.0, 2023-06-26 17:43:20
 */
public class DatadigitalFincloudFinsaasSmsCodeSendModel extends AlipayObject {

	private static final long serialVersionUID = 8739828754865974567L;

	/**
	 * 手机号密文，SM4加密
	 */
	@ApiField("phone_num_encrypt")
	private String phoneNumEncrypt;

	public String getPhoneNumEncrypt() {
		return this.phoneNumEncrypt;
	}
	public void setPhoneNumEncrypt(String phoneNumEncrypt) {
		this.phoneNumEncrypt = phoneNumEncrypt;
	}

}
