package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交通银行数字人民币发放接口
 *
 * @author auto create
 * @since 1.0, 2023-06-25 10:33:01
 */
public class DatadigitalFincloudFinsaasBcmDigitalrmbSendModel extends AlipayObject {

	private static final long serialVersionUID = 6121448331619168474L;

	/**
	 * 手机号密文
	 */
	@ApiField("phone_num_encrypt")
	private String phoneNumEncrypt;

	/**
	 * 短信验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	/**
	 * 广告投放页链接
	 */
	@ApiField("web_page_url")
	private String webPageUrl;

	public String getPhoneNumEncrypt() {
		return this.phoneNumEncrypt;
	}
	public void setPhoneNumEncrypt(String phoneNumEncrypt) {
		this.phoneNumEncrypt = phoneNumEncrypt;
	}

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getWebPageUrl() {
		return this.webPageUrl;
	}
	public void setWebPageUrl(String webPageUrl) {
		this.webPageUrl = webPageUrl;
	}

}
