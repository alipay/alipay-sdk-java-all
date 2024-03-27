package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 短信发送接口
 *
 * @author auto create
 * @since 1.0, 2024-02-06 16:07:34
 */
public class AlipayCloudCloudpromoMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 7285113431178188523L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 接收短信的手机号码。手机号码格式：

国内短信：+/+86/0086/86或无任何前缀的11位手机号码，例如1590000****。
国际/港澳台消息：国际区号+号码，例如852000012****。
说明
验证码类型短信，建议使用接口SendSms单独发送。
	 */
	@ApiListField("phone_number")
	@ApiField("string")
	private List<String> phoneNumber;

	/**
	 * 无特殊需要可忽略此字段。
	 */
	@ApiListField("sms_up_extend_code")
	@ApiField("string")
	private List<String> smsUpExtendCode;

	/**
	 * 短信模板名称
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 短信模板变量对应的实际值。该数组中每个对象需和phone_number中的手机号一一对应。模板中的多个变量用 "#" 区分；"="左边为变量名，"="右边为变量值。 当前字段已废弃(拼接有缺陷，调整为json string 参数)
	 */
	@ApiListField("template_param")
	@ApiField("string")
	@Deprecated
	private List<String> templateParam;

	/**
	 * 短信模板变量对应的实际值。
	 */
	@ApiField("template_param_json")
	private String templateParamJson;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<String> getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<String> getSmsUpExtendCode() {
		return this.smsUpExtendCode;
	}
	public void setSmsUpExtendCode(List<String> smsUpExtendCode) {
		this.smsUpExtendCode = smsUpExtendCode;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public List<String> getTemplateParam() {
		return this.templateParam;
	}
	public void setTemplateParam(List<String> templateParam) {
		this.templateParam = templateParam;
	}

	public String getTemplateParamJson() {
		return this.templateParamJson;
	}
	public void setTemplateParamJson(String templateParamJson) {
		this.templateParamJson = templateParamJson;
	}

}
