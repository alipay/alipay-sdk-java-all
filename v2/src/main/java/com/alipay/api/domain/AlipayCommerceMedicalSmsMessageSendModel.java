package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福开放平台短信发送
 *
 * @author auto create
 * @since 1.0, 2026-04-27 10:52:49
 */
public class AlipayCommerceMedicalSmsMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 5262268332825962161L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 唯一id
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 短信模版code
	 */
	@ApiField("template")
	private String template;

	/**
	 * 模版参数
	 */
	@ApiField("template_param")
	private String templateParam;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTemplate() {
		return this.template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}

	public String getTemplateParam() {
		return this.templateParam;
	}
	public void setTemplateParam(String templateParam) {
		this.templateParam = templateParam;
	}

}
