package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份核验服务结果校验接口
 *
 * @author auto create
 * @since 1.0, 2017-06-12 15:26:04
 */
public class AlipaySecurityRiskVerifyidentityIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 5748574151445165392L;

	/**
	 * 调用业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用于核身校验的数据
	 */
	@ApiField("identify_data")
	private String identifyData;

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

	public String getIdentifyData() {
		return this.identifyData;
	}
	public void setIdentifyData(String identifyData) {
		this.identifyData = identifyData;
	}

	public String getVerifyToken() {
		return this.verifyToken;
	}
	public void setVerifyToken(String verifyToken) {
		this.verifyToken = verifyToken;
	}

}
