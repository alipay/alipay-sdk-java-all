package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫短信发送
 *
 * @author auto create
 * @since 1.0, 2026-03-05 16:22:43
 */
public class AlipayCommerceMedicalHdfSmsSendModel extends AlipayObject {

	private static final long serialVersionUID = 3276299726728149197L;

	/**
	 * 短信平台的appid
	 */
	@ApiField("sms_app_id")
	private String smsAppId;

	/**
	 * 短信模版参数
	 */
	@ApiField("template_args_str")
	private String templateArgsStr;

	/**
	 * 短信平台创建的模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 调用方传入的消息id
	 */
	@ApiField("third_msg_id")
	private String thirdMsgId;

	/**
	 * 手机号码
	 */
	@ApiField("to_account_no")
	private String toAccountNo;

	public String getSmsAppId() {
		return this.smsAppId;
	}
	public void setSmsAppId(String smsAppId) {
		this.smsAppId = smsAppId;
	}

	public String getTemplateArgsStr() {
		return this.templateArgsStr;
	}
	public void setTemplateArgsStr(String templateArgsStr) {
		this.templateArgsStr = templateArgsStr;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getThirdMsgId() {
		return this.thirdMsgId;
	}
	public void setThirdMsgId(String thirdMsgId) {
		this.thirdMsgId = thirdMsgId;
	}

	public String getToAccountNo() {
		return this.toAccountNo;
	}
	public void setToAccountNo(String toAccountNo) {
		this.toAccountNo = toAccountNo;
	}

}
