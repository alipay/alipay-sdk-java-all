package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝开放认证查询
 *
 * @author auto create
 * @since 1.0, 2021-12-16 18:44:30
 */
public class AlipayUserCertifyOpenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7556745356258944454L;

	/**
	 * 本次申请操作的唯一标识，通过alipay.user.certify.open.initialize(身份认证初始化服务)接口同步响应获取。
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
