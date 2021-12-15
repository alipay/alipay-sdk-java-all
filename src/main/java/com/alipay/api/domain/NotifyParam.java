package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交聊天，消息内带push提醒的push信息模型
 *
 * @author auto create
 * @since 1.0, 2020-06-08 15:46:26
 */
public class NotifyParam extends AlipayObject {

	private static final long serialVersionUID = 2392311172477698679L;

	/**
	 * 消息push的内容，根据serviceCode对应的模版中的key进行值替换模版中的具体文案，格式为Map<String, String>转json
	 */
	@ApiField("params")
	private String params;

	/**
	 * 消息push是否自动带出发消息者的个性化名称，个性化名称获取顺序为备注名>群昵称>全局昵称
	 */
	@ApiField("personal_name")
	private Boolean personalName;

	/**
	 * 消息push是否有短信类通知
	 */
	@ApiField("send_sms")
	private Boolean sendSms;

	/**
	 * 消息push的serviceCode，一个serviceCode在push平台对应一个模版，业务接入时如果要发非默认模版的push，需要自行申请，如果想发默认模版，请传：
C2C：MOBILE_CHAT_NOTIFY_N
C2B：MOBILE_CHAT_BC_TO_M_NOTIFY_N
B2C：MOBILE_CHAT_BC_TO_C_NOTIFY_N
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public Boolean getPersonalName() {
		return this.personalName;
	}
	public void setPersonalName(Boolean personalName) {
		this.personalName = personalName;
	}

	public Boolean getSendSms() {
		return this.sendSms;
	}
	public void setSendSms(Boolean sendSms) {
		this.sendSms = sendSms;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
