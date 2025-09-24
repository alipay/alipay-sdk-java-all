package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.policy.captcha.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-17 10:44:35
 */
public class AlipaySecurityRiskPolicyCaptchaCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4133162924139529823L;

	/** 
	 * 处置动作
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 对于业务夹带链路的咨询阶段，二次验证配置，业务前端需要消费该配置，调用captcha sdk的js api唤起验证码页面
	 */
	@ApiField("captcha_config")
	private String captchaConfig;

	/** 
	 * traceid，用于问题排查
	 */
	@ApiField("trace")
	private String trace;

	public void setAction(String action) {
		this.action = action;
	}
	public String getAction( ) {
		return this.action;
	}

	public void setCaptchaConfig(String captchaConfig) {
		this.captchaConfig = captchaConfig;
	}
	public String getCaptchaConfig( ) {
		return this.captchaConfig;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}
	public String getTrace( ) {
		return this.trace;
	}

}
