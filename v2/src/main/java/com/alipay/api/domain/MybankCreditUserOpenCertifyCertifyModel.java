package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份认证开始认证
 *
 * @author auto create
 * @since 1.0, 2023-08-10 10:22:38
 */
public class MybankCreditUserOpenCertifyCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 6454526945176634371L;

	/**
	 * 本次申请操作的唯一标识，由开放认证初始化接口调用后生成，后续的操作都需要用到
	 */
	@ApiField("certify_id")
	private String certifyId;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

}
