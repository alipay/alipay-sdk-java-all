package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 登陆表单元素kv
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:05
 */
public class LoginForm extends AlipayObject {

	private static final long serialVersionUID = 2814483936719366562L;

	/**
	 * 图片验证码
	 */
	@ApiField("captcha")
	private String captcha;

	/**
	 * 身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 查询密码
	 */
	@ApiField("query_password")
	private String queryPassword;

	/**
	 * 服务密码
	 */
	@ApiField("service_password")
	private String servicePassword;

	/**
	 * 短信验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	/**
	 * 吉林电信短信验证码
	 */
	@ApiField("sms_code_jldx")
	private String smsCodeJldx;

	public String getCaptcha() {
		return this.captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getQueryPassword() {
		return this.queryPassword;
	}
	public void setQueryPassword(String queryPassword) {
		this.queryPassword = queryPassword;
	}

	public String getServicePassword() {
		return this.servicePassword;
	}
	public void setServicePassword(String servicePassword) {
		this.servicePassword = servicePassword;
	}

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getSmsCodeJldx() {
		return this.smsCodeJldx;
	}
	public void setSmsCodeJldx(String smsCodeJldx) {
		this.smsCodeJldx = smsCodeJldx;
	}

}
