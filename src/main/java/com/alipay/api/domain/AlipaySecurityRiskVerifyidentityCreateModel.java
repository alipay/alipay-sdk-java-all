package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份核验服务创建核验接口
 *
 * @author auto create
 * @since 1.0, 2017-06-15 11:18:08
 */
public class AlipaySecurityRiskVerifyidentityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6331175587132992821L;

	/**
	 * 调用业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 核身校验token
	 */
	@ApiField("verify_token")
	private String verifyToken;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getVerifyToken() {
		return this.verifyToken;
	}
	public void setVerifyToken(String verifyToken) {
		this.verifyToken = verifyToken;
	}

}
