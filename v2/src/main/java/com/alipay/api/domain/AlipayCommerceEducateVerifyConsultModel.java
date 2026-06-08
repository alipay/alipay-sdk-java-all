package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 苹果查询链接接口
 *
 * @author auto create
 * @since 1.0, 2026-04-29 13:15:24
 */
public class AlipayCommerceEducateVerifyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1466515898951376366L;

	/**
	 * 用于传递此次验证的基本信息
	 */
	@ApiField("verify_info")
	private VerifyOrderInfo verifyInfo;

	/**
	 * 用于标识一个完整请求，一个完整请求：查询链接-验证身份-完成验证
	 */
	@ApiField("verify_request_id")
	private String verifyRequestId;

	public VerifyOrderInfo getVerifyInfo() {
		return this.verifyInfo;
	}
	public void setVerifyInfo(VerifyOrderInfo verifyInfo) {
		this.verifyInfo = verifyInfo;
	}

	public String getVerifyRequestId() {
		return this.verifyRequestId;
	}
	public void setVerifyRequestId(String verifyRequestId) {
		this.verifyRequestId = verifyRequestId;
	}

}
