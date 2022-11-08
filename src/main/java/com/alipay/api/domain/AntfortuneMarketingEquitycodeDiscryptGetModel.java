package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方券码解密接口
 *
 * @author auto create
 * @since 1.0, 2022-04-20 09:55:13
 */
public class AntfortuneMarketingEquitycodeDiscryptGetModel extends AlipayObject {

	private static final long serialVersionUID = 7855956484134329162L;

	/**
	 * 加密后的券码
	 */
	@ApiField("encrypted_code")
	private String encryptedCode;

	/**
	 * 来源，每个接入的第三方都会有一个来源号
	 */
	@ApiField("source")
	private String source;

	public String getEncryptedCode() {
		return this.encryptedCode;
	}
	public void setEncryptedCode(String encryptedCode) {
		this.encryptedCode = encryptedCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
