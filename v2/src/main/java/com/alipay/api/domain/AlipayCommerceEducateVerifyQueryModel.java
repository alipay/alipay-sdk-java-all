package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 苹果查询验证结果接口
 *
 * @author auto create
 * @since 1.0, 2026-04-18 12:21:30
 */
public class AlipayCommerceEducateVerifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4429269724338955842L;

	/**
	 * 用于标识一个完整请求，一个完整请求：查询链接-验证身份-完成验证
	 */
	@ApiField("verify_request_id")
	private String verifyRequestId;

	public String getVerifyRequestId() {
		return this.verifyRequestId;
	}
	public void setVerifyRequestId(String verifyRequestId) {
		this.verifyRequestId = verifyRequestId;
	}

}
