package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方券码解密接口
 *
 * @author auto create
 * @since 1.0, 2024-05-13 14:39:15
 */
public class AntfortuneMarketingEquitycodeDiscryptGetModel extends AlipayObject {

	private static final long serialVersionUID = 8832557298517818959L;

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
