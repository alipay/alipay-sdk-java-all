package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蓝鉴AI行为验证码服务端校验接口
 *
 * @author auto create
 * @since 1.0, 2025-07-17 10:44:35
 */
public class AlipaySecurityRiskPolicyCaptchaCheckModel extends AlipayObject {

	private static final long serialVersionUID = 2119832143464633672L;

	/**
	 * 用来串联一次业务请求下，多个验证码id的串联流水号
	 */
	@ApiField("captcha_bizno")
	private String captchaBizno;

	/**
	 * 业务场景id
	 */
	@ApiField("captcha_id")
	private String captchaId;

	/**
	 * 默认值为空，代表验证码token校验请求，如果是咨询阶段传CONSULT
	 */
	@ApiField("captcha_scene")
	private String captchaScene;

	/**
	 * 验证码验证通过的凭证，json字符串，通过captchasdk获取之后，透传给业务服务端，业务服务端再传给验证码服务端
	 */
	@ApiField("captcha_token")
	private String captchaToken;

	/**
	 * 业务前端通过调用验证码sdk提供的getRiskData接口获取的咨询数据，格式是一个json字符串，需要透传到业务服务端，业务服务端再透传给行为验证服务端；如果是token校验请求，这个字段为空
	 */
	@ApiField("consult_data")
	private String consultData;

	/**
	 * 额外的防控参数，例如手机号、设备号等信息，map<string,object>经过json encode之后的json字符串
	 */
	@ApiField("extra_data")
	private String extraData;

	public String getCaptchaBizno() {
		return this.captchaBizno;
	}
	public void setCaptchaBizno(String captchaBizno) {
		this.captchaBizno = captchaBizno;
	}

	public String getCaptchaId() {
		return this.captchaId;
	}
	public void setCaptchaId(String captchaId) {
		this.captchaId = captchaId;
	}

	public String getCaptchaScene() {
		return this.captchaScene;
	}
	public void setCaptchaScene(String captchaScene) {
		this.captchaScene = captchaScene;
	}

	public String getCaptchaToken() {
		return this.captchaToken;
	}
	public void setCaptchaToken(String captchaToken) {
		this.captchaToken = captchaToken;
	}

	public String getConsultData() {
		return this.consultData;
	}
	public void setConsultData(String consultData) {
		this.consultData = consultData;
	}

	public String getExtraData() {
		return this.extraData;
	}
	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

}
