package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC服务机返回内容
 *
 * @author auto create
 * @since 1.0, 2024-05-07 16:01:16
 */
public class NfcFWJCommonResult extends AlipayObject {

	private static final long serialVersionUID = 5582598818611989741L;

	/**
	 * NFC烧录URL
	 */
	@ApiField("scheme")
	private String scheme;

	/**
	 * 授权码
	 */
	@ApiField("uni_code")
	private String uniCode;

	public String getScheme() {
		return this.scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getUniCode() {
		return this.uniCode;
	}
	public void setUniCode(String uniCode) {
		this.uniCode = uniCode;
	}

}
