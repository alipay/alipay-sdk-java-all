package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成医保局个人信息授权用户Token
 *
 * @author auto create
 * @since 1.0, 2026-03-17 16:57:44
 */
public class AlipayCommerceMedicalInsuranceAuthtokenGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 5457181958838671411L;

	/**
	 * 加密入参
	 */
	@ApiField("encrypt_request")
	private EncryptRequest encryptRequest;

	public EncryptRequest getEncryptRequest() {
		return this.encryptRequest;
	}
	public void setEncryptRequest(EncryptRequest encryptRequest) {
		this.encryptRequest = encryptRequest;
	}

}
