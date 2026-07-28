package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招行退款数据查询
 *
 * @author auto create
 * @since 1.0, 2026-07-24 15:37:55
 */
public class AlipayCommerceMedicalInsuranceClaimrefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1773475648664894435L;

	/**
	 * 请求体
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
