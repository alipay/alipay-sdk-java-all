package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核身平台渲染/校验接口
 *
 * @author auto create
 * @since 1.0, 2017-07-19 11:26:40
 */
public class AlipaySecurityRiskVerifyidentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4653389844127623622L;

	/**
	 * 渲染数据时，可以不用传；校验结果时，必须传过来
	 */
	@ApiField("action")
	private String action;

	/**
	 * 核身校验数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 核身token
	 */
	@ApiField("mic_token")
	private String micToken;

	/**
	 * 核身产品
	 */
	@ApiField("module")
	private String module;

	/**
	 * 核身vid
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getMicToken() {
		return this.micToken;
	}
	public void setMicToken(String micToken) {
		this.micToken = micToken;
	}

	public String getModule() {
		return this.module;
	}
	public void setModule(String module) {
		this.module = module;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
