package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询理赔结果
 *
 * @author auto create
 * @since 1.0, 2026-03-17 16:57:44
 */
public class AlipayCommerceMedicalInsuranceClaimQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4212391591539892766L;

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
